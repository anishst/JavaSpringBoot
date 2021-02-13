# https://spring.io/guides/gs/spring-boot-docker/

#
# Build stage
#
FROM maven:3.6.0-jdk-11-slim AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package

# this can be used when jar already exists in build folder
# FROM openjdk:8-jdk-alpine
# ARG JAR_FILE=target/*.jar
# COPY ${JAR_FILE} app.jar
# ENTRYPOINT ["java","-jar","/app.jar"]

#
# Package stage
#
FROM openjdk:11-jre-slim
COPY --from=build /home/app/target/JavaSpringBoot-0.0.1-SNAPSHOT.jar /usr/local/lib/app.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","/usr/local/lib/app.jar"]
# Java Spring Boot

![example workflow](https://github.com/anishst/JavaSpringBoot/actions/workflows/maven.yml/badge.svg)

Basic [Java Spring Boot](https://spring.io/projects/spring-boot) application

## How to Run locally

1. use IDE or use command: ```mvnw spring-boot:run``` from project root

**NOTE:** port currently set to 8081 in: ```src/main/resources/application.properties```

## How to run in Docker
1. build image: ```docker build -t myspringboot .```
2. run app: ```docker run -p 8080:8081 myspringboot```

## Run Tests

- run REST API Tests only: ```mvn test -Dtest=RestAPITest```
- run Cucumber tests: ```mvn test```
## To Do

- [x] [setup IntelliJ IDE](https://www.youtube.com/watch?v=H_XxH66lm3U&t=84s)
- [x] create a basic application using [spring initializer](https://start.spring.io/)
  - [Video Example](https://www.youtube.com/watch?v=df7Dso9q700&t=565s)
- [x] add basic junit tests
- [ ] add cucumber tests/reports
  - [x] Install Cucumber plugin in Idea IDE
  - [ ] create test runner
- [x] add selenium tests
- [x] [Dockerize app](https://spring.io/guides/gs/spring-boot-docker/)
- [ ] use Jenkinsfile
- [ ] Jmeter tests
- [ ] solve issue with mvn test not picking up cucumber tests
- [ ] add github actions
## Dependency Injection
- [Spring IOC Container](https://docs.spring.io/spring-framework/docs/3.1.x/spring-framework-reference/html/beans.html)
  - @Autowired

## Resources

- https://stackoverflow.com/questions/27767264/how-to-dockerize-maven-project-and-how-many-ways-to-accomplish-it
- https://www.youtube.com/watch?v=HaGeSq-SB9E
- idea plugins for cucumber : https://www.jetbrains.com/help/idea/testing-frameworks.html
- [Serving Web Content](https://spring.io/guides/gs/serving-web-content/)
- Testing
  - [Testing Web](https://spring.io/guides/gs/testing-web/)
  - [How to Test a Spring Boot Application](https://stackabuse.com/how-to-test-a-spring-boot-application/)
- cucumber spring boot repos:
  - [guide](https://medium.com/@kanhu.aum/spring-boot-cucumber-bdd-c077666c9c68)
  - [cucum sald](https://github.com/danieldestro/cucumber-salad)
  - [examp](https://github.com/cucumber/cucumber-jvm/tree/main/examples/java-calculator-testng)
- Video Series
  - [EA - Spring Boot Testing ](https://www.youtube.com/watch?v=cG6ZLiRxn1M&list=PL6tu16kXT9PrDr6kMGQ-CgnvCsFxrq1eS)
    - [Github](https://github.com/executeautomation/SpringBootSelenium)
# Java Spring Boot

[![example workflow](https://github.com/anishst/JavaSpringBoot/actions/workflows/maven.yml/badge.svg)](https://github.com/anishst/JavaSpringBoot/actions)

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
- [x] add github actions
- [ ] use GitHub Webhooks
- [x] added webdriver manager for managing driver instances: https://github.com/bonigarcia/webdrivermanager

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


#### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.3.5.RELEASE/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.3.5.RELEASE/maven-plugin/reference/html/#build-image)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.3.5.RELEASE/reference/htmlsingle/#using-boot-devtools)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.3.5.RELEASE/reference/htmlsingle/#boot-features-developing-web-applications)

#### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)

#### Report Options
- [cucumber-reporting](https://github.com/damianszczepanik/cucumber-reporting) plugin

#### Video Tutorials

- [Javan Cucumber Video Series](https://www.youtube.com/watch?v=4e9vhX7ZuCw&t=1697s)

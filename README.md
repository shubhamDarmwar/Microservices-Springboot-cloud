# Microservices with Spring Boot and Cloud

This repository contains the implementation of a microservices architecture using Spring Boot and various Spring Cloud components. Microservices architecture allows the development of an application as a collection of loosely coupled, independently deployable services that communicate with each other.

## Concepts Covered

1. **Spring Boot**: 
   - Spring Boot is used to create stand-alone, production-grade Spring-based applications. It simplifies the bootstrapping and development of new Spring applications.

2. **Spring Cloud**:
   - Spring Cloud provides tools for developers to quickly build some of the common patterns in distributed systems (e.g., configuration management, service discovery, circuit breakers, intelligent routing, leadership election, distributed sessions, etc.).

3. **Eureka Server**:
   - Eureka Server from Netflix OSS is used for service discovery. It allows microservices to register themselves at runtime as they come up, and other microservices to discover them.

4. **API Gateway**:
   - API Gateway is implemented using Spring Cloud Gateway. It handles all the requests and routes them to the appropriate microservice based on the URL pattern.

5. **Spring Data JPA**:
   - This is used for data persistence in microservices. It provides a common interface to interact with different kinds of databases through repositories.

6. **Spring Boot Starter Web**:
   - This is used to build web, including RESTful, applications using Spring MVC. It uses Tomcat as the default embedded container.

7. **MySQL Database**:
   - MySQL is used as the database for data persistence in the microservices.

## Getting Started
1. Clone the repository:
    ```bash
    git clone https://github.com/shubhamDarmwar/Microservices-Springboot-cloud.git
    ```
2. Navigate to the project directory:
    ```bash
    cd Microservices-Springboot-cloud
    ```
3. Open the individual microservice projects to explore the implementation and examples.

## Prerequisites
- Java 8 or higher
- Spring Boot
- Spring Cloud
- Maven or Gradle

## Installation
You can build and run the microservices using Maven or Gradle. For example, using Maven:
```bash
mvn clean install
mvn spring-boot:run
```

## Usage
Each microservice can be started individually. Open a terminal and navigate to the microservice directory, then run the following command:
```bash
mvn spring-boot:run
```
Explore the microservices to see how they interact with each other using Spring Cloud components.

## Contributing
Contributions are welcome! Please fork the repository and submit a pull request for any improvements or bug fixes.

## License
This project does not have a license yet. Feel free to use the code as per your requirements.

## Author
[Shubham Darmwar](https://github.com/shubhamDarmwar)

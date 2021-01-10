# E-Commerce-Spring-Boot-Project

This is an almost full-structured project implements e-commerce services written in Spring Boot framework. 

## Running project locally
```
git clone https://github.com/aykhangaffarov/E-Commerce-Spring-Boot-Project.git
cd E-Commerce-Spring-Boot-Project
./mvnw package
java -jar target/*.jar
```

# Database Configuration
In its default configuration, Petclinic uses PostgreSQL. We have to configure PostgreSQL credentials in application.properties file in src/main/resources path:
```
spring.datasource.driver-class-name=org.postgresql.Driver
spring.datasource.url=jdbc:postgresql://localhost:5432/onlineordering
spring.datasource.username=postgres
spring.datasource.password=12345
```
In my case, username and password for pgAdmin server was postgres and 12345.


# Paypal Configuration 
In order to use payments functionalities, it is essential to open an account in Paypal. Then, we can configure our Paypal account for payments by using our client id and secret id in application.properties file.
```
#Paypal #write your credentials in your PayPal Account
paypal.mode=sandbox
paypal.client.id={ID}
paypal.client.secret={SecretID}
```

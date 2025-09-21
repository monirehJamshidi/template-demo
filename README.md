## English 🌍

[🇮🇷 فارسی](./README.fa.md) | [🇩🇪 Deutsch](./README.de.md)

### 📌 Template Demo – Spring Boot + Java 21 String Template Expressions
This project demonstrates the use of Java 21 String Template Expressions (Preview Feature) in a Spring Boot REST API.
It shows how to build JSON responses and log messages with string interpolation.

### 🚀 Features
- Spring Boot 3.x + Java 21

- REST API endpoint with query parameters

- Uses STR template processor

- Logging with String Template Expressions

- Returns JSON response

### ⚡ Example Usage

Request:
http://localhost:8080/user?name=Monire&age=30

Response:

{
"name": "Monire",
"age": 30,
"message": "Welcome Monire, you are 30 years old!"
}


Log:

INFO  ... Generating response for user Monire with age 30


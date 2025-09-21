## Deutsch 🇩🇪

[🇮🇷 فارسی](./README.fa.md) | [🇬🇧 English](./README.md)

### 📌 Template Demo – Spring Boot + String Template Expressions in Java 21

Dieses Projekt zeigt die Verwendung von Java 21 String Template Expressions (Preview Feature) in einer Spring Boot REST API.
Es demonstriert, wie man JSON-Antworten und Log-Nachrichten mit String-Interpolation erstellt.

### 🚀 Funktionen
- Spring Boot 3.x + Java 21

- REST API mit Query-Parametern

- Verwendung von STR als Template Processor

- Logging mit String Templates

-JSON-Antwort zurückgeben

### ⚡ Beispiel
Anfrage:

http://localhost:8080/user?name=Monire&age=30


Antwort:

{
"name": "Monire",
"age": 30,
"message": "Welcome Monire, you are 30 years old!"
}


Log:

INFO  ... Generating response for user Monire with age 30

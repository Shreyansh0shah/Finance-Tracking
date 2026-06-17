# Finance Tracking System

A secure REST-based Finance Tracking System built using Spring Boot that helps users manage income and expenses, track financial transactions, and maintain records efficiently.

## Features

* User Registration and Authentication
* JWT-based Authentication and Authorization
* Secure API Access using Spring Security
* Income and Expense Management
* Transaction Categorization
* RESTful API Architecture
* Global Exception Handling
* Layered Architecture (Controller-Service-Repository)
* Database Persistence using Spring Data JPA

## Tech Stack

### Backend

* Java 23
* Spring Boot 4
* Spring Security
* Spring Data JPA
* Hibernate ORM
* JWT Authentication
* Maven

### Database

* H2 Database (Development)
* MySQL (Production Ready)

### Tools

* STS / Eclipse
* Git & GitHub
* Postman

## Project Structure

```text
src/main/java/com/library
│
├── controller
│   ├── AuthController
│   └── TransactionController
│
├── service
│   ├── AuthService
│   └── TransactionService
│
├── repository
│   ├── UserRepository
│   └── TransactionRepository
│
├── entity
│   ├── User
│   ├── Transaction
│   └── TransactionType
│
├── security
│   ├── JwtUtil
│   └── SecurityConfig
│
├── exception
│   └── GlobalExceptionHandler
│
└── FinanceTrackingApplication
```

## API Endpoints

### Authentication

| Method | Endpoint       | Description   |
| ------ | -------------- | ------------- |
| POST   | /auth/register | Register User |
| POST   | /auth/login    | Login User    |

### Transactions

| Method | Endpoint           | Description           |
| ------ | ------------------ | --------------------- |
| GET    | /transactions      | Get All Transactions  |
| GET    | /transactions/{id} | Get Transaction By ID |
| POST   | /transactions      | Add Transaction       |
| PUT    | /transactions/{id} | Update Transaction    |
| DELETE | /transactions/{id} | Delete Transaction    |

## How to Run

### Clone Repository

```bash
git clone https://github.com/Shreyansh0shah/Finance-Tracking.git
```

### Navigate to Project

```bash
cd Finance-Tracking
```

### Run Application

```bash
./mvnw spring-boot:run
```

Application starts on:

```text
http://localhost:8080
```

## Learning Outcomes

Through this project I gained practical experience in:

* Spring Boot Application Development
* REST API Design
* JWT Authentication
* Spring Security Configuration
* Database Design and ORM Mapping
* Exception Handling
* Maven Dependency Management
* Git Version Control
* Software Development Lifecycle (SDLC)

## Future Enhancements

* Dashboard Analytics
* Monthly Expense Reports
* Budget Planning Module
* Email Notifications
* Role-Based Access Control
* Docker Deployment

## Author

**Shreyansh Shah**

PG-DAC Certified Full Stack Developer

GitHub: https://github.com/Shreyansh0shah

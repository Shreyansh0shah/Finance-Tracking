# Finance Tracking System

## Tech stack
Java, Spring Boot, JPA (Hibernate), H2 (dev), JWT

## Features
- User registration & login (JWT)
- Add / list transactions
- Balance calculation
- Category-wise totals
- Validation & global exception handling

## Run locally
1. Configure `application.properties` (or use default H2)
2. `mvn spring-boot:run` or Run As → Spring Boot App
3. APIs:
   - POST /auth/register
   - POST /auth/login
   - POST /transactions
   - GET /transactions
   - GET /transactions/balance

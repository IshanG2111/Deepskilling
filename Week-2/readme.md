# Week 2

This week now contains a small Spring Boot REST application for library management.

## What it does
`Book` is a JPA entity, `BookRepository` persists it with Spring Data JPA, `BookService` wraps the data access, and `BookController` exposes REST endpoints.

## Run it
From the `Week-2` folder, run:

```powershell
mvn spring-boot:run
```

## Endpoints

```text
GET  /api/books
GET  /api/books/{id}
POST /api/books
```

The application starts with sample books loaded into the in-memory H2 database.

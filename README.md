[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/hzR4shVH)
# Lab: Spring Boot Configuration - REST API

## Goal
Extend the Library system with REST endpoints and explore Spring Boot configuration features including profiles and actuator.

## Learning Objectives
- Create REST controllers with Spring MVC
- Understand Spring Boot auto-configuration
- Configure application profiles (dev/prod)
- Enable Spring Boot Actuator for monitoring

## Pre-requisites
- Completed 2304-6-1 (Library system with Book entity and service)

## Tasks

### Task 1: Create Book Controller
Create `BookController.java` that exposes REST endpoints:

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /api/books | Get all books |
| GET | /api/books/{id} | Get book by ID |
| POST | /api/books | Add new book |
| PUT | /api/books/{id}/checkout | Checkout a book |
| PUT | /api/books/{id}/return | Return a book |

**Starter code provided**: See `starter_code/BookController.java`

### Task 2: Explore Auto-Configuration
1. Add `debug=true` to application.properties
2. Run application and find the "CONDITIONS EVALUATION REPORT"
3. Document which DataSource and JPA provider were configured

### Task 3: Configure Profiles
Create two profile-specific config files:

**application-dev.properties:**
- Enable H2 console
- Enable SQL logging
- Set DEBUG logging level

**application-prod.properties:**
- Disable H2 console
- Disable SQL logging
- Set WARN logging level

### Task 4: Add Spring Actuator
1. Add `spring-boot-starter-actuator` dependency
2. Configure exposed endpoints: health, info, metrics
3. Test the actuator endpoints

## Deliverables
1. Working BookController with all endpoints
2. Profile configuration files
3. Actuator endpoints accessible

## Verification
- [ ] GET /api/books returns list of books
- [ ] POST /api/books creates new book
- [ ] Profile switching works correctly
- [ ] Actuator health endpoint returns status UP

## Starter Code
See `starter_code/` directory

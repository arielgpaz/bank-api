Bank API
================

A Kotlin-based API for managing bank accounts, developed to learn and practice Kotlin. 

Implemented Resources
-------------------------

The following resources are implemented in this API:

## Accounts

* **Create**: `POST /accounts` - Create a new account.
* **Read**: `GET /accounts` - Retrieve a list of all accounts.
* **Read**: `GET /accounts/{id}` - Retrieve a single account by ID.
* **Update**: `PUT /accounts/{id}` - Update an existing account.
* **Delete**: `DELETE /accounts/{id}` - Delete an account.

Used Technologies
---------------------

This project uses the following technologies:

* **Kotlin**: A modern programming language for Android, backend, and desktop applications.
* **Spring Boot**: A popular framework for building web applications and microservices.
* **Spring Data JPA**: A framework for simplifying database access and manipulation.
* **Hibernate**: An ORM (Object-Relational Mapping) tool for mapping Java objects to database tables.
* **JUnit**: A unit testing framework for Java applications.

Project Structure
---------------------

The project is structured as follows:

* `com.agpaz.bankapi`: The main package for the API.
* `controller`: Contains the REST controllers for handling HTTP requests.
* `model`: Contains the data models for the API, including the `Account` class.
* `repository`: Contains the interface for interacting with the database.
* `service`: Contains the business logic for the API, including the `AccountService` class.

Getting Started
-------------------

To run the project, follow these steps:

1. Clone the repository to your local machine.
2. Install the required dependencies using Maven.
3. Start the application using the `main` method in `BankApiApplication.kt`.
4. Use a tool like Postman or cURL to test the API endpoints.

Note: This is just a sample README.md, and you should customize it to fit your specific project needs.
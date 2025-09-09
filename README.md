Robust RESTful API built with Spring Boot for a personal journaling application. It allows users to create, view, update, and delete their journal entries.

***

### 🛠️ Technologies Used

* **Java 17**: The core programming language.
* **Spring Boot**: The framework for building the application.
* **Spring Data JPA**: For database interaction and persistence.
* **MongoDB**: The NoSQL database for storing journal entries.
* **Maven**: Dependency management and build tool.
* **Lombok**: Reduces boilerplate code (e.g., getters, setters).

***

### 📂 API Endpoints

The API exposes the following endpoints for managing journal entries:

| Method | Endpoint | Description |
| :--- | :--- | :--- |
| `GET` | `/journal` | Retrieves all journal entries. |
| `GET` | `/journal/{id}` | Retrieves a single journal entry by its unique ID. |
| `POST` | `/journal` | Creates a new journal entry. |
| `PUT` | `/journal/{id}` | Updates an existing journal entry by its ID. |
| `DELETE` | `/journal/{id}` | Deletes a journal entry by its ID. |


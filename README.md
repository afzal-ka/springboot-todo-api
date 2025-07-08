# 📝 To-Do List REST API

A simple backend-only RESTful To-Do List API built with **Spring Boot**.  
Supports full CRUD operations with an in-memory H2 database and auto-generated API documentation using Swagger UI.

---

## 🚀 Features

- Create, update, delete, and view tasks
- Input validation
- In-memory H2 database
- Global exception handling
- API documentation with Swagger (springdoc-openapi)

---

## 🛠 Tech Stack

- Java 17+
- Spring Boot 3.x
- Spring Web
- Spring Data JPA
- H2 Database
- Springdoc OpenAPI (Swagger UI)

---

## 🔗 API Endpoints

| Method | Endpoint           | Description           |
|--------|--------------------|-----------------------|
| GET    | `/api/tasks`       | Get all tasks         |
| POST   | `/api/tasks`       | Create a new task     |
| PUT    | `/api/tasks/{id}`  | Update existing task  |
| DELETE | `/api/tasks/{id}`  | Delete a task         |

---

## ▶️ Run Locally

```bash
git clone https://github.com/your-username/todo-api.git
cd todo-api
mvn spring-boot:run
```

---

## 🔍 H2 Console

- URL: `http://localhost:8080/h2-console`
- JDBC URL: `jdbc:h2:mem:testdb`
- Username: `sa`
- Password: *(leave blank)*

---

## 📘 Swagger UI

After running the application, open:
```
http://localhost:8080/swagger-ui.html
```
This provides interactive documentation of all available endpoints.

---

## 🧪 Sample JSON (POST/PUT)

```json
{
  "title": "Learn Spring Boot",
  "description": "Build a simple CRUD app",
  "completed": false
}
```
👤 Author

AFZAL K A
📎 GitHub: @afzal-ka

---

## 📜 License

This project is licensed under the MIT License.

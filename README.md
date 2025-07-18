# 📝 To-Do List REST API

A simple RESTful To-Do List API built using Spring Boot, designed to perform full CRUD operations: Create, Read, Update, and Delete. The application uses an H2 in-memory database for quick development and testing, and includes Swagger UI for interactive and well-documented API exploration.

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

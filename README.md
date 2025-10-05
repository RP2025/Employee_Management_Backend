# 👩‍💻 Employee Management System – React + Spring Boot (Java)

This is a full-stack **Employee Management System** that enables users to **Create, Read, Update, and Delete (CRUD)** employee records via a responsive React-based frontend and a robust Java Spring Boot REST API backend.

The app demonstrates how frontend and backend technologies can be combined to build a fully functional web application, making it ideal for learning and showcasing **full-stack development** skills.

---

## 📄 Project Description

This project offers a complete CRUD solution to manage employee data, with functionality to:
- 📋 List all employees
- ➕ Add a new employee
- 📝 Update employee details
- ❌ Delete employee records

The backend is built using **Java Spring Boot**, exposing **REST APIs** that the frontend (developed in **React**) consumes via native `fetch()` calls. The backend auto-seeds a few employee records when the server starts.

---

## ⚙️ Tech Stack

### 🔹 Frontend
- React JS (Functional Components + Hooks)
- Native Fetch API for HTTP requests
- Basic styling / responsive design

### 🔹 Backend
- Java 17+
- Spring Boot
- Spring Data JPA + Hibernate
- RESTful API
- H2

---

## 🎥 Working Demo

📺 [Watch Full Demo on YouTube](https://youtu.be/b_vqCbqCo-g)

---
## 🔌 Integration

### FRONTEND : https://github.com/RP2025/Employee_Management_Frontend
### BACKEND : https://github.com/RP2025/Employee_Management_Backend

---

## 🧠 What is CRUD?

**CRUD** stands for:
| Operation | HTTP Method | Description            |
|-----------|-------------|------------------------|
| Create    | POST        | Add new employee       |
| Read      | GET         | Get employee(s)        |
| Update    | PUT         | Modify employee info   |
| Delete    | DELETE      | Remove employee        |

The backend exposes REST endpoints to perform each of these actions, and the frontend interacts with these via simple HTTP calls.

---

## 🔌 What is REST API?

A **REST API** is a set of HTTP-based endpoints that allow communication between client and server. It follows stateless, resource-based conventions.

In this project:
- The backend exposes endpoints like `/employees`, `/employees/{id}`
- The frontend calls these endpoints using HTTP methods like `GET`, `POST`, `PUT`, and `DELETE`





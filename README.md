# 👨‍💼 Employee Attendance & Task Management System

A web-based Employee Attendance & Task Management System developed using **Java, JSP, JPA, and a Relational Database** to efficiently manage employees, attendance records, and task assignments within an organization.

---

## 📌 Project Overview

The Employee Attendance & Task Management System is designed to streamline employee management by providing features for attendance tracking, task assignment, and employee administration.

The application offers separate functionalities for **Managers** and **Developers**, enabling managers to manage employees, assign tasks, monitor progress, and maintain attendance records, while developers can view and update their assigned tasks.

This project demonstrates the implementation of Java web technologies, layered architecture, and database management concepts.

---

## ✨ Features

### 👨‍💼 Employee Management
- Employee Registration
- Employee Login
- Update Employee Details
- View All Developers
- Delete Developer
- Forgot Password Functionality

### 📅 Attendance Management
- Manage Employee Attendance
- Store Attendance Records
- Track Employee Attendance Details

### 📋 Task Management
- Create New Tasks
- Assign Tasks to Developers
- View All Tasks
- Update Task Status
- Delete Tasks
- Track Task Progress

### 🔐 Authentication & Authorization
- Secure User Login
- Employee Registration
- Forgot Password Module
- Separate Access for Managers and Developers

---

## 🛠️ Technologies Used

### Programming Language
- Java

### Frontend
- JSP (JavaServer Pages)
- HTML
- CSS

### Backend
- Java

### Database
- Relational Database

### ORM Framework
- JPA (Java Persistence API)

### Architecture
- DAO (Data Access Object)
- DTO (Data Transfer Object)
- Service Layer
- Controller Layer

### Server
- Java Web Application Server (Apache Tomcat Recommended)

---

## 📂 Project Structure

```text
Employee-Attendance-Task-Management
│
├── src/main
│   ├── java/com/eatm
│   │
│   ├── Dao
│   │   ├── AddressDao.java
│   │   ├── AttendanceDao.java
│   │   ├── EmployeeDao.java
│   │   └── TaskDao.java
│   │
│   ├── controller
│   │   └── EmployeeController.java
│   │
│   ├── dto
│   │   ├── AddressDto.java
│   │   ├── AttendanceDto.java
│   │   ├── EmployeeDto.java
│   │   └── TaskDto.java
│   │
│   ├── service
│   │   ├── EmployeeService.java
│   │   └── IEmployeeService.java
│   │
│   └── util
│       ├── Address.java
│       ├── Attendance.java
│       ├── Employee.java
│       └── Task.java
│
├── resources
│   └── META-INF
│       └── persistence.xml
│
└── webapp
    ├── WEB-INF
    ├── ForgotPassword.jsp
    ├── addDeveloper.jsp
    ├── assignTask.jsp
    ├── createTask.jsp
    ├── deleteDeveloper.jsp
    ├── deleteTask.jsp
    ├── developer.jsp
    ├── failure.jsp
    ├── index.jsp
    ├── login.jsp
    ├── manager.jsp
    ├── register.jsp
    ├── success.jsp
    ├── updateEmployeeDetails.jsp
    ├── updateTaskStatus.jsp
    ├── viewAllDeveloper.jsp
    └── viewAllTask.jsp
```

---

## 🏗️ Project Architecture

This project follows a **Layered Architecture** to maintain clean, scalable, and well-organized code.

### DAO (Data Access Object)
Handles all database-related operations and communication with the database.

### DTO (Data Transfer Object)
Transfers data between layers of the application.

### Service Layer
Contains business logic and application functionality.

### Controller Layer
Handles client requests and coordinates application workflows.

### Entity / Utility Classes
Represent application data and persistence entities.

### JSP Pages
Provide the user interface for interacting with the application.

---

## 💡 Concepts Implemented

- Object-Oriented Programming (OOP)
- JPA (Java Persistence API)
- Layered Architecture
- DAO Design Pattern
- DTO Pattern
- MVC-Based Development
- CRUD Operations
- Session Management
- Authentication & Authorization
- Database Management

---

## 🎯 Project Objectives

- Simplify employee information management.
- Maintain employee attendance records.
- Improve task assignment and task tracking.
- Provide role-based access for Managers and Developers.
- Implement a clean layered architecture.
- Gain practical experience in Java Web Development and JPA.

---

## ⚙️ How to Run the Project

1. Clone this repository.

   ```bash
   git clone <repository-url>
   ```

2. Import the project into Eclipse IDE.

3. Configure the database connection.

4. Update the `persistence.xml` file with your database credentials.

5. Add the required Java and JPA dependencies.

6. Configure a compatible Java web server (Apache Tomcat recommended).

7. Deploy the application on the server.

8. Start the server and open the application in your web browser.

---

## 🚀 Future Enhancements

- Dashboard Analytics
- Employee Performance Tracking
- Email Notifications
- Leave Management System
- Role-Based Access Control (RBAC)
- Task Deadlines and Reminders
- Attendance Reports and Export Features

---

## 👨‍💻 Author

Developed as a **Java Web Development Project** to gain practical experience in:

- Java Programming
- JSP and Servlets
- JPA and Database Management
- Layered Application Architecture
- Web Application Development

---

## ⭐ Support

If you found this project useful, please consider giving it a **Star ⭐** on GitHub.

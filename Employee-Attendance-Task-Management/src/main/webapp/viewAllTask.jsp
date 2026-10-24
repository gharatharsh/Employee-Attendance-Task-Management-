
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.eatm.Employee" %>
<%@ page import="com.eatm.Task" %>
<%@ page import="java.util.List" %>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>View Employee Tasks</title>

<style>
* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
    font-family: Arial, sans-serif;
}

body {
    background-color: #eff6ff;
    padding: 30px;
}

.container {
    max-width: 600px;
    margin: auto;
}

fieldset {
    background: white;
    padding: 25px;
    margin-bottom: 20px;
    border: none;
    border-radius: 12px;
    box-shadow: 0 4px 10px rgba(0, 0, 0, 0.15);
}

h2 {
    color: #2563eb;
    margin-bottom: 20px;
}

h3 {
    color: #2563eb;
    margin: 25px 0 15px;
}

p {
    color: #333;
    margin-bottom: 12px;
    line-height: 1.5;
}

.option {
    margin-bottom: 15px;
}

.option label {
    display: block;
    margin-bottom: 6px;
    font-weight: bold;
    color: #333;
}

.option input {
    width: 100%;
    padding: 10px;
    border: 1px solid #ccc;
    border-radius: 6px;
    font-size: 15px;
}

.btn {
    width: 100%;
    padding: 12px;
    border: none;
    border-radius: 8px;
    background: #2563eb;
    color: white;
    font-size: 16px;
    font-weight: bold;
    cursor: pointer;
}

.btn:hover {
    background: #1d4ed8;
}

.message {
    background: white;
    padding: 20px;
    margin-bottom: 20px;
    border-radius: 12px;
    box-shadow: 0 4px 10px rgba(0, 0, 0, 0.15);
}
</style>
</head>

<body>

<div class="container">

    <h2>View Tasks Assigned to Employee</h2>

    <fieldset>
        <form action="viewAllTask" method="get">

            <div class="option">
                <label for="employeeID">Enter Employee ID:</label>
                <input type="number" id="employeeID"
                    name="employeeID" required>
            </div>

            <button type="submit" class="btn">View Tasks</button>

        </form>
    </fieldset>

    <%
        Employee emp =
            (Employee) session.getAttribute("Employee");

        if (emp != null) {
    %>

        <h2>Employee Details</h2>

        <fieldset>
            <p>Employee ID: <%= emp.getEmployeeId() %></p>
            <p>Name: <%= emp.getEmployeeName() %></p>
            <p>Email: <%= emp.getEmail() %></p>
            <p>Role: <%= emp.getRole() %></p>
        </fieldset>

        <h3>Assigned Tasks</h3>

    <%
        List<Task> tasks = emp.getTasks();

        if (tasks != null && !tasks.isEmpty()) {
            for (Task task : tasks) {
    %>

        <fieldset>
            <p>Task ID: <%= task.getTaskId() %></p>
            <p>Task Name: <%= task.getTaskName() %></p>
            <p>Duration: <%= task.getDuration() %></p>
            <p>Status: <%= task.getStatus() %></p>
        </fieldset>

    <%
            }
        } else {
    %>

        <div class="message">
            <p>No tasks assigned to this employee.</p>
        </div>

    <%
        }
        } else {
    %>

        <div class="message">
            <p>Employee details are not available. Please enter an employee ID.</p>
        </div>

    <%
        }
    %>

</div>

</body>
</html>

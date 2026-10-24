
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.eatm.Employee" %>
<%@ page import="com.eatm.Address" %>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Employee Registration</title>

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

legend {
    font-size: 24px;
    font-weight: bold;
    color: #2563eb;
    padding: 0 10px;
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

h3 {
    color: #2563eb;
    margin: 20px 0;
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
</style>
</head>

<body>

<div class="container">

    <form action="registerManager" method="post">

        <fieldset>
            <legend>Employee Credentials</legend>

            <div class="option">
                <label for="employeeName">Employee Name:</label>
                <input type="text" name="employeeName"
                    id="employeeName" required>
            </div>

            <div class="option">
                <label for="email">Employee Email:</label>
                <input type="email" name="email"
                    id="email" required>
            </div>

            <div class="option">
                <label for="password">Employee Password:</label>
                <input type="password" name="password"
                    id="password" required>
            </div>

            <div class="option">
                <label for="salary">Employee Salary:</label>
                <input type="number" name="salary"
                    id="salary" required>
            </div>

            <div class="option">
                <label for="gender">Gender:</label>
                <input type="text" name="gender"
                    id="gender" required>
            </div>

        </fieldset>

        <fieldset>
            <legend>Address Details</legend>

            <div class="option">
                <label for="houseNumber">House Number:</label>
                <input type="number" name="houseNumber"
                    id="houseNumber" required>
            </div>

            <div class="option">
                <label for="area">Area:</label>
                <input type="text" name="area"
                    id="area" required>
            </div>

            <div class="option">
                <label for="city">City:</label>
                <input type="text" name="city"
                    id="city" required>
            </div>

            <div class="option">
                <label for="state">State:</label>
                <input type="text" name="state"
                    id="state" required>
            </div>

            <div class="option">
                <label for="country">Country:</label>
                <input type="text" name="country"
                    id="country" required>
            </div>

            <div class="option">
                <label for="pincode">Pincode:</label>
                <input type="number" name="pincode"
                    id="pincode" required>
            </div>

            <button type="submit" class="btn">
                Register Employee
            </button>

        </fieldset>

    </form>

</div>

</body>
</html>

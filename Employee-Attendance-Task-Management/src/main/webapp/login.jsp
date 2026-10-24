
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Employee Login</title>

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
    margin: 50px auto;
}

fieldset {
    background: white;
    padding: 25px;
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
    margin-bottom: 20px;
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

a {
    color: #2563eb;
    text-decoration: none;
}

a:hover {
    text-decoration: underline;
}

.button {
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

.button:hover {
    background: #1d4ed8;
}

.message {
    color: red;
    margin-bottom: 20px;
    text-align: center;
}

.logout {
    display: inline-block;
    margin-top: 15px;
}

</style>
</head>

<body>

<div class="container">

    <%
    String message = (String) request.getAttribute("message");

    if (message != null) {
    %>

    <h2 class="message">
        <%= message %>
    </h2>

    <%
    }
    %>

    <form action="loginEmployee" method="post">

        <fieldset>
            <legend>Employee Login Form</legend>

            <div class="option">
                <label for="email">Enter Employee Email Id:</label>
                <input type="email" id="email" name="email" required>
            </div>

            <div class="option">
                <label for="password">Enter Employee Password:</label>
                <input type="password" id="password" name="password" required>
            </div>

            <div class="option">
                <a href="ForgotPassword.jsp">Forgot Password?</a>
            </div>

            <input type="submit" value="LOGIN" class="button">

            <br><br>

        </fieldset>

    </form>

</div>

</body>
</html>

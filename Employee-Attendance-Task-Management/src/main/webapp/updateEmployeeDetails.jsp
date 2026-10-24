
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Update Developer</title>

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

</style>
</head>

<body>

<div class="container">

    <fieldset>
        <legend>Update Developer</legend>

        <form method="post">

            <div class="option">
                <label for="employeeId">Employee ID:</label>
                <input type="number" id="employeeId"
                    name="employeeId" required>
            </div>

            <div class="option">
                <label for="employeeName">Enter Your New Name:</label>
                <input type="text" id="employeeName"
                    name="employeeName">
            </div>

            <button type="submit" class="btn"
                formaction="UpdateDeveloperName">
                Update Name
            </button>

            <br><br>

            <div class="option">
                <label for="email">Enter Your New Email ID:</label>
                <input type="email" id="email" name="email">
            </div>

            <button type="submit" class="btn"
                formaction="UpdateDeveloperEmail">
                Update Email
            </button>

        </form>
    </fieldset>

</div>

</body>
</html>

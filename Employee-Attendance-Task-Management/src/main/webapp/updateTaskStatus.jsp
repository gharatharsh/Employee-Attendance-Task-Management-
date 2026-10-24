
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Update Task Status</title>

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

.option input,
.option select {
    width: 100%;
    padding: 10px;
    border: 1px solid #ccc;
    border-radius: 6px;
    font-size: 15px;
    background-color: white;
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
  
}

</style>
</head>

<body>

<div class="container">

    <form action="updateTaskStatus">

        <fieldset>
            <legend>Update Task Status</legend>

            <div class="option">
                <label for="taskId">Enter Task ID:</label>
                <input type="number" id="taskId"
                    name="taskId" required>
            </div>

            <div class="option">
                <label for="status">Select Your Task Status:</label>
                <select id="status" name="status" required>
                    <option value="Ongoing">Ongoing</option>
                    <option value="Assigned">Assigned</option>
                    <option value="Complete">Complete</option>
                </select>
            </div>

            <button type="submit" class="btn">
                Update Status
            </button>

        </fieldset>

    </form>

</div>

</body>
</html>

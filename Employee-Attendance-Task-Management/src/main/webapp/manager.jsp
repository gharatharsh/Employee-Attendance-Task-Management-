<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Manager Dashboard</title>
    <style>
      * {
        margin: 0;
        padding: 0;
        box-sizing: border-box;
        font-family: Arial, sans-serif;
      }

      body {
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
        background-color: #eff6ff;
      }

      .container {
        width: 400px;
      }

      fieldset {
        background: white;
        padding: 30px;
        border: none;
        border-radius: 15px;
        box-shadow: 0 4px 15px rgba(0, 0, 0, 0.2);
      }

      legend {
        font-weight: 30px;
        text-align: center;
        font-size: 24px;
        font-weight: bold;
        color: #010101;
        padding: 0 10px;
      }

      .option {
        margin: 15px 0;
      }

      .option label {
        display: block;
        margin-bottom: 8px;
        font-weight: bold;
        color: #333;
      }

      .btn {
        display: block;
        width: 100%;
        text-align: center;
        padding: 12px;
        background: #4e73df;
        color: white;
        border-radius: 8px;
        font-weight: bold;
      }

      .logout {
        background: #e74a3b;
      }
    </style>
  </head>
  <body>
    <div class="container">
      <form>
        <fieldset>
          <legend>Manager Dashboard</legend>

          <div class="option">
            <label>Add Developer: </label>
            <a href="addDeveloper.jsp" class="btn"> Add Developer </a>
          </div>

          <div class="option">
            <label>Create Task: </label>
            <a href="createTask.jsp" class="btn"> Create Task </a>
          </div>

          <div class="option">
            <label>Assign Task: </label>
            <a href="assignTask.jsp" class="btn"> Assign Task </a>
          </div>

          <div class="option">
            <label>Delete Task: </label>
            <a href="deleteTask.jsp" class="btn"> Delete Task </a>
          </div>

          <div class="option">
            <label>Delete Developer: </label>
            <a href="deleteDeveloper.jsp" class="btn"> Delete Developer </a>
          </div>

          <div class="option">
            <label>View All Developer: </label>
            <a href="viewAllDeveloper" class="btn"> View All Developer </a>
          </div>

          <div class="option">
            <label>Logout: </label>
            <a href="logoutEmployee" class="btn"> Logout </a>
          </div>
        </fieldset>
      </form>
    </div>
  </body>
</html>

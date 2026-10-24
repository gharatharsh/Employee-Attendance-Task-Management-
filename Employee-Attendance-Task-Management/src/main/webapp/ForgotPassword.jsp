<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Developer Dashboard</title>

    <style>

        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: Arial, sans-serif;
        }

        body {
            min-height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            background-color: #EFF6FF;
            padding: 20px;
        }

        .container {
            width: 100%;
            max-width: 400px;
        }

        fieldset {
            background: white;
            padding: 30px;
            border: none;
            border-radius: 15px;
            box-shadow: 0 4px 15px rgba(0, 0, 0, 0.2);
        }

        legend {
            text-align: center;
            font-size: 24px;
            font-weight: bold;
            color: #010101;
            padding: 0 10px;
        }

        .option {
            margin: 20px 0;
        }

        .option label {
            display: block;
            margin-bottom: 8px;
            font-weight: bold;
            color: #333;
        }

        .option input {
            width: 100%;
            padding: 12px;
            border: 1px solid #ccc;
            border-radius: 8px;
            font-size: 16px;
            outline: none;
        }

        .btn {
            display: block;
            width: 100%;
            padding: 12px;
            background: #3b62e2;
            color: white;
            border: none;
            border-radius: 8px;
            font-size: 16px;
            font-weight: bold;
        }

    </style>
</head>

<body>

    <div class="container">
          <form action="ForgotPassword">
            <fieldset>
                <legend>Forgot PassWord</legend>

                <div class="option">
                    <label>Enter Email Id:</label>
                    <input type = "text" name = "email" required="required">
                </div>

                <div class="option">
                    <label>Enter New PassWord:</label>
                    <input type = "text" name = "email" required="required">
                </div>

                <button type="submit" class="btn">Submit</button>           
            </fieldset>
        </form>
    </div>
</body>
</html>

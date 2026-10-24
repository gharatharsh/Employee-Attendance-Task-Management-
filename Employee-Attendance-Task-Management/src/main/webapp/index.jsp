
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Home Page</title>

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
            background-color: #EFF6FF;
        }

        .container {
            width: 400px;
            max-width: 90%;
            background: white;
            padding: 30px;
            border-radius: 15px;
            text-align: center;
            box-shadow: 0 4px 15px rgba(0, 0, 0, 0.2);
        }

        h2 {
            margin-bottom: 25px;
            color: #333;
        }

        h4 {
            margin: 15px 0;
        }

        a {
            display: block;
            padding: 12px;
            background: #4e73df;
            color: white;
            text-decoration: none;
            border-radius: 8px;
        }


    </style>
</head>

<body>

    <div class="container">
        <h2><%= "Hello !" %></h2>

        <h4><a href="register.jsp">Register</a></h4>
        <h4><a href="login.jsp">Login</a></h4>
    </div>

</body>
</html>

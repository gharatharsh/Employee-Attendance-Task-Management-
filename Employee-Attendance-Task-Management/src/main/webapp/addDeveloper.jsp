<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Manager Dashboard</title>

<style>
*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:Arial, sans-serif;
}

body{
    background-color:#eff6ff;
    padding:30px;
}

.container{
    max-width:600px;
    margin:auto;
}

fieldset{
    background:white;
    padding:25px;
    margin-bottom:20px;
    border:none;
    border-radius:12px;
    box-shadow:0 4px 10px rgba(0,0,0,0.15);
}

legend{
    font-size:24px;
    font-weight:bold;
    color:#2563eb;
    padding:0 10px;
}

.option{
    margin-bottom:15px;
}

.option label{
    display:block;
    margin-bottom:6px;
    font-weight:bold;
    color:#333;
}

.option input{
    width:100%;
    padding:10px;
    border:1px solid #ccc;
    border-radius:6px;
    font-size:15px;
}


.btn{
    width:100%;
    padding:12px;
    border:none;
    border-radius:8px;
    background:#2563eb;
    color:white;
    font-size:16px;
    font-weight:bold;
}

</style>

</head>
<body>

<div class="container">

<form action="addDeveloper" method="post">

    <fieldset>
        <legend>Add Developer</legend>

        <div class="option">
            <label>Developer Name</label>
            <input type="text" name="employeeName" required>
        </div>

        <div class="option">
            <label>Developer Email</label>
            <input type="email" name="email" required>
        </div>

        <div class="option">
            <label>Developer Password</label>
            <input type="password" name="password" required>
        </div>

        <div class="option">
            <label>Developer Salary</label>
            <input type="number" name="salary" required>
        </div>

        <div class="option">
            <label>Developer Gender</label>
            <input type="text" name="gender" required>
        </div>

    </fieldset>

    <fieldset>
        <legend>Address</legend>

        <div class="option">
            <label for="houseNumber">House Number</label>
            <input type="number" name="houseNumber" id="houseNumber" required>
        </div>

        <div class="option">
            <label for="area">Area</label>
            <input type="text" name="area" id="area" required>
        </div>

        <div class="option">
            <label for="city">City</label>
            <input type="text" name="city" id="city" required>
        </div>

        <div class="option">
            <label for="state">State</label>
            <input type="text" name="state" id="state" required>
        </div>

        <div class="option">
            <label for="country">Country</label>
            <input type="text" name="country" id="country" required>
        </div>

        <div class="option">
            <label for="pincode">Pincode</label>
            <input type="number" name="pincode" id="pincode" required>
        </div>

        <button type="submit" class="btn">
            Add Developer
        </button>

    </fieldset>

</form>

</div>

</body>
</html>
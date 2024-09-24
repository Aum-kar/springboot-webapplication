<%@page language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="index.css">
    <title>Document</title>
</head>
<body>
    <h1>Advanced calculator</h1>

    <form action="result">
        <label for="number1">number 1:</label>
        <input type="number" name="num1" id="number1" placeholder="in numbers" autofocus>

        <label for="number2">number 2:</label>
        <input type="number" name="num2" id="number2" value="0">

        <input type="submit" value="submit">
    </form>
</body>
</html>
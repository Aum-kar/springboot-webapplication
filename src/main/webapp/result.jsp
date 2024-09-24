<%@page language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>result</title>
</head>
<body>
    <h1>result</h1>
    <p>Answer is: <%= session.getAttribute("sum") %></p>
    <!-- Another way to print is below -->
    <p>Answer is: ${sum} </p>
</body>
</html>
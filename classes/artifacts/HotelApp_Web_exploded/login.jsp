<%--
  Created by IntelliJ IDEA.
  User: sovicheacheth
  Date: 2019-07-13
  Time: 09:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <link href="resources/css/styles.css" rel="stylesheet"/>
    <script src="resources/js/scripts.js" type="text/javascript"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <link href="resources/images/favicon.ico" rel="icon" type="image/x-icon"/>
</head>
<body>
<div class="loginContainer">

    <form method="POST" class="loginForm" action="login">
        <h1>Login Form</h1>
        <input type="text" placeholder="Username" id="username">
        <input type="password" placeholder="password" id="password">
        <input type="submit" value="Login">
    </form>
</div>
</body>
</html>

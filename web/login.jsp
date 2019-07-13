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

    <form method="POST">
        <label for="username"></label>
        <input type="text" name="username" id="username" /><br/>

        <label for="password"></label>
        <input type="password" name="password" id="password"/><br/>

        <label>Remember Me</label>
        <input type="checkbox" value="1" name="remember"/><br/>

        <input type="submit" text="Login"/>

    </form>

</body>
</html>

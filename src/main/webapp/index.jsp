<html>
<body>
<h2>Login form</h2>
<form name="loginForm" action="LoginServlet" method="POST">
    <input type="text" placeholder="Username" name="username"> <br>

    <input type="password" placeholder="Password" name="password">
    <%--<span>${error}</span>--%>
    <input type="submit" value="loginSubmit">

</form>
</body>
</html>

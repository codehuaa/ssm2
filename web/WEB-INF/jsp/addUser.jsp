<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>增加用户</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/user/addUser" method="get">
        用户名：
        <input type="text" name="username"><br/>
        密  码：
        <input type="password" name="password"><br/>
        <input type="submit" value="添加">
    </form>
</body>
</html>

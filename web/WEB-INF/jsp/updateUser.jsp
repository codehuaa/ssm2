<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改用户</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/updateUser" method="get">
    <input type="hidden" name="id" value="${user.id}">
    用户名：
    <input type="text" name="username" value="${user.username}"><br/>
    密  码：
    <input type="password" name="password" value="${user.password}"><br/>
    <input type="submit" value="修改">
</form>
</body>
</html>

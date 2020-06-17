<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户展示页面</title>
</head>
<body>
<h1>
    用户展示页面<br/>
</h1>
<h3>
    <c:forEach var="user" items="${userList}">
        用户id：${user.id}<br/>
        用户名：${user.username}<br/>
        用户密码：${user.password}<br/>
        <div style="font-size: 14px;">
            <a href="${pageContext.request.contextPath}/user/toupdateUser?id=${user.id}">修改</a>
            &nbsp;|&nbsp;
            <a href="${pageContext.request.contextPath}/user/deleteUser?id=${user.id}">删除</a>
        </div>
        <br/>
    </c:forEach>
</h3>

</body>
</html>

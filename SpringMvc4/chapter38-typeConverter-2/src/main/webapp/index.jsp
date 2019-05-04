<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*" %>
<html>
<body>
<h2>Hello World!</h2>
<form action="${pageContext.request.contextPath}/test/register.do">
    年龄：<input type="text" name="age" value="${age}"/>${ageError}<br>
    生日：<input type="text" name="birthday" value="${birthday}"/> ${birthdayError}<br>
    <input type="submit" value="注册"/><br>
</form>
</body>
</html>

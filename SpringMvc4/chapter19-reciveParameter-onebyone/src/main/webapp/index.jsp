<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*" %>
<html>
<body>
<h2>Hello World!</h2>
<form action="${pageContext.request.contextPath}/test/register.do">
    姓名：<input type="text" name="name"/> <br>
    年龄：<input type="text" age="age"/><br>
    <input type="submit" value="注册"/><br>
</form>
</body>
</html>

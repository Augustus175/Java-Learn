<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*" %>
<html>
<body>
<h2>Hello World!</h2>
<form action="${pageContext.request.contextPath}/test/register.do">
    姓名：<input type="text" name="name"/>${nameErrorMSG}<br>
    成绩：<input type="text" name="score"/>${scoreErrorMSG}<br>
    电话：<input type="text" name="mobile"/>${mobileErrorMSG}<br>
    <input type="submit" value="注册"/><br>
</form>
</body>
</html>

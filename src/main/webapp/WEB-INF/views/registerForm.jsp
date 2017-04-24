<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: zhanedw
  Date: 18/04/2017
  Time: 5:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spittr</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style.css" />" >
</head>
<body>
    <h1>Register</h1>
    <sf:form method="POST" commandName="spitter">
        First Name: <sf:input path="firstName" /><sf:errors path="firstName" cssClass="error" /><br/>
        Last Name: <sf:input path="lastName" /><sf:errors path="lastName" cssClass="error" /><br/>
        Username: <sf:input path="username" /><sf:errors path="username" cssClass="error" /><br/>
        Password: <sf:password path="password" /><sf:errors path="password" cssClass="error" /><br/>
        <input type="submit" value="Register" />
    </sf:form>
</body>
</html>

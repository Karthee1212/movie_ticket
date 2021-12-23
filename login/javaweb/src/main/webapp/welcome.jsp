<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>welcome</title>
</head>
<body>
    <a href="http://localhost:9090/home.jsp">home</a>
    <h1>Welcome page</h1>
    The user is <c:out value="${sessionScope.uname}" /> <br/>
    The role is <c:out value="${sessionScope.role}" /> <br/>


    ${uname}
    ${role}
</body>
</html>
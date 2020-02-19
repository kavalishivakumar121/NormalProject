<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="save" method="post" modelAttribute="customerDetails1">
	<pre>
		CustId :<form:input path="custId"/>
		CustName :<form:input path=""/>
		CustAddress :<form:input path=""/>
		PhoneNumb :<form:input path=""/>
		Brand :<form:select path=""></form:select>
		
	</pre>
</form:form>
</body>
</html>
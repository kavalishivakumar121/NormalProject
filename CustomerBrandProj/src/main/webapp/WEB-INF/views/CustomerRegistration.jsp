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
	<form:form action="save" modelAttribute="customerDetails">
		<pre>
			Name :<form:input path=""/>
			Address :<form:input path=""/>
			Phone NO:<form:input path=""/>
			Brnad :<form:select path="brand.prodId">
					<form:option value="">--select--</form:option>
			</form:select>
		</pre>
	
	</form:form>
</body>
</html>
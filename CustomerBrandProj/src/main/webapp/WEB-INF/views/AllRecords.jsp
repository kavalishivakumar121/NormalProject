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
<h3>welcome to All Records</h3>
<form:form action="update" method="post" modelAttribute="productBrand">
	<table border="1">
		<tr>
			<td>Product-Id</td>
			<td>Product-Name</td>
			<td>Product-Category</td>
			<td>Product-Price</td>
			<td>Operations</td>
		</tr>
		<c:forEach items="${list}" var="obj">
			<tr>
				<td><c:out value="${obj.prodId}"/></td>
				<td><c:out value="${obj.brandName}"/></td>
				<td><c:out value="${obj.categoryType}"/></td>
				<td><c:out value="${obj.priceValue}"/></td>
				<td><a href="delete?id=${obj.prodId}">delete</a></td>
			</tr>
		</c:forEach>
	</table>
</form:form>
</body>
</html>
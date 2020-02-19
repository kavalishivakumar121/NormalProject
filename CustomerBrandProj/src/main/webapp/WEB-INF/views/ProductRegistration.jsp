<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>welcome To ProductBrand Page...!!</h3>
<form:form action="save" method="post" modelAttribute="productBrand">
<pre>
Brand 		:<form:input path="brandName"/><br>
Category 	:<form:input path="categoryType"/><br>
Price 		:<form:input path="priceValue"/><br>
<input type="submit" value="Register">

<a href="all">show All Records</a>
</pre>
${message}
</form:form>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
<!DOCTYPE HTML>

<html>
<head>
	<title>Book List</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
		  rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
		  crossorigin="anonymous">
</head>
	<body>
	<div class = "container col-md 6 mt-3">
		<h2 class="text-success text-center">Book List</h2>
		<div style="text-align: center;">
			<a href = "HelloServlet?action=new">Add New Book</a>
			<a href = "HelloServlet?action=list">List All Book</a>
		</div>
		<table class = "table table-bordered text-center mt-3">
				<tr>
					<th>Id</th>
					<th>Title</th>
					<th>Author</th>
					<th>Price</th>
					<th>Actions</th>
				</tr>
				<c:forEach items="${listBook}" var="book">
				<tr>
					<td><c:out value="${book.id}"/></td>
					<td><c:out value="${book.title}"/></td>
					<td><c:out value="${book.author}"/></td>
					<td><c:out value="${book.price}"/></td>
					<td>
						<a href="HelloServlet?action=edit&id=<c:out value='${book.id}'/>">Edit</a>
						<a href="HelloServlet?action=delete&id=<c:out value='${book.id}'/>">Delete</a>
					</td>
				</tr>
				</c:forEach>
			</table>
		</div>

	</body>
</html>
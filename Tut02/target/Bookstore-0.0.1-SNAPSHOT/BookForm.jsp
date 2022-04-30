<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
<!DOCTYPE HTML>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Book Form</title>
	</head>
	<body>
	<div class = "container col-md 6 mt-3">
		<div style="text-align: center;">
		<h2 class="text-success text-center">Edit Book</h2>
			<h2>
				<a href = "HelloServlet?action=new">Add New Book</a>
				<a href = "HelloServlet?action=list">List All Book</a>
			</h2>
		</div>
		<div align="center">
			<c:if test="${book!=null}">
				<form action="HelloServlet?action=update" method="post">
			</c:if>
			<c:if test="${book==null}">
				<form action="HelloServlet?action=insert" method="post">
			</c:if>
				<table class = "table table-bordered text-center mt-3">
				<caption>
					<h2>
						<c:if test="${book!=null}"> Edit Book</c:if>
						<c:if test="${book==null}"> Add new Book</c:if>
					</h2>
				</caption>
				<c:if test="${book!=null}">
					<input type="hidden" name="id" value="<c:out value='${book.id}'/>"></input>
					
				</c:if>
				<tr>
					<th>Title:</th>
					<td>
						<input type="text" name="title" size="45" value="<c:out value='${book.title}'/>"></input>
					</td>
				</tr>
				<tr>
					<th>Author:</th>
					<td>
						<input type="text" name="author" size="45" value="<c:out value='${book.author}'/>"></input>
					</td>
				</tr>
				<tr>
					<th>Price:</th>
					<td>
						<input type="text" name="price" size="45" value="<c:out value='${book.price}'/>"></input>
					</td>
				</tr>
				<tr>
				<td colspan="2" align="center">
					<input type="submit" value="save"></input>
				</td>
				</tr>
			</table>
			</form>
		</div>
	</body>
</html>
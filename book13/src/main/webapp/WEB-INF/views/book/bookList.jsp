<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	img{
		height: 100px; 
		width: 100px;
	}
</style>
<style>
</style>
</head>
<body>

	<h4>도서 조회/수정</h4>
	
	<table border="1">
		<thead>
			<tr>
				<th>도서번호</th>
				<th>도서명</th>
				<th>표지</th>
				<th>추판일자</th>
				<th>금액</th>
				<th>출판사</th>
				<th>도서소개</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="book" items="${bookList}">
				<tr>
					<td>${book.bookNo}</td>
					<td>${book.bookName}</td>
					<td><img src="resources/images/${book.bookCoverimg}"></td>
					<td><fmt:formatDate pattern = "yyyy/MM/dd" value="${book.bookDate}"/> </td>
					<td>${book.bookPrice}</td>
					<td>${book.bookPublisher}</td>
					<td>${book.bookInfo}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>
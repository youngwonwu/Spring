<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	textarea {
	    font-size: 12px;
	    width: 200px;
	    height: 100px;
		resize: none;
	}
</style>
</head>
<body>
	
	<h4>도서 등록</h4>
	
	<form action="bookInsert" method="post">
		<div>도서번호<input name="bookNo"></div>
		<div>도서명<input name="bookName"></div>
		<div>도서표지<input name="bookCoverimg"></div>
		<div>출판일자<input type="date" name="bookDate"></div>
		<div>금액<input name="bookPrice"></div>
		<div>출판사<input name="bookPublisher"></div>
		<div>도서소개<textarea name="bookInfo"></textarea></div>
		<button>등록</button>
		<button>조회</button>
	</form>

</body>
</html>
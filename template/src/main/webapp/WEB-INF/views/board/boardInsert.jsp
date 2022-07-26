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

	<h4>게시글 등록</h4>
	<form action="boardInsert" method="post">
		<div>제 목 : <input name="title"></div>
		<div>작성자: <input name="writer"></div>
		<div>내 용 : <textarea name="content"></textarea></div>
			
		<button>등록</button>
	</form>
	

</body>
</html>
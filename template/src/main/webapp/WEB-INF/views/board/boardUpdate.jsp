<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
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

	<h4>게시글 수정</h4>
	<c:set var="path" value="${pageContext.request.contextPath}"/>
	<form action="${path }/boardUpdate" method="post">
		<div>글번호 : <input name="bno" value="${board.bno }" readonly="readonly"></div>
		<div>제 목 : <input name="title" value="${board.title }"></div>
		<div>작성자: <input name="writer" value="${board.writer }"></div>
		<div>내 용 : <textarea name="content">${board.content }</textarea></div>
		
		<button>등록</button>
		<button type="button" id="btnDelete">삭제</button>
	</form>

	<script type="text/javascript">
		btnDelete.addEventListener("click", function(){
			location.href="${path}/boardDelete?bno=${board.bno}";
		});
	</script>

</body>
</html>
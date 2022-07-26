<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link href="//cdn.datatables.net/1.12.1/css/jquery.dataTables.min.css" rel="stylesheet" />
<script src="//cdn.datatables.net/1.12.1/js/jquery.dataTables.min.js"></script>
<script>
	$(function() {
		//$('#myTable').DataTable();
	});
	
	
// 	function goPage(num) {
// 		location.href="boardList?pageNum=" + num
// 	}
	function goPage(num) {
		searchFrm.pageNum.value = num;		//$('[name="pageNum"]').val(num)
		searchFrm.submit();
	}
</script>
</head>
<body>
	
	<h3>게시글 목록</h3>

	<form name="searchFrm">
		<input type="hidden" name="pageNum" value="1">
		<select name="type">
			<option value="title">제목
			<option value="content">내용
			<option value="writer">작성자
		</select>
		<input name="keyword">
		<button>검색</button>
	</form>

	<table id="myTable" class="table table-striped">
		<thead>
			<tr>
				<th>글번호</th>
				<th>제목</th>
				<th>내용</th>
				<th>작성자</th>
				<th>작성일자</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="board" items="${boardList}">
				<tr>
					<td><a href="boardUpdate/${board.bno}">${board.bno}</a></td>
					<td>${board.title}</td>
					<td>${board.content}</td>
					<td>${board.writer}</td>
					<td>${board.regDate}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<nav aria-label="...">
	  <ul class="pagination">
	  <c:if test="${pageMaker.prev }">
	    <li class="page-item"><a class="page-link" href="#" onclick="goPage(${pageMaker.startPage} - 1)">Previous</a></li>
	  </c:if>
	  <c:forEach begin="${pageMaker.startPage }" end="${pageMaker.endPage }" var="num">
	    <li class="page-item"><a class="page-link" href="#" onclick="goPage(${num})">${num}</a></li>
	  </c:forEach>
	  <c:if test="${pageMaker.next }">
	    <li class="page-item"><a class="page-link" href="#" onclick="goPage(${pageMaker.endPage } + 1)">Next</a></li>
	  </c:if>
	  </ul>
	</nav>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="req1">
	<input name="id">
	<button>스트링</button>
</form>

<hr>

<form action="req2">
	<input type="checkbox" name="ids" value="100">100
	<input type="checkbox" name="ids" value="101">101
	<input type="checkbox" name="ids" value="102">102
	<button>스트링배열</button>
</form>

<hr>

<form action="req3">
	<input name="id">
	<input type="checkbox" name="ids" value="100">100
	<input type="checkbox" name="ids" value="101">101
	<input type="checkbox" name="ids" value="102">102
	<button>Map</button>
</form>

<hr>

<!-- ReqVO 클래스 만듬  -->
<form action="req4">
	<input name="id">
	<input type="checkbox" name="ids" value="100">100
	<input type="checkbox" name="ids" value="101">101
	<input type="checkbox" name="ids" value="102">102
	<button>VO</button>
</form>

<hr>

<!-- ListReqVO 클래스 만듬  -->
<!-- ListReqVO에서 변수명?과 인덱스 번호가 필요함 -->
<!-- vork 3개 listvo로 들어감 -->
<form action="req5">
	<div>
		<input name="list[0].id">
		<input type="checkbox" name="list[0].ids" value="100">100
		<input type="checkbox" name="list[0].ids" value="101">101
		<input type="checkbox" name="list[0].ids" value="102">102
	</div>
	<div>
		<input name="list[1].id">
		<input type="checkbox" name="list[1].ids" value="100">100
		<input type="checkbox" name="list[1].ids" value="101">101
		<input type="checkbox" name="list[1].ids" value="102">102
	</div>
	<div>
		<input name="list[2].id">
		<input type="checkbox" name="list[2].ids" value="100">100
		<input type="checkbox" name="list[2].ids" value="101">101
		<input type="checkbox" name="list[2].ids" value="102">102
	</div>
	<button>List&lt;VO&gt;</button>
</form>

<hr>
<br>


	<form action="req6" method="post" enctype="multipart/form-data">
		<input name="id">
		<input type="checkbox" name="ids" value="100">100
		<input type="checkbox" name="ids" value="101">101
		<input type="checkbox" name="ids" value="102">102
		<input type="file" name="pic" multiple="multiple">	<!-- 여러개 파일 첨부할려면 multiple="multiple" 해줘야함 -->
		<button>첨부파일</button>
	</form>

<hr>

<a href="req7/woo/28">pathvariable</a>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h4>사원 등록</h4>
	<form action="empInsert" method="post">
		<div>firstName<input name="firstName"></div>
		<div>lastName<input name="lastName"></div>
		<div>hireDate<input type="date" name="hireDate"></div>
		<div>email<input name="email"></div>
		<div>jobId<input name="jobId"></div>
		
		<button>등록</button>	<!-- button 자체가 submit -->
	</form>

</body>
</html>
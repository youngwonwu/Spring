<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
ul, li {
	boader: solid 1px black
}
</style>
</head>
<body>

	<h3>사원 목록</h3>

	<form action="emplist">
		사번<input name="employeeId">
		부서<input type="checkbox" name="depts" value="10">10
		   <input type="checkbox" name="depts" value="20">20
		   <input type="checkbox" name="depts" value="30">30
		직무<select name="jobId">
			<option value="">선택</option>
			<option value="IT_PROG">IT_PROG</option>
			<option value="ST_CLERK">ST_CLERK</option>
			<option value="ST_MAN">ST_MAN</option>
		   </select>
		입사일자<input type="date" name="sdt">~<input type="date" name="edt">	
		<button>검색</button>
	</form>
	
	<table border="1">
      <thead>
         <tr>
            <th>employeeId</th>
			<th>firstName</th>
			<th>lastName</th>
			<th>email</th>
			<th>hireDate</th>
			<th>jobId</th>
			<th>salary</th>
         </tr>
      </thead>
      <c:forEach var="emp" items="${list}">
         <tr>
            <td><a href="empUpdate/${emp.employeeId}">${emp.employeeId}</a></td>
            <td>${emp.firstName}</td>
            <td>${emp.lastName}</td>
            <td>${emp.email}</td>
            <td>${emp.hireDate}</td>
            <td>${emp.jobId}</td>
            <td>${emp.salary}</td>
         </tr>
      </c:forEach>
   </table>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>url</title>
</head>
<body>

<!--  -->
${pageContext.request.contextPath}/board?name=woo&title=test
<c:url value="/board" var="boardListUrl">
	<c:param name="name" value="woo"></c:param>
	<c:param name="title" value="test"></c:param>
</c:url>
<a href="#{boardListUrl }">게시판</a>
<a href="<c:url value="boardList"/>">게시판</a>

</body>
</html>
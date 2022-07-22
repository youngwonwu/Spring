<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<img src="images/choonsik.png">	
<!-- 
경로를 images 파일에 넣으면 사진이 안나오고
resources 폴더에는 사진이 나옴
근데 images폴더에서 사진이 나오고 싶으면
servlet-context에서 resources추가 해야 한다
 -->

<P>  The time on the server is ${serverTime}. </P>
</body>
</html>

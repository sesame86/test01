<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 테스트</title>
</head>
<body>
	<c:if test="${!empty msg}">
		<script>
			alert("${msg}");
			<c:remove var="msg"/>
		</script>
	</c:if>
	<h3>회원 가입</h3>
	<form action="signup" method="post">
		<label> ID : </label> <input type="text" name="id"> <br>
		<label>PWD : </label> <input type="password" name="pwd">
		<br> <label>이름 : </label> <input type="text" name="name">
		<br>
		<button>회원가입</button>
		<button type="reset">리셋</button>
	</form>
</body>
</html>

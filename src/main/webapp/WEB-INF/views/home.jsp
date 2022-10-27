<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>

<title>Home</title>

<style>
button {
	margin-top: 280px;
	font-size: 40px;
}
</style>


</head>
<body>
	<div style='text-align: center;'>
		<button type="button" class="btn btn-sm btn-primary" id="btnWriteForm"
			onclick="location.href = '/board/getBoardList' ">게시판</button>
	</div>
</body>
</html>

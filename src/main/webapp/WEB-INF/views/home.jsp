<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<p>
		<a href="${pageContext.request.contextPath}/check"> 1.총  이수 학점 조회 </a>
	</p>
	
	<p>
		<a href="${pageContext.request.contextPath}/term_check"> 2.학기별  이수 학점 조회 </a>
	</p>
	
	<p>
		<a href="${pageContext.request.contextPath}/division_check"> 3.구분별  이수 학점 조회 </a>
	</p>
	
	<p>
		<a href="${pageContext.request.contextPath}/apply_course"> 4.수강신청하기 </a>
	</p>
	
	<p>
		<a href="${pageContext.request.contextPath}/apply_check"> 5.수강신청조회 </a>
	</p>
	
	
</body>
</html>

<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>apply</title>
</head>
<body>
	<form method="post" action="${pageContext.request.contextPath}/applynew">
	���� �ڵ� : <input type = "text" name="course_id"><br>
	���� �⵵ : <input type="text" name="year" value=2017 readonly ><br>
	�б� : <input type="text" name="term" value=1 readonly><br>
	���� : <input type="text" name="division" ><br>
	������ : <input type="text" name="coursename"><br>
	���� : <input type="text" name="credit"><br>
	<input type="submit" value="����"><br>
	</form>
</body>
</html>
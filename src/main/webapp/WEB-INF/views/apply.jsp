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
	과목 코드 : <input type = "text" name="course_id"><br>
	수강 년도 : <input type="text" name="year" value=2017 readonly ><br>
	학기 : <input type="text" name="term" value=1 readonly><br>
	구분 : <input type="text" name="division" ><br>
	교과명 : <input type="text" name="coursename"><br>
	학점 : <input type="text" name="credit"><br>
	<input type="submit" value="제출"><br>
	</form>
</body>
</html>
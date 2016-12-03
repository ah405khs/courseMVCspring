<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>term course</title>
</head>
<body>
<c:forEach var="termcourse" items="${termcourse}" >
		<table border="1">
			<thead>
				<th>년도</th>
				<th>학기</th>
				<th>이수학점</th>
			</thead>
			
			<tr>	
				<td>
				<p>
					<c:out value="${termcourse.year}">
					</c:out>
				</p>
				</td>
				
				<td>
				<p>
					<c:out value="${termcourse.term}">
					</c:out>
				</p>
				</td>
				
				<td>
				<p>
					<c:out value="${termcourse.sum}">
					</c:out>
				</p>
				</td>
		
			</tr>
		</table>
		
		<br></br>
	
		
	</c:forEach>

</body>
</html>
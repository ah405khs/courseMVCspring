<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>division course</title>
</head>
<body>
<c:forEach var="divisioncourse" items="${divisioncourse}" >
		<table border="1">
			<thead>
				<th><p>
					<c:out value="${divisioncourse.division}">
					</c:out>
				</p></th>		
			</thead>
			
			<tr>	
				<td>
				<p>
					<c:out value="${divisioncourse.sum}">
					</c:out>
				</p>
				</td>	
			</tr>
		</table>
		
	
		
	</c:forEach>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>All course</title>
</head>
<body>
	<c:forEach var="allcourse" items="${allcourse}" >
		<table border="1">
			<thead>
				<th>�����ڵ�</th>
				<th>�����⵵</th>
				<th>�б�</th>
				<th>����</th>
				<th>�������</th>
				<th>����</th>
			</thead>
			
			<tr>	
				<td>
				<p>
					<c:out value="${allcourse.course_id}">
					</c:out>
				</p>
				</td>
				
				<td>
				<p>
					<c:out value="${allcourse.year}">
					</c:out>
				</p>
				</td>
				
				<td>
				<p>
					<c:out value="${allcourse.term}">
					</c:out>
				</p>
				</td>
				
				<td>
				<p>
					<c:out value="${allcourse.division}">
					</c:out>
				</p>
				</td>
				
				<td>
				<p>
					<c:out value="${allcourse.coursename}">
					</c:out>
				</p>
				</td>
				
				<td>
				<p>
					<c:out value="${allcourse.credit}">
					</c:out>
				</p>
				</td>
		
			</tr>
		</table>
		
		<br></br>
	
		
	</c:forEach>

</body>
</html>
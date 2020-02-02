<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	pageContext.setAttribute("x", request.getParameter("x"));
	pageContext.setAttribute("y", request.getParameter("y"));

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
	<body>
		${param['x'] } + ${param['y'] } = ${param['x'] + param['y'] }<br>
		${param['x'] } - ${param['y'] } = ${param['x'] - param['y'] }<br>
		${param.x } + ${param.y } = ${param.x * param.y }<br>
		${param.x } + ${param.y } = ${param.x / param.y }<br> 
		${x } + ${y } = ${x / y }<br> 
	</body>
</html>

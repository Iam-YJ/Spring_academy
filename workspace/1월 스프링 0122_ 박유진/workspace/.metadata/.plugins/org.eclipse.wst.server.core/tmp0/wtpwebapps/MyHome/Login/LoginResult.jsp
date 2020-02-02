<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/Layout/Header.jsp" %>
<div align="center">
	${msg }<br>
	<c:choose>
		<c:when test="${check }">
			MyPage | 회원탈퇴 |
		</c:when>
		<c:otherwise>
			ID찾기 | PW찾기 | 
			<a href = "/MyHome/Login/LoginForm.jsp">Login</a> | 
		</c:otherwise>
	</c:choose>
	<a href = "/MyHome/Index.jsp">Home</a>
</div>
<%@include file="/Layout/Footer.jsp" %>
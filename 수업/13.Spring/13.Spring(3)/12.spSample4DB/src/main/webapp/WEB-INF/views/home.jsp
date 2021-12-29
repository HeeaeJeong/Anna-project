<%@page import="mul.camp.a.dto.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>home jsp</h1>

<%
	MemberDto mem = (MemberDto)request.getAttribute("mem");
%>

회원정보:<br>
ID:<%=mem.getId() %><br>
PW:<%=mem.getPwd() %><br>
NAME:<%=mem.getName() %><br>
EMAIL:<%=mem.getEmail() %><br>




</body>
</html>
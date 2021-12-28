<%@page import="mul.camp.a.dto.HumanDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	HumanDto human = (HumanDto)request.getAttribute("human");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>home jsp 입니다</h2>

<p>직업:<%=human.getJob() %></p>
나이:<input type="text" value="<%=human.getAge() %>">


</body>
</html>




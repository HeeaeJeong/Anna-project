<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>hello jsp 입니다</h1>

<%
	// java 영역
	String name = (String)request.getAttribute("_name"); // 짐풀러!
%>

<p><%=name %></p>

name:<input type="text" value="<%=name %>">


</body>
</html>
















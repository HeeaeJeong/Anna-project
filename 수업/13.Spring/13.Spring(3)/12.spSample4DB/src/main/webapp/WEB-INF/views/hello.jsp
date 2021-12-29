<%@page import="mul.camp.a.dto.MemberDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	List<MemberDto> list = (List<MemberDto>)request.getAttribute("list");
%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>hello jsp</h1>

<table border="1">
<tr>
	<th>번호</th><th>아이디</th><th>비번</th><th>이름</th>
</tr>

<%
for(int i = 0;i < list.size(); i++){
	MemberDto mem = list.get(i);
%>
<tr>	
	<th><%=i + 1 %></th>
	<td><%=mem.getId() %></td>
	<td><%=mem.getPwd() %></td>
	<td><%=mem.getName() %></td>
</tr>
<%
}
%>

</table>

<br>

<form action="home.do">
ID:<input type="text" name="id">
<input type="submit" value="회원정보">
</form>


</body>
</html>


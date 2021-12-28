<%@page import="mul.camp.a.dto.HumanDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	List<HumanDto> list = (List<HumanDto>)request.getAttribute("list");
%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>world jsp 입니다</h2>

<table border="1">
<tr>
	<th>직업</th><th>나이</th>
</tr>

<%
for(int i = 0;i < list.size(); i++){
	HumanDto dto = list.get(i);
%>
<tr>
	<td><%=dto.getJob() %></td><td><%=dto.getAge() %></td>
</tr>
<%
}
%>

</table>













</body>
</html>



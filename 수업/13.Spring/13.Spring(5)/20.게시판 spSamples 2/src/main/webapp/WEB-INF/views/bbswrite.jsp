<%@page import="mul.camp.a.dto.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
// session에서 사용자 정보를 산출
MemberDto mem = (MemberDto)request.getSession().getAttribute("login");
%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>글추가</h1>

<div align="center">

<form action="bbswriteAf.do" method="post">

<table border="1" style="width: 1000px">
<tr>
	<th>아이디</th>
	<td>
		<input type="text" name="id" size="70px" value="<%=mem.getId() %>" readonly="readonly">
	</td>	
</tr>
<tr>
	<th>제목</th>
	<td>
		<input type="text" name="title" size="70px">
	</td>
</tr>
<tr>
	<th>내용</th>
	<td>
		<textarea rows="20" cols="80" name="content"></textarea>
	</td>
</tr>
<tr>
	<td colspan="2">
		<input type="submit" value="글쓰기">
	</td>
</tr>

</table>



</form>


</div>




</body>
</html>







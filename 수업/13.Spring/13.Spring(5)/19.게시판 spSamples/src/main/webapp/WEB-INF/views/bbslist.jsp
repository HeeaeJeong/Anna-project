<%@page import="java.util.List"%>
<%@page import="mul.camp.a.dto.BbsDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
List<BbsDto> bbslist = (List<BbsDto>)request.getAttribute("bbslist");
%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</head>
<body>

<h1>게시판</h1>

<div align="center">
<!--   attribute  property   -->
<table class="table table-hover" style="width: 1000px">
<!-- <col width="30"><col width="200"><col width="80"> -->

<thead>
<tr>
	<th>번호</th><th>제목</th><th>seq</th><th>작성자</th>
</tr>
</thead>

<tbody>
<%
if(bbslist == null || bbslist.size() == 0){
	%>
	<tr>
		<td colspan="3">작성된 글이 없습니다</td> 
	</tr>
	<%
}else{
	
	for(int i = 0;i < bbslist.size(); i++){
		BbsDto bbs = bbslist.get(i);
	%>
		<tr>	
			<th><%=i+1 %></th>
			<td>
				<a href="bbsdetail.do?seq=<%=bbs.getSeq() %>">
					<%=bbs.getTitle() %>
				</a>
			</td>
			<td><%=bbs.getSeq() %></td>
			<td align="center"><%=bbs.getId() %></td>
		</tr>
	<%
	}
}
%>
</tbody>
</table>
</div>
<br>
<div align="center">
	<a href="bbswrite.do">글쓰기</a>
</div>

<!-- 
<script type="text/javascript">
location.href = "bbslist.do"; -> GET
</script>
 -->
</body>
</html>






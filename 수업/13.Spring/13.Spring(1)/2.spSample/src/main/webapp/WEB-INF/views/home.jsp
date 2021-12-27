<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>Home jsp 입니다</h2>

직업:<input type="text" id="job">
<br><button type="button" onclick="btnClick()">클릭</button>

<script type="text/javascript">
function btnClick() {
	alert('클릭!');
	
	let job = document.getElementById("job").value;
	alert(job);
	
	location.href = "world";
}

</script>

</body>
</html>




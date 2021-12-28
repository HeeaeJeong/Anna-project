<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>

<h2>hello jsp 입니다</h2>

<%--
		Jquery : Java Script를 경량화, 간략화
				 Ajax(비동기 통신) Asynchronous Javascript And Xml
 --%>

<p id="demo">안녕하세요</p>
<h3>반갑습니다</h3>
<div>건강하세요</div>

<script type="text/javascript">

// DOM
let demo = document.getElementById("demo").innerHTML;
// document.getElementsByTagName()
// document.getElementsByClassName()

console.log(demo);

document.getElementById("demo").innerHTML = "nice to meet you";

</script>


</body>
</html>








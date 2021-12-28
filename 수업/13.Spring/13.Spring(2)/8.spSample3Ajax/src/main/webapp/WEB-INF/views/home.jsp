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

<h2>home jsp</h2>

이름:<input type="text" id="alias"><br><br>
<button type="button" id="abtn">별명첵크</button>
<h3 id="answer"></h3>

<script type="text/javascript">
$("#abtn").click(function () {
//	alert('click');

//	alert( $("#alias").val() );

	$.ajax({
		url:"alias.do",
		type:"get",
		data:"alias=" + $("#alias").val(),	// ----------------- 보낼 데이터의 셋팅
		success:function( rep ){
			alert('success');
			alert(rep);
			
			$("#answer").text( rep );
		},
		error:function(){
			alert('error');
		}
	});

});
</script>


</body>
</html>









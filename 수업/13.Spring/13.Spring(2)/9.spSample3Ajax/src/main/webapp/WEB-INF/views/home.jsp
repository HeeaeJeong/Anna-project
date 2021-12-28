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
		
		success:function( rep ){			// ------------------ 받은 데이터의 처리
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


<p id="demo"></p>

<script type="text/javascript">

let jsonData = [
					{
						"title":"탈무드",
						"date":"2011.05.12",
						"price":5400
					},
					{
						"title":"세계 경제의 흐름",
						"date":"2017.03.27",
						"price":6200
					},
					{
						"title":"머신러닝과 딥러닝",
						"date":"2019.04.25",
						"price":32000
					}
				];
				
document.getElementById("demo").innerHTML = jsonData[1].price;

//alert(jsonData);

</script>

<br><br>

<button type="button" onclick="getlist()">Get List</button>
<div id="human"></div>

<script type="text/javascript">
function getlist() {
	
	$.ajax({
		url:"getlist.do",
		type:"get",
		data:{ msg:"hi" },
		success:function( rep ){
		//	alert("success");
		//	alert(rep);		// -> json
		
			let str = JSON.stringify(rep);		// json -> string
		//	alert(str);
			
		//	alert(rep.length);	// json의 길이
		
			for(i = 0;i < rep.length; i++){
				
				let s = rep[i].job + " " + rep[i].age + "<br>";				
				$("#human").append(s);
			}
		},
		error:function(){
			alert("error");	
		}		
	})	
}
</script>



</body>
</html>





















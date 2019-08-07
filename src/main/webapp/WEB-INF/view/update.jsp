<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/index3.css">
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<script type="text/javascript">
$(function(){
  $.post("gettype",function(arr){
	  for (var i = 0; i < arr.length; i++) {
		$("select").append("<option value='"+arr[i].tid+"'>"+arr[i].tname+"</option>")
	} 
	 var tid=$("#tid").val();
	 $("#typeid").find("option[value='"+tid+"']").prop("selected",true)
  },"json")	
})

function add(){
	var param=$("form").serialize();
	$.post("update",param,function(flag){
		if(flag>0){
			alert("修改成功")
			location="list"
		}
	},"json")
}


</script>
</head>
<body>
<form>
<input type="hidden" id="tid" value="${zhiwu.tid}">
<table>
   <tr>
      <td>植物名称</td>
      <td>
        <input type="text" name="zname" value="${zhiwu.zname}">
        <input type="hidden" name="zid" value="${zhiwu.zid}">
      </td>
   </tr>
   <tr>
      <td>描述</td>
      <td>
        <input type="text" name="miaoshu" value="${zhiwu.miaoshu}">
      </td>
   </tr>
   <tr>
      <td>类别</td>
      <td>
         <select name="tid" id="typeid">
            <option>--请选择--</option>
         </select>
      </td>
   </tr>
    <tr>
      <td></td>
      <td>
        <input type="button" value="提交" onclick="add()">
      </td>
   </tr>
</table>
</form>
</body>
</html>
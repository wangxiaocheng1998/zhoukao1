<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/index3.css">
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<script type="text/javascript">
function xuan(own){
	$(":checkbox:gt(0)").attr("checked",own.checked)
}
function del(zid){
	$.post("del",{zid:zid},function(flag){
		if(flag>0){
			alert("删除成功")
			location="list"
		}
	},"json")
}
function plsc(){
	var zid = new Array();
	$(":checkbox:checked").each(function(i){
		zid[i]=$(this).val();
	})
	
	$.post("delete",{zid:zid},function(flag){
		if(flag>0){
			alert("批量删除成功")
			location="list"
		}
	},"json")
	
	
}

</script>
</head>
<body>
<form action="list" method="post">
<input type="text" name="zname" value="${zhiwu.zname}">
<input type="submit" value="搜索">
</form>
<a href="toadd"><input type="button" value="添加植物"></a>
<input type="button" value="批量删除" onclick="plsc()">
<table>
  <tr>
    <td>
       <input type="checkbox" onclick="xuan(this)">全选/全不选
     </td>
     <td>序号</td>
     <td>植物名称</td>
     <td>描述</td>
     <td>类别</td>
     <td>操作</td>
  </tr>
  <c:forEach items="${list}" var="z">
  <tr>
     <td>
       <input type="checkbox" value="${z.zid}">
     </td>
     <td>${z.zid}</td>
     <td>${z.zname}</td>
     <td>${z.miaoshu}</td>
     <td>${z.tname}</td>
     <td>
       <a href="tolook?zid=${z.zid}"><input type="button" value="查看"></a>
       <a href="toupdate?zid=${z.zid}"><input type="button" value="修改"></a>
       <input type="button" value="删除"  onclick="del(${z.zid})">
     </td>
  </tr>
  </c:forEach>
  <tr>
    <td colspan="10">
       <a href="list?page=1">首页</a>
       <a href="list?page=${page-1>0?page-1:1 }">上一页</a>
       <a href="list?page=${page+1<pages?page+1:pages }">下一页</a>
       <a href="list?page=${pages }">尾页</a>
    </td>
  </tr>
</table>
</body>
</html>
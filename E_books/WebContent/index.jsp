<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>开始页面</title>
<script type="text/javascript" src="js/jquery-1.11.2.js"></script>
<script type="text/javascript"  src="js/json.js"></script>
<script type="text/javascript">
				function c(){
					alert("添加成功");
				}
</script>
</head>
<body>
		<form action="bookController/add" method="post" id="myform">
		书名：<input type="text" name="bookname" ><br>
		作者：<input type="text" name="author"><br>
		出版社：<input type="text" name="press" ><br>
		出版时间：<input type="text" name="presdate" ><br>
		<input type="submit" value="添加" onclick="c()" ><br>
		<a href="bookController/selectAll">查询全部项目</a>
		</form>
		
</body>
</html>
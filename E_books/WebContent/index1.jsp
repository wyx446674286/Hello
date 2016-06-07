<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		<a href="he">hello</a><br>
		
		<a href="springmvc/a?id=1&name=xiaoming">a</a><br>
		
		<a href="springmvc/testMethod">test Method</a><br>
		
		<form action="bookController/add" method="post">
		书名：<input type="text" name="bookname"><br>
		作者：<input type="text" name="author"><br>
		出版社：<input type="text" name="press"><br>
		出版时间：<input type="text" name="presdate"><br>
		<input type="submit" name="Submit"><br>
		</form>
		
		
		<a href="springmvc/testRedirect">test Redirect</a><br>
		
		<a href="springmvc/select">查询</a><br>

</body>
</html>
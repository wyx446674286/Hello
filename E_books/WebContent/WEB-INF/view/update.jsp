<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>更新页面</title>
</head>
<body>
		<form action="../bookController/update" method="post">
		
		<input type="hidden" name="id" value="${requestScope.booklist.id }">

		书名:<input type="text" name="bookname"
			value="${requestScope.booklist.bookname }" />
		<p></p>
		作者:<input type="text" name="author"
			value="${requestScope.booklist.author }" />
		<p></p>
		出版社:<input type="text" name="press"
			value="${requestScope.booklist.press }" />
		<p></p>
		出版时间<input type="text" name="presdate"
			value="${requestScope.booklist.presdate }" />
		<p></p>
		<input type="submit" value="提交" />
	</form>

</body>
</html>
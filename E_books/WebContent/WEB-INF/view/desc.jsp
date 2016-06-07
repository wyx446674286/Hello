<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>中转页面</title>
</head>
<body>
		<form action="../bookController/like" method="post">
		
		<input type="text" name="bookname" value="${booklist.bookname }"/>
		<input type="submit" value="单个查询"/>
		
		<table>
		<tr>
			<td width="150">书名</td>
			<td width="150">作者</td>
			<td width="150">出版社</td>
			<td width="150">出版时间</td>
		</tr>
		
		<c:forEach items="${requestScope.book }" var="booklist">
		<tr>
			<td >${booklist.bookname }</td>
			<td >${booklist.author }</td>
			<td >${booklist.press }</td>
			<td >${booklist.presdate }</td>
			<td ><a href="../bookController/selectById?id=${booklist.id }">更新</a></td>
			<td ><a href="../bookController/delete?id=${booklist.id }">删除</a></td>
		</tr>
		</c:forEach>
		
		</table>
		</form>
</body>
</html>
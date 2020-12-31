<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>后台管理系统</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<frameset rows="76,*" framespacing="0" border="0">
  <frame src="<%=path %>/top.jsp" id="header-frame" name="header-frame" frameborder="no" scrolling="no">
  <frameset cols="180, 10, *" framespacing="0" border="0" id="frame-body">
    <frame src="back_stage_management/menu.jsp" frameborder="no" scrolling="yes">
    <frame src="back_stage_management/bar.jsp" frameborder="no" scrolling="no">
    <frame src="back_stage_management/main.jsp" name="mainCont" frameborder="no" scrolling="yes">
  </frameset>
</frameset><noframes></noframes>
</head>
<body>
</body>
</html>
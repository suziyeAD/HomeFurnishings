<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>header</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="back_stage_management/style/adminStyle.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div class="header">
 <div class="logo">
  <img src="back_stage_management/images/admin_logo.png" title="在哪儿"/>
 </div>

 <div class="fr top-link">
  <a href="#" target="_blank" title="访问站点"><i class="shopLinkIcon"></i><span>访问站点</span></a>
  <a href="back_stage_management/admin_list.jsp" target="mainCont" title="DeathGhost"><i class="adminIcon"></i><span>管理员：${username }</span></a>
  <a href="#" title="修改密码"><i class="clearIcon"></i><span>清除缓存</span></a>
  <a href="back_stage_management/revise_password.jsp" target="mainCont" title="修改密码"><i class="revisepwdIcon"></i><span>修改密码</span></a>
  <a target="_parent" href="MLoginout" title="安全退出" style="background:rgb(60,60,60);"><i class="quitIcon"></i><span>安全退出</span></a>
 </div>
</div>
</body>
</html>
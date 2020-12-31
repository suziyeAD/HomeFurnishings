<%@page import="javax.swing.text.StyledEditorKit.ForegroundAction"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>编辑会员资料</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="back_stage_management/style/adminStyle.css" rel="stylesheet" type="text/css" />
</head>
<body>
 <div class="wrap" id="app">
  <div class="page-title">
    <span class="modular fl"><i class="edit_user"></i><em>编辑会员资料</em></span>
  </div>
  <form action="hupdate" method="post">
  <table class="list-style">
   <tr>
    <td style="width:15%;text-align:right;">会员昵称：</td>
    <td><input type="text" class="textBox length-middle" name="userName" value="${huesr.userName}" /></td>
   </tr>
   <tr>
   	<td><input type="hidden" class="textBox length-middle" name="userId" value="${huesr.userId}"/></td>
   </tr>
   <tr>
    <td style="text-align:right;">电子邮件：</td>
    <td><input type="text" class="textBox length-middle" name="userEmail" value="${huesr.userEmail}"/></td>
   </tr>
   <tr>
    <td style="text-align:right;">手机号码：</td>
    <td><input type="text" class="textBox length-middle" name="userPhone" value="${huesr.userPhone}"/></td>
   </tr>
   <%-- <tr>
    <td style="text-align:right;">重置密码：</td>
    <td><input type="password" class="textBox length-middle" name="userPwd" value="${huesr.userPwd}"/></td>
   </tr>
   <tr>
  <td style="text-align:right;">确认密码：</td>
    <td><input type="password" class="textBox length-middle" name="userPwds" /></td> 
   </tr> --%>
   <tr>
    <td style="text-align:right;"></td>
    <td><input type="submit" class="tdBtn" value="更新保存" @click="updd"/></td>
   </tr>
  </table>
  </form>
 </div>
 <script type="text/javascript" src="../js/vue.js"></script>
 <script type="text/javascript" src="../js/axios.js"></script>
 <script type="text/javascript" src="../js/jquery-1.12.4.min.js"></script>
 <script type="text/javascript">
 var vm = new Vue({	
	 el:'#app',
		data:{
			userIds:''
		},
		methods:{
			
			updd:function(){
				
				axios.get("../hupdate",{
					params:{
						userId:this.userIds,
					}
				}).then(function(ret){
					
					var flag = ret.data;
					alert(flag);
				});
				//location.reload();
			}
		}
	});
</script>
</body>
</html>
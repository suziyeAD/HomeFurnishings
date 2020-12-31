<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%
  	String path=request.getContextPath();
  %>
<!DOCTYPE html>
<html>
<head>
<title>添加新会员</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link href="style/adminStyle.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="../js/jquery-1.12.4.min.js"></script>
</head>
<body>
 <div class="wrap" id="app">
  <div class="page-title">
    <span class="modular fl"><i class="add_user"></i><em>添加新会员</em></span>
  </div>
  <form action="user_list.jsp">
  <table class="list-style">
  <tr>
    <td style="width:15%;text-align:right;">会员编号：</td>
    <td><input type="text" class="textBox length-middle" id="userId" v-model="userIds"></td>
   </tr>
   <tr>
   <tr>
    <td style="width:15%;text-align:right;">会员昵称：</td>
    <td><input type="text" class="textBox length-middle" id="userName" v-model="userNames"></td>
   </tr>
   <tr>
    <td style="text-align:right;">设置密码：</td>
    <td><input type="password" class="textBox length-middle" id="userPwd" v-model="userPwds"/></td>
   </tr>
   <tr>
    <td style="text-align:right;">会员权限：</td>
    <td><input type="text" class="textBox length-middle" id="userPower" v-model="userPowers"/></td>
   </tr>
   <tr>
    <td style="text-align:right;">会员邮箱：</td>
    <td><input type="text" class="textBox length-middle" id="userEmail" v-model="userEmails"/></td>
   </tr>
   <tr>
    <td style="text-align:right;">手机号码：</td>
    <td><input type="text" class="textBox length-middle" id="userPhone" v-model="userPhones"/></td>
   </tr>
   <tr>
    <td style="text-align:right;">注册时间：</td>
    <td><input type="datetime-local" class="textBox length-middle" id="userTime" v-model="userTimes"/></td>
   </tr>
   <tr>
    <td style="text-align:right;"></td>
    <td><input type="submit" class="tdBtn" value="添加新用户" @click="add"/></td>
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
			userIds:'',
			userNames:'',
			userPwds:'',
			userPowers:'',
			userEmails:'',
			userPhones:'',
			userTimes:''
		},
		methods:{
			
			add:function(){
				
				axios.get("<%=path%>/hadd",{
					params:{
						userId:this.userIds,
						userName:this.userNames,
						userPwd:this.userPwds,
						userPower:this.userPowers,
						userEmail:this.userEmails,
						userPhone:this.userPhones,
						userTime:this.userTimes
					}
				}).then(function(ret){
					
					var flag = ret.data;
					alert(flag);
				});
				location.reload();
			}
		}
	});
</script>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
		<link rel="stylesheet" type="text/css" href="css/public.css"/>
		<link rel="stylesheet" type="text/css" href="css/login.css"/>
</head>
<body>
		<!-------------------login-------------------------->
		<div class="login" id="app">
			<form action="Login" method="post">
				<h1><a href="index.jsp"><img src="img/temp/logo.png"></a></h1>
				<p></p>
				<div class="msg-warn hide"><b></b>公共场所不建议自动登录，以防账号丢失</div>
				<p><input type="text" name="username"  value="${username }" placeholder="昵称/邮箱/手机号"></p>
				<p>
					<input type="text" name="password" v-model="password" @blur="checkPwd" value="" placeholder="密码">
					<span style="position:absolute;font-size:15px;margin-top:10px;color:#c10000">${selectResult }{{prompt}}</span>
				</p>
				<p><input type="submit" name="" :disabled="disabled"  value="登  录"></p>
				<p class="txt"><a class="" href="reg.jsp">免费注册</a><a href="forget.jsp">忘记密码？</a></p>
			</form>
		</div>
		 <script src="js/vue.js" type="text/javascript"></script>
		<script src="js/axios.js" type="text/javascript"></script>
		<script>
		 var vm=new Vue({
			el:"#app",
			data:{
				disabled:true,
				prompt:'',
				password:''
			},
			methods:{
				checkPwd:function(){
					const reg =/^[a-zA-Z0-9]{4,10}$/;//密码由英文字母和数字组成的4-10位字符
					if(this.password!=''){
						if(reg.test(this.password)){
							vm.disabled=false;
							this.prompt='';
							
	
						}else{
							this.prompt="密码非法",
							vm.disabled=true
						}
					}else{
						this.prompt="";
						vm.disabled=true
					}
				}
			}
			
		}) 
		</script>
	</body>
</html>
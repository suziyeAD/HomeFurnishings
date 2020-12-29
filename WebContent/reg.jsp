<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
		<link rel="stylesheet" type="text/css" href="css/public.css"/>
		<link rel="stylesheet" type="text/css" href="css/login.css"/>
</head>
<body>
		<!-------------------reg-------------------------->
		<div class="reg" id="app">
			<form action="#" method="post">
				<h1><a href="index.jsp"><img src="img/temp/logo.png"></a></h1>
				<p>用户注册</p>
				<p>
					<input type="text" name="" value="" v-model="username" @blur="checkUser" placeholder="昵称/请输入邮箱/手机号">
					<span style="position:absolute;font-size:15px;margin-top:10px;color:#c10000">{{promptUser}}</span>
				</p>
				<p>
					<input type="text" name="" value="" v-model="password" @blur="checkPwd"  placeholder="请输入密码">
					<span style="position:absolute;font-size:15px;margin-top:10px;color:#c10000">{{promptPwd}}</span>
				</p>
				<p>
					<input type="text" name="" value="" v-model="confirePwd" @blur="checkConPwd" placeholder="请确认密码">
					<span style="position:absolute;font-size:15px;margin-top:10px;color:#c10000">{{promptConPwd}}</span>
				</p>
				<p class="txtL txt"><input class="code" v-model="VerificationCode" style="vertical-align: middle" type="text" name="" value="" placeholder="验证码">
					<%--图形验证码--%>
					<img  class="btnSearch" id="code" src="${pageContext.request.contextPath }/validatecode.jsp"  onclick="loadimage();" />					
					<span style="position:absolute;font-size:15px;margin-top:10px;color:#c10000">{{checkCode}}</span>
				</p>
				<p><input type="button" name="" value="注册" @click="register"></p>
				<p class="txtL txt">完成此注册，即表明您同意了我们的<a href="#"><使用条款和隐私策略></a></p>
				<p class="txt"><a href="login.jsp"><span></span>已有账号登录</a></p>
				<!--<a href="#" class="off"><img src="img/temp/off.png"></a>-->
			</form>
		</div>
		<script src="js/vue.js" type="text/javascript"></script>
		<script src="js/axios.js" type="text/javascript"></script>

		<script type="text/javascript">
		var vm=new Vue({
			el:'#app',
			data:{
				username:'',
				password:'',
				confirePwd:'',
				promptUser:'',
				promptPwd:'',
				promptConPwd:'',	
				checkCode:'',
				VerificationCode:'',
				checkUserFlag:false
			},
			methods:{
				//检查用户名是否合法
				checkUser:function(){
					const reg = /^[a-zA-Z][a-zA-Z0-9]{3,15}$/;//用户名由英文字母和数字组成的4-16位字符，以字母开头
					const reg1 = /^[a-zA-Z0-9]+([-_.][a-zA-Z0-9]+)*@[a-zA-Z0-9]+([-_.][a-zA-Z0-9]+)*\.[a-z]{2,}$/;//邮箱验证
					const reg2=/^((13[0-9])|(17[0-1,6-8])|(15[^4,\\D])|(18[0-9]))\d{8}$/;//手机号验证
					if(this.username!=''){
						if(reg.test(this.username) ||reg1.test(this.username) ||reg2.test(this.username)){
								//检查是否拥有用户名
							axios.get('checkuser',{
								params:{
									username:this.username,
								}
							}).then(function(ret){
								vm.promptUser=ret.data
								if(ret.data=="用户名已存在"){
									checkUserFlag= false;
								}else{
									checkUserFlag= true;
								}
							}); 
							
						}else{
							this.promptUser="用户名非法"
								checkUserFlag= false;
						}
					}else{
						this.promptUser=""
							checkUserFlag= false;
					}
					return checkUserFlag;
					
				},
				checkPwd:function(){
					const reg =/^[a-zA-Z0-9]{4,10}$/;//密码由英文字母和数字组成的4-10位字符
					if(this.password!=''){
						if(reg.test(this.password)){
							this.promptPwd='密码成立'
							return true;
						}else{
							this.promptPwd="密码非法"
						}
					}else{
						this.promptPwd=""
					}
					return false;
				},
				//确认两次密码是否一致
				checkConPwd:function(){
					if(this.confirePwd!=''){
						if(this.password!=this.confirePwd){
							this.promptConPwd="密码不一致"
						}else{
							this.promptConPwd=""
								return true;
						}
					}else{
						this.promptConPwd=""
					}
					return false;
				},
				register:function(){
					//调用三个检查方法，如果返回值都为true，则可以提交 
					if(this.checkUser()&&this.checkPwd()&&this.checkConPwd()){
						
			        	 axios.get('Register',{
							params:{
								username:this.username,
								password:this.password,
								VerificationCode:this.VerificationCode,
							}
						}).then(function(ret){
							var num=ret.data;
							if(num=="0" || num=="-1"  ){
								vm.checkCode='验证码错误'
							}else{
								window.location.href ="login.jsp";
							}
						}); 
					}
				}
						
					
			}
		});
		function loadimage(){
			document.getElementById("code").src = "${pageContext.request.contextPath }/validatecode.jsp?"+Math.random();
		}
		</script>
	</body>
</html>
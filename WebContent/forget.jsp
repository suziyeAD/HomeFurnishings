<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>forget</title>
		<link rel="stylesheet" type="text/css" href="css/public.css"/>
		<link rel="stylesheet" type="text/css" href="css/proList.css" />
		<link rel="stylesheet" type="text/css" href="css/forget.css" />
</head>
<body>
		<!----------------------------------------order------------------>
		<div class="order cart">
			<!-----------------logo------------------->
			<div class="logo">
				<h1 class="wrapper clearfix">
					<a href="index.jsp"><img class="fl" src="img/temp/logo.png"></a>
				</h1>
			</div>
			<div class="forCon" id="app">
				<p>安全设置-找回密码</p>
				<ul>
					<li class="on"><span>01/</span>输入登录名</li>
					<li><span>02/</span>验证信息</li>
					<li><span>03/</span>重置密码</li>
				</ul>
				<div class="formCon">
					<!--步骤1-->
					<form action="#" method="post" class="one">
						<input type="text" @blur="checkUser" v-model="username" value=""  placeholder="手机号/邮箱"><label>请输入手机号/邮箱</label><br />
						<input type="text"  v-model="Code" @blur="nextStep1"  value="" placeholder="验证码"><label>请输入图形验证码</label><br />
						<img src="CaptchaServlet" id="code" onclick="loadimage()">
						<span style="position:absolute;font-size:20px;margin-top:10px;margin-left:20px;color:#c10000">{{prompt}}</span><br>
						<input type="button" @click="sendEmail"  :disabled="disabled"   v-model="sendCode" class="sendCode">
						<input type="button"   :disabled="disabled1" value="下一步" :style="{display:disp}" class="next"  >
					</form>
					<!--步骤2-->
					<form action="#" method="post" class="two">
						<p>电子邮箱：<span>{{username}}</span></p>
						<p class="tip">验证邮件已发往你的电子邮箱，请输入邮件中的验证码完成验证</p>
						<input type="text" @blur="checkEmailCode" v-model="emailCode" value="请输入邮箱验证码" >
						<span style="position:absolute;font-size:20px;margin-top:10px;margin-left:20px;color:#c10000">{{codeResult}}</span><br>
						<input type="button"  :disabled="disabled2" value="下一步" class="next1" >
				
					</form>
					<!--步骤3-->
					<form action="#" method="post" class="three">
						<label>原密码：</label><input type="text" v-model="changePwd" value=""><br />
						<label>确认密码：</label><input type="text" v-model="confirPwd" value=""><br />

						<input type="button" @click="changePWD" value="完成">
						<span style="position:absolute;font-size:20px;margin-top:10px;margin-left:20px;color:#c10000">{{promtChangePwd}}</span>
					</form>
				</div>
			</div>
		</div>
		
		<script src="js/jquery-1.12.4.min.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/public.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/pro.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/vue.js" type="text/javascript"></script>
		<script src="js/axios.js" type="text/javascript"></script>
		<script>
		var vm=new Vue({
			el:'#app',
			data:{
				username:'',
				Code:'',
				prompt:'',
				disp:'none',
				disabled:false,
				disabled1:true,
				disabled2:true,
				time:0,
				sendCode:'获取验证码',
				codeResult:'',
				emailCode:'',
				changePwd:'',
				confirPwd:'',
				promtChangePwd:''
			},
			methods:{
				checkUser:function(){
					var flag=false;
					const reg = /^[a-zA-Z0-9]+([-_.][a-zA-Z0-9]+)*@[a-zA-Z0-9]+([-_.][a-zA-Z0-9]+)*\.[a-z]{2,}$/;//邮箱验证
					if(this.checkUsername !=''){
						if(reg.test(this.username)){
							this.prompt="";
							flag=true;
						}else{
							this.prompt="邮箱错误";
						}
					}else{
						this.prompt="邮箱为空";
					}
					return flag;
				},
				checkCode:function(){
					if(this.Code==""){
						this.prompt="验证码为空";
					}else{
						this.prompt="";
					}
				},
				sendEmail:function(){
					
					if(this.checkUser()){
						this.prompt="邮箱验证已发送";
						this.time=60;
						vm.timer();
						axios.get('SendEmail',{
							params:{
								username:this.username,
							}
						}).then(function(ret){
							if(ret.data){
								
								vm.disp="inline";
								
							}else{
								this.prompt="邮箱错误";
							}
							
						}); 
					}else{
						this.prompt="邮箱错误";
					}
					
				},
				 timer:function() {
				    if (this.time > 0) {
				      this.time--;
				      this.disabled=true;
				      this.sendCode=this.time+"s后重新获取";
				      setTimeout(this.timer, 1000);
				    } else{
				      this.disabled=0;
				      this.sendCode="获取验证码";
				      this.disabled=false;
				    }
				   },
				 nextStep1:function(){
					 if(this.Code==''){
						 this.prompt="验证码为空";
					 }else{
						 axios.get('forgetStep1',{
								params:{
									Code:this.Code,
								}
							}).then(function(ret){
							
								if(ret.data){
									vm.disabled1=false;
									
								}else{
									this.prompt=" 验证码错误";
								}
								
							}); 
					 }
				 },
				 checkEmailCode:function(){
					 axios.get('forget2',{
							params:{
								emailCode:this.emailCode,
							}
						}).then(function(ret){
							
							if(ret.data){
							
								vm.disabled2=false;
								
							}else{
								vm.codeResult="验证码错误";
							}
							
						}); 
				 },
				 changePWD:function(){
					 const reg =/^[a-zA-Z0-9]{4,10}$/;//密码由英文字母和数字组成的4-10位字符
					if(this.confirPwd!=''){
							if(reg.test(this.confirPwd)){
								axios.get('changePwd',{
									params:{
										username:this.username,
										changePwd:this.changePwd,
										confirPwd:this.confirPwd,
									}
								}).then(function(ret){
									
									if(ret.data){
									
										window.location.href ="login.jsp";
										
									}else{
										vm.promtChangePwd="原密码错误";
									}
									
								}); 
							}else{
								this.promtChangePwd="密码非法"
							}
					}else{
							this.promtChangePwd=""
						}
					 
				 }
			}
		})
				
			//重新加载验证图片
			function loadimage(){
				 var imgSrc = $("#code");
	             var src = imgSrc.attr("src");
          	 	//时间戳 ,为了使每次生成图片不一致，即不让浏览器读缓存，所以需要加上时间戳  
            	 var timestamp = (new Date()).valueOf();
            	 src =src +"?timestamp=" + timestamp;;
				 imgSrc.attr("src", src);
				//$("#code").attr("src",'CaptchaServlet')
				//document.getElementById("code").src = "CaptchaServlet";
			}
		</script>
	</body>
</html>
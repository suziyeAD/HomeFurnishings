<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>后台管理中心起始页面</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="style/adminStyle.css" rel="stylesheet" type="text/css" />
<script src="js/jquery.js"></script>
<!-- <script src="js/eject.js"></script> -->
<script src="js/public.js"></script>

<script src="js/vue.js" type="text/javascript"></script>
<script src="js/axios.js" type="text/javascript"></script>

<style>html,body{width:100%;height:100%;}</style>
</head>
<body>
<div id="deng">
<div class="wrap start-page">
 <h1><i class="home-icon"></i>欢迎回到家居智能管理中心</h1>
 <dl>
  <dt>订单统计信息</dt>
  <dd>
   <ul>
    <li>
     <span>购物车订单：</span>
     <span>{{user4}}</span>
    </li>
    <li>
     <span>已支付订单：</span>
     <span>{{user5}}</span>
    </li>
    <li>
     <span>未支付订单：</span>
     <span>{{user3}}</span>
    </li>
   </ul>
  </dd>
 </dl>
 
 <dl>
  <dt>商品统计信息</dt>
  <dd>
   <ul>
    <li>
     <span>商品总数量：</span>
     <span>{{user6}}</span>
    </li>
    <li>
     <span>商品总价：</span>
     <span>{{user7}}</span>
    </li>
   <!--  <li>
     <span>收益总金额：</span>
     <span></span>
    </li> -->

   </ul>
  </dd>
 </dl>
 
 <dl>
  <dt>人员分类信息</dt>
  <dd>
   <ul>
    <li>
     <span>超级管理员：</span>
     <span>1</span>
    </li>
    <li>
     <span>普通管理员：</span>
     <span>{{user}}</span>
   
    </li>
    <li>
     <span>用户数量：</span>
     <span>{{user2}}</span>
    </li>
   </ul>
  </dd>
 </dl>
 
 </div>
</div>
 <script>
 var vm = new Vue({
		el:'#deng',
		data:{
			user:"",
			user2:"",
			user3:"",
			user4:"",
			user5:"",
			user6:"",
			user7:""
		},
		methods:{
			pro:function(){
				axios.get('../duser')
					.then((ret) => {
						this.user=ret.data;
					});
				},
			pro2:function(){
				axios.get('../user02')
					.then((ret) => {
						this.user2=ret.data;
					});
				},
				pro3:function(){
					axios.get('../shopping')
						.then((ret) => {
							this.user3=ret.data;
						});
					},
					pro4:function(){
						axios.get('../shopping02')
							.then((ret) => {
								this.user4=ret.data;
							});
						},
						pro5:function(){
							axios.get('../sayedproduct')
								.then((ret) => {
									this.user5=ret.data;
								});
							},
							pro6:function(){
								axios.get('../dallProduct')
									.then((ret) => {
										this.user6=ret.data;
									});
								},
								pro7:function(){
									axios.get('../dallproductprice')
										.then((ret) => {
											this.user7=ret.data;
										});
									}
			
		},
		mounted(){
			this.pro();
			this.pro2();
			this.pro3();
			this.pro4();
			this.pro5();
			this.pro6();
			this.pro7();
		}
	});		
</script>


</body>
</html>
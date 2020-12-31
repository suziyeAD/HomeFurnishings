<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>最家</title>
		<link rel="stylesheet" type="text/css" href="css/public.css"/>
		<link rel="stylesheet" type="text/css" href="css/myorder.css" />
</head>
<body>
	<div id="app" onsubmit="return false;">
		<!------------------------------head------------------------------>
		<div class="head ding">
			<div class="wrapper clearfix">
				<div class="clearfix" id="top">
					<h1 class="fl"><a href="index.jsp"><img src="img/logo.png"/></a></h1>
					<div class="fr clearfix" id="top1">
						<p class="fl">
							<a href="#" id="login">登录</a>
							<a href="#" id="reg">注册</a>
						</p>
						<form action="#" method="get" class="fl">
							<input type="text" placeholder="搜索" />
							<input type="button" />
						</form>
						<div class="btn fl clearfix">
							<a href="mygxin.jsp"><img src="img/grzx.png"/></a>
							<a href="#" class="er1"><img src="img/ewm.png"/></a>
							<a href="cart.jsp"><img src="img/gwc.png"/></a>
							<p><a href="#"><img src="img/smewm.png"/></a></p>
						</div>
					</div>
				</div>
				<ul class="clearfix" id="bott">
					<li><a href="index.jsp">首页</a></li>
					<li>
						<a href="#">所有商品</a>
						<div class="sList">
							<div class="wrapper  clearfix">
								<a href="paint.jsp">
									<dl>
										<dt><img src="img/nav1.jpg"/></dt>
										<dd>浓情欧式</dd>
									</dl>
								</a>
								<a href="paint.jsp">
									<dl>
										<dt><img src="img/nav2.jpg"/></dt>
										<dd>浪漫美式</dd>
									</dl>
								</a>
								<a href="paint.jsp">
									<dl>
										<dt><img src="img/nav3.jpg"/></dt>
										<dd>雅致中式</dd>
									</dl>
								</a>
								<a href="paint.jsp">
									<dl>
										<dt><img src="img/nav6.jpg"/></dt>
										<dd>简约现代</dd>
									</dl>
								</a>
								<a href="paint.jsp">
									<dl>
										<dt><img src="img/nav7.jpg"/></dt>
										<dd>创意装饰</dd>
									</dl>
								</a>
							</div>
						</div>
					</li>
					<li>
						<a href="flowerDer.jsp">装饰摆件</a>
						<div class="sList2">
							<div class="clearfix">
								<a href="proList.jsp">干花花艺</a>
								<a href="vase_proList.jsp">花瓶花器</a>
							</div>
						</div>
					</li>
					<li>
						<a href="decoration.jsp">布艺软饰</a>
						<div class="sList2">
							<div class="clearfix">
								<a href="zbproList.jsp">桌布罩件</a>
								<a href="bzproList.jsp">抱枕靠垫</a>
							</div>
						</div>
					</li>
					<li><a href="paint.jsp">墙式壁挂</a></li>
					<li><a href="perfume.jsp">蜡艺香薰</a></li>
					<li><a href="idea.jsp">创意家居</a></li>
				</ul>
			</div>
		</div>
		<!------------------------------idea------------------------------>
		<div class="address mt">
			<div class="wrapper clearfix">
				<a href="#" class="fl">首页</a>
				<span>/</span>
				<a href="mygxin.jsp">个人中心</a>
				<span>/</span>
				<a href="myorderq.jsp" class="on">我的订单</a>
			</div>
		</div>
		
		<!------------------------------Bott------------------------------>
	
		<div class="Bott">
			<div class="wrapper clearfix">
				<div class="zuo fl">
					<h3>
						<a href="#"><img src="img/tx.png"/></a>
						<p class="clearfix"><span class="fl">{{adminname}}</span><span class="fr">[退出登录]</span></p>
					</h3>
					<div>
						<h4>我的交易</h4>
						<ul>
							<li><a href="cart.jsp">我的购物车</a></li>
							<li><a href="myorderq.jsp">我的订单</a></li>
							<li><a href="myprod.jsp">评价晒单</a></li>
						</ul>
						<h4>个人中心</h4>
						<ul>
							<li><a href="mygxin.jsp">我的中心</a></li>
							<li><a href="address.jsp">地址管理</a></li>
						</ul>
						<h4>账户管理</h4>
						<ul>
							<li  class="on"><a href="mygrxx.jsp">个人信息</a></li>
							<li><a href="remima.jsp">修改密码</a></li>
						</ul>
					</div>
				</div>
				<div class="you fl">
					<div class="my clearfix">
						<h2 class="fl">我的订单</h2>
						<a href="#" class="fl">请谨防钓鱼链接或诈骗电话，了解更多&gt;</a>
					</div>
					<div class="dlist clearfix">
						<ul class="fl clearfix" id="wa">
							<li class="on"><a href="#">全部有效订单</a></li>
							<li></li>
							<li></li>
							<li><a href="javascript:;" id="testClick" @click="closeorder()">已收货</a></li>
						</ul>
						<form action="#" method="get" class="fr clearfix">
							<input type="text" placeholder="请输入商品名称、订单号" @keyup.enter="put()" v-model="mhvalue"/>
							<input type="button" name="" id="" value="" />
						</form>
					</div>
					
					
		<!------------------------------全部订单------------------------------>
					<div class="dkuang clearfix deng abc" v-for="(item,index) in list" >
						<p class="one fl" v-if="item.payedProduct_orderStatus=='已支付'||item.payedProduct_orderStatus=='已关闭'">{{item.payedProduct_orderStatus}}</p>
						<div  class="clearfix">
							
						</div>
						<div class="word clearfix">
							<ul class="fl clearfix">
								<li>{{item.payedProduct_paytime}}</li>
								<li>{{adminname}}</li>
								<li>订单号:{{item.payedProduct_orderId}}</li>
								<li>在线支付</li>
							</ul>
							<p class="fr">订单金额：<span >{{item.payedProduct_price*item.payedProduct_count}}</span>元</p>
						</div>
						<div class="shohou clearfix" >
							<a href="#" class="fl"><img :src="list[index].payedProduct_location" /></a>
							<p class="fl"><a href="#">{{item.payedProduct_name}}</a><a href="#" >¥{{item.payedProduct_price}}×{{item.payedProduct_count}}</a></p>
							<p class="fr">
								<a @click="shanchu(item.payedproduct_id)">确认收货</a>
								<a href="orderxq.jsp">订单详情</a>
							</p>
						</div>
					</div>

		
		<!------------------------------已关闭------------------------------>
					<div class="dkuang" v-for="(item2,index2) in listtwo">
						<p class="one">已收货</p>
						<div class="word clearfix">
							<ul class="fl clearfix">
								<li>{{item2.closedorder_closetime}}</li>
								<li>{{adminname}}</li>
								<li>订单号:{{item2.closedorderproduct_orderId}}</li>
								<li>在线支付</li>
							</ul>
							<p class="fr">订单金额：<span>{{item2.closedorder_price*item2.closedorder_count}}</span>元</p>
						</div>
						<div class="shohou clearfix">
							<a href="#" class="fl"><img src="img/g1.jpg"/></a>
							<p class="fl"><a href="#"></a>{{item2.closedorder_name}}<a href="#">¥{{item2.closedorder_price}}×{{item2.closedorder_count}}</a></p>
							<p class="fr">
								<a href="myprod.jsp">待评价</a>
								<a href="orderxq.jsp">订单详情</a>
							</p>
						</div>
					</div>


			<!------------------------------------------------------------>
					
					<div class="fenye clearfix">
						<a href="#" @click="left"><img src="img/zuo.jpg"/></a>
						<a href="#" v-model="cpage">{{cpage}}</a>
						<a href="#" @click="right"><img src="img/you.jpg" /></a>
					</div>
				</div>
			</div>
		</div>
		<!--返回顶部-->
		<div class="gotop">
			<a href="cart.jsp">
			<dl>
				<dt><img src="img/gt1.png"/></dt>
				<dd>去购<br />物车</dd>
			</dl>
			</a>
			<a href="#" class="dh">
			<dl>
				<dt><img src="img/gt2.png"/></dt>
				<dd>联系<br />客服</dd>
			</dl>
			</a>
			<a href="mygxin.jsp">
			<dl>
				<dt><img src="img/gt3.png"/></dt>
				<dd>个人<br />中心</dd>
			</dl>
			</a>
			<a href="#" class="toptop" style="display: none">
			<dl>
				<dt><img src="img/gt4.png"/></dt>
				<dd>返回<br />顶部</dd>
			</dl>
			</a>
			<p>400-800-8200</p>
		</div>
		<!--footer-->
		<div class="footer">
			<div class="top">
				<div class="wrapper">
					<div class="clearfix">
						<a href="#2" class="fl"><img src="img/foot1.png"/></a>
						<span class="fl">7天无理由退货</span>
					</div>
					<div class="clearfix">
						<a href="#2" class="fl"><img src="img/foot2.png"/></a>
						<span class="fl">15天免费换货</span>
					</div>
					<div class="clearfix">
						<a href="#2" class="fl"><img src="img/foot3.png"/></a>
						<span class="fl">满599包邮</span>
					</div>
					<div class="clearfix">
						<a href="#2" class="fl"><img src="img/foot4.png"/></a>
						<span class="fl">手机特色服务</span>
					</div>
				</div>
			</div>
			<p class="dibu">最家家居&copy;2013-2017公司版权所有 京ICP备080100-44备0000111000号<br />
			违法和不良信息举报电话：188-0130-1238，本网站所列数据，除特殊说明，所有数据均出自我司实验室测试</p>
		</div>
		</div>
		<script src="js/jquery-1.12.4.min.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/public.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/user.js" type="text/javascript" charset="utf-8"></script>
		<script type="text/javascript" src="js/axios.js"></script>
		<script type="text/javascript" src="js/vue.js"></script>
		<script>
		
			var vm = new Vue({
				el:"#app",
				data:{
					list:[],
					listtwo:[],
					result:'',
					adminname:'',
					mhvalue:'',
					cpage:1
				},
				methods:{
					startfirst:function(){
    					axios.get('pay').then((ret)=>{
    						this.list=ret.data;
						});
    				},
    				username:function(){
    					axios.get('user').then((ret)=>{
    						this.adminname=ret.data.user_name
						});
    				},
    				closeorder:function(){
    					axios.get('close').then((ret)=>{
    						this.listtwo=ret.data
						});
    				},
    				shanchu:function(id){
    					axios.get('del',{
    						params:{
    							sid:id
    						}
    					}).then((ret)=>{
    						alert("收货成功！");
    						location.reload();
						});
    				},
    				put:function(){
    					axios.get('mhcx',{
    						params:{
    							mhvalue:this.mhvalue
    						}
    					}).then((ret)=>{
    						this.list=ret.data;
						});
    					axios.get('mhcxcs',{
    						params:{
    							mhvalue:this.mhvalue
    						}
    					}).then((ret)=>{
    						this.listtwo=ret.data;
						});
    				},
    				right:function(){
    					this.cpage+=1;
    					axios.get('page',{
    						params:{
    							cpage:this.cpage
    						}
    					}).then((ret)=>{
    						this.list=ret.data
						});
    				},
    				left:function(){
    					this.cpage-=1;
    					axios.get('page',{
    						params:{
    							cpage:this.cpage
    						}
    					}).then((ret)=>{
    						this.list=ret.data
						});
    				}
				},
				mounted(){
					this.startfirst();
					this.username();
				}
			});
		</script>
	</body>
</html>
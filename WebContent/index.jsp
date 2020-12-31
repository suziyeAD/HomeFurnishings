<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/jsp; charset=UTF-8">
		<title>最家</title>
		<link rel="stylesheet" type="text/css" href="css/public.css" />
		<link rel="stylesheet" type="text/css" href="css/index.css" />
	</head>
	<body>
		<!------------------------------head------------------------------>
		<div class="head">
			<div class="wrapper clearfix">
				<div class="clearfix" id="top">
					<h1 class="fl"><a href="index.jsp"><img src="img/logo.png" /></a></h1>
					<div class="fr clearfix" id="top1">
						<span style="display:none" id="login2">${username }</span>
						<span id="loginName" style="position:relative;right:355px;top:20px;font-size:18px">${username }</span>
						<p class="fl" id="users">
							<a href="login.jsp" id="login">登录</a>
							<a href="reg.jsp" id="reg">注册</a>
						</p>
						<form action="#" method="get" class="fl">
							<input type="text" placeholder="热门搜索：干花花瓶" />
							<input type="button" />
						</form>
						<div class="btn fl clearfix">
							<a href="mygxin.jsp"><img src="img/grzx.png" /></a>
							<a href="#" class="er1"><img src="img/ewm.png" /></a>
							<a href="cart.jsp"><img src="img/gwc.png" /></a>
							<p><a href="#"><img src="img/smewm.png" /></a></p>
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
										<dt><img src="img/nav1.jpg" /></dt>
										<dd>浓情欧式</dd>
									</dl>
								</a>
								<a href="paint.jsp">
									<dl>
										<dt><img src="img/nav2.jpg" /></dt>
										<dd>浪漫美式</dd>
									</dl>
								</a>
								<a href="paint.jsp">
									<dl>
										<dt><img src="img/nav3.jpg" /></dt>
										<dd>雅致中式</dd>
									</dl>
								</a>
								<a href="paint.jsp">
									<dl>
										<dt><img src="img/nav6.jpg" /></dt>
										<dd>简约现代</dd>
									</dl>
								</a>
								<a href="paint.jsp">
									<dl>
										<dt><img src="img/nav7.jpg" /></dt>
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
		<!-------------------------banner--------------------------->
		<div class="block_home_slider">
			<div id="home_slider" class="flexslider">
				<ul class="slides">
					<li>
						<div class="slide">
							<img src="img/banner2.jpg" />
						</div>
					</li>
					<li>
						<div class="slide">
							<img src="img/banner1.jpg" />
						</div>
					</li>
				</ul>
			</div>
		</div>

		<!------------------------------thImg------------------------------>
		<div class="thImg">
			<div class="clearfix">
				<a href="vase_proList.jsp"><img src="img/i1.jpg" /></a>
				<a href="proList.jsp"><img src="img/i2.jpg" /></a>
				<a href="#2"><img src="img/i3.jpg" /></a>
			</div>
		</div>
		<!------------------------------news------------------------------>
		<div id="app">
			<div class="news">
				<div class="wrapper">
					<h2><img src="img/ih1.jpg" /></h2>
					<div class="top clearfix">
						<a href="proDetail.jsp"><img src="img/n1.jpg" />
							<p></p>
						</a>
						<a href="proDetail.jsp"><img src="img/n2.jpg" />
							<p></p>
						</a>
						<a href="proDetail.jsp"><img src="img/n3.jpg" />
							<p></p>
						</a>
					</div>
					<div class="bott clearfix">
						<a href="proDetail.jsp"><img src="img/n4.jpg" />
							<p></p>
						</a>
						<a href="proDetail.jsp"><img src="img/n5.jpg" />
							<p></p>
						</a>
						<a href="proDetail.jsp"><img src="img/n6.jpg" />
							<p></p>
						</a>
					</div>
					<h2><img src="img/ih2.jpg" /></h2>
					<div class="flower clearfix tran ">
						<a class="clearfix" v-for="(item1,index) in list1" :key="item1.allProduct_id" :href="getId(item1.allProduct_id)">
							
							<dl>
								<dt>
									<span class="abl"></span>
									<img :src="list1[index].allProduct_location" />
									<span class="abr"></span>
								</dt>
								<dd>{{item1.allProduct_name}}</dd>
								<dd><span >¥ {{item1.allProduct_price}}</span></dd>
							</dl>
						</a>
					</div>
					<div class="flower clearfix tran ">
						<a  class="clearfix" v-for="(item1,index) in list3" :key="item1.allProduct_id" :href="getId(item1.allProduct_id)">
							<dl>
								<dt>
									<span class="abl"></span>
									<img :src="list3[index].allProduct_location" />
									<span class="abr"></span>
								</dt>
								<dd>{{item1.allProduct_name}}</dd>
								<dd><span>¥ {{item1.allProduct_price}}</span></dd>
							</dl>
						</a>
					</div>
				</div>
				<!------------------------------ad------------------------------>
				<a href="#" class="ad"><img src="img/ib1.jpg" /></a>

				<!------------------------------people------------------------------>
				<div class="people">
					<div class="wrapper">
						<h2><img src="img/ih3.jpg" /></h2>
						<div class="pList clearfix tran">
							<a  v-for="(item2,index) in list2" :key="item2.allProduct_id" :href="getId(item2.allProduct_id)">
								<dl>
									<dt>
										<span class="abl"></span>
										<img :src="list2[index].allProduct_location" />
										<span class="abr"></span>
									</dt>
									<dd>{{item2.allProduct_name}}</dd>
									<dd><span>￥{{item2.allProduct_price}}</span></dd>
								</dl>
							</a>
						</div>
						<div class="pList clearfix tran">
							<a  v-for="(item2,index) in list4" :key="item2.allProduct_id" :href="getId(item2.allProduct_id)">
								<dl>
									<dt>
										<span class="abl"></span>
										<img :src="list4[index].allProduct_location"/>
										<span class="abr"></span>
									</dt>
									<dd>{{item2.allProduct_name}}</dd>
									<dd><span>￥{{item2.allProduct_price}}</span></dd>
								</dl>
							</a>
						</div>
						<div class="pList clearfix tran">
							<a  v-for="(item2,index) in list5" :key="item2.allProduct_id" :href="getId(item2.allProduct_id)">
								<dl>
									<dt>
										<span class="abl"></span>
										<img :src="list5[index].allProduct_location" />
										<span class="abr"></span>
									</dt>
									<dd>{{item2.allProduct_name}}</dd>
									<dd><span>￥{{item2.allProduct_price}}</span></dd>
								</dl>
							</a>
						</div>
					</div>
				</div>
			</div>
		</div>
		<script src="js/vue.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/axios.js" type="text/javascript" charset="utf-8"></script>
		<script type="text/javascript">
			var vm = new Vue({
				el: '#app',
				data: {
					list1: [],
					list2: [],
					list3: [],
					list4: [],
					list5: []
				},
				methods: {
					indexwall: function() {
						axios.get('wall').then((ret) => {
							this.list2 = ret.data;
						});
					},
					indexflower: function() {
						axios.get('flower').then((ret) => {
							this.list1 = ret.data;
						});
					},
					indexflower2: function() {
						axios.get('flower2').then((ret) => {
							this.list3 = ret.data;
						});
					},
					indexwall2: function() {
						axios.get('wall2').then((ret) => {
							this.list4 = ret.data;
						});
					},
					indexwall3: function() {
						axios.get('wall3').then((ret) => {
							this.list5 = ret.data;
						});
					},
					getId:function(id){
						return 'sale?sid='+id;
					}
				},
				mounted() {
					this.indexflower();
					this.indexwall();
					this.indexflower2();
					this.indexwall2();
					this.indexwall3();
				}
			});
		</script>
		<!--返回顶部-->
		<div class="gotop">
			<a href="cart.jsp">
				<dl>
					<dt><img src="img/gt1.png" /></dt>
					<dd>去购<br />物车</dd>
				</dl>
			</a>
			<a href="#" class="dh">
				<dl>
					<dt><img src="img/gt2.png" /></dt>
					<dd>联系<br />客服</dd>
				</dl>
			</a>
			<a href="mygxin.jsp">
				<dl>
					<dt><img src="img/gt3.png" /></dt>
					<dd>个人<br />中心</dd>
				</dl>
			</a>
			<a href="#" class="toptop" style="display: none">
				<dl>
					<dt><img src="img/gt4.png" /></dt>
					<dd>返回<br />顶部</dd>
				</dl>
			</a>
			<p>400-800-8200</p>
		</div>

		<!-------------------login-------------------------->
		<!--footer-->
		<div class="footer">
			<div class="top">
				<div class="wrapper">
					<div class="clearfix">
						<a href="#2" class="fl"><img src="img/foot1.png" /></a>
						<span class="fl">7天无理由退货</span>
					</div>
					<div class="clearfix">
						<a href="#2" class="fl"><img src="img/foot2.png" /></a>
						<span class="fl">15天免费换货</span>
					</div>
					<div class="clearfix">
						<a href="#2" class="fl"><img src="img/foot3.png" /></a>
						<span class="fl">满599包邮</span>
					</div>
					<div class="clearfix">
						<a href="#2" class="fl"><img src="img/foot4.png" /></a>
						<span class="fl">手机特色服务</span>
					</div>
				</div>
			</div>
			<p class="dibu">最家家居&copy;2013-2017公司版权所有 京ICP备080100-44备0000111000号<br />
				违法和不良信息举报电话：400-800-8200，本网站所列数据，除特殊说明，所有数据均出自我司实验室测试</p>
		</div>

		<script src="js/jquery-1.12.4.min.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/public.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/nav.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/jquery.flexslider-min.js" type="text/javascript" charset="utf-8"></script>
		<script type="text/javascript">
			$(function() {
				$('#home_slider').flexslider({
					animation: 'slide',
					controlNav: true,
					directionNav: true,
					animationLoop: true,
					slideshow: true,
					slideshowSpeed: 2000,
					useCSS: false
				});

			});
			
			window.onload=	function ()
			{
				 var u1 =document.getElementById("loginName");//获取登录注册组件id
				var u2 =document.getElementById("users");//获取用户信息组件id
		 
		 
				var spans = $("#login2").html();//获取span的数据
		 
				if (spans !='' )//判断当前span数据是否为空
				{
					u2.style.visibility="hidden";//数据不为空则隐藏登录注册组件
					u1.style.visibility="show";
				}else{
					u2.style.visibility="show";
					u1.style.visibility="hidden";//数据为空则隐藏用户信息组件
				}
		 
			}
		 
		</script>


	</body>
</html>

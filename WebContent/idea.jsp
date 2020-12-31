<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>最家</title>
		<link rel="stylesheet" type="text/css" href="css/public.css"/>
		<link rel="stylesheet" type="text/css" href="css/idea.css" />
</head>
<body>
		<!------------------------------head------------------------------>
		<div class="head">
			<div class="wrapper clearfix">
				<div class="clearfix" id="top">
					<h1 class="fl"><a href="index.jsp"><img src="img/logo.png"/></a></h1>
					<div class="fr clearfix" id="top1">
						<p class="fl">
							<a href="login.jsp" id="login">登录</a>
							<a href="reg.jsp" id="reg">注册</a>
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
		<div class="address">
			<div class="wrapper clearfix">
				<a href="index.jsp" class="fl">首页</a>
				<span>/</span>
				<a href="idea.jsp" class="on">创意家居</a>
			</div>
		</div>
		<!------------------------------imgList1------------------------------>
		<div id="app">
			<div class="imgList1">
				<div class="wrapper">
					<div class="box1">
						<a href="proDetail.jsp" class="banner"><img src="img/idea1.jpg"/></a>
						<ul>
							<li v-for="(item,index) in list1"><a href="proDetail.jsp" :key="item.allProduct_id" :href="getId(item.allProduct_id)">
									<dl>
										<dt><img :src="list1[index].allProduct_location"/></dt>
										<dd>{{item.allProduct_name}}</dd>
										<dd>¥{{item.allProduct_price}}</dd>
									</dl>
								</a>
							</li>
						</ul>
						<ul>
							<li v-for="(item,index) in list2"><a href="proDetail.jsp" :key="item.allProduct_id" :href="getId(item.allProduct_id)">
									<dl>
										<dt><img :src="list2[index].allProduct_location"/></dt>
										<dd>{{item.allProduct_name}}</dd>
										<dd>¥{{item.allProduct_price}}</dd>
									</dl>
								</a>
							</li>
						</ul>
						<ul>
							<li v-for="(item,index) in list3"><a href="proDetail.jsp" :key="item.allProduct_id" :href="getId(item.allProduct_id)">
									<dl>
										<dt><img :src="list3[index].allProduct_location"/></dt>
										<dd>{{item.allProduct_name}}</dd>
										<dd>¥{{item.allProduct_price}}</dd>
									</dl>
								</a>
							</li>
						</ul>
					</div>
					<h2><img src="img/ih5.jpg"/></h2>
					<div class="box2">
						<a href="proDetail.jsp" class="banner"><img src="img/idea22.jpg"/></a>
						<ul>
							<li v-for="(item,index) in list4"><a href="proDetail.jsp" :key="item.allProduct_id" :href="getId(item.allProduct_id)">
									<dl>
										<dt><img :src="list4[index].allProduct_location"/></dt>
										<dd>{{item.allProduct_name}}</dd>
										<dd>¥{{item.allProduct_price}}</dd>
									</dl>
								</a>
							</li>
						</ul>
						<ul>
							<li v-for="(item,index) in list5"><a href="proDetail.jsp" :key="item.allProduct_id" :href="getId(item.allProduct_id)">
									<dl>
										<dt><img :src="list5[index].allProduct_location"/></dt>
										<dd>{{item.allProduct_name}}</dd>
										<dd>¥{{item.allProduct_price}}</dd>
									</dl>
								</a>
							</li>
						</ul>
					</div>
					<h2><img src="img/ih6.jpg"/></h2>
					<div class="box3">
						<ul>
							<li v-for="(item,index) in list6"><a href="proDetail.jsp" :key="item.allProduct_id" :href="getId(item.allProduct_id)">
									<dl>
										<dt><img :src="list6[index].allProduct_location"/></dt>
										<dd>{{item.allProduct_name}}</dd>
										<dd>¥{{item.allProduct_price}}</dd>
									</dl>
								</a>
							</li>
						</ul>
						<ul>
							<li v-for="(item,index) in list7"><a href="proDetail.jsp" :key="item.allProduct_id" :href="getId(item.allProduct_id)">
									<dl>
										<dt><img :src="list7[index].allProduct_location"/></dt>
										<dd>{{item.allProduct_name}}</dd>
										<dd>¥{{item.allProduct_price}}</dd>
									</dl>
								</a>
							</li>
						</ul>
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
					list1:[],
					list2:[],
					list3:[],
					list4:[],
					list5:[],
					list6:[],
					list7:[]
				},
				methods: {
					z_idea1: function() {
						axios.get('ideaOne1').then((ret) => {
							this.list1 = ret.data;
						});
					},
					z_idea2:function() {
						axios.get('ideaOne2').then((ret) => {
							this.list2 = ret.data;
						});
					},
					z_idea3:function() {
						axios.get('ideaOne3').then((ret) => {
							this.list3 = ret.data;
						});
					},
					z_idea4:function() {
						axios.get('ideaTwo1').then((ret) => {
							this.list4 = ret.data;
						});
					},
					z_idea5:function() {
						axios.get('ideaTwo2').then((ret) => {
							this.list5 = ret.data;
						});
					},
					z_idea6:function() {
						axios.get('ideaThree1').then((ret) => {
							this.list6 = ret.data;
						});
					},
					z_idea7:function() {
						axios.get('ideaThree2').then((ret) => {
							this.list7 = ret.data;
						});
					},
					getId:function(id){
						return 'sale?sid='+id;
					}
				},
				mounted() {
					this.z_idea1();
					this.z_idea2();
					this.z_idea3();
					this.z_idea4();
					this.z_idea5();
					this.z_idea6();
					this.z_idea7();
				}
			});
		</script>
		
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
			<a href="#" class="toptop" style="display: none;">
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
			违法和不良信息举报电话：400-800-8200，本网站所列数据，除特殊说明，所有数据均出自我司实验室测试</p>
		</div>
		<script src="js/jquery-1.12.4.min.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/public.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/nav.js" type="text/javascript" charset="utf-8"></script>
	</body>
</html>
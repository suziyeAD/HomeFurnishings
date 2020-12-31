<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>订单列表</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="style/adminStyle.css" rel="stylesheet" type="text/css" />
<script src="js/jquery.js"></script>
<script src="js/public.js"></script>
<script src="js/vue.js" type="text/javascript"></script>
<script src="js/axios.js" type="text/javascript"></script>
</head>
<body>
<div id="deng">
 <div class="wrap">
  <div class="page-title">
    <span class="modular fl"><i class="order"></i><em>订单列表</em></span>
  </div>
  <div class="operate">
   <form action="" method="">
    <img src="images/icon_search.gif"/>
    <input type="text" id="name" v-model="name" class="textBox length-long" placeholder="输入收货人姓名"/>
    <input type="text" id="name" v-model="pst" class="inline-select" placeholder="输入已支付、已关闭"/>
    <input type="button" value="查询" class="tdBtn" @click="pro" />  
   </form>
  </div>
  <table class="list-style Interlaced">
   <tr>
    <th>订单编号</th>
    <th>下单时间</th>
    <th>收件人</th>
    <th>订单金额</th>
    <th>订单状态</th>
    <th>操作</th>
   </tr>
   <tr v-for="item in list">
    <td>
     <input type="checkbox"/>
     <a href="order_detail.jsp"  @click="pro2(item.pid)" >{{item.pid}}</a>
    </td>
    <td class="center">
     <span class="block">{{item.ptime}}</span>
    </td>
    <td width="450">
     <span class="block">{{item.aname}}[{{item.aphone}}]</span>
     <address>{{item.axiangxi}}</address>
    </td>
    <td class="center">
     <span><i>￥</i><b>{{item.pric}}</b></span>
    </td>
    <td class="center">
     <span>{{item.pst}}</span>
    </td>
    <td class="center">

     <a href="order_detail.jsp" class="inline-block" title="查看订单"  @click="pro2(item.pid)" ><img src="images/icon_view.gif"/></a>
     <a class="inline-block" title="删除订单" @click="pro3(item.pid)"><img src="images/icon_trash.gif"/></a>
    </td>
   </tr>
  </table>
  <!-- BatchOperation -->
  <div style="overflow:hidden;">
      <!-- Operation -->
	  <div class="BatchOperation fl">
	   <input type="checkbox" id="del"/>
	   <label for="del" class="btnStyle middle" id="checkall"  name="checkall" οnclick="checkAll(checkall)">全选</label>  
	   <!-- <input type="checkbox" id="checkall"  name="checkall" οnclick="checkAll(checkall)" />  -->
	   <input type="button" value="删除订单" class="btnStyle"/>
	  </div>
	  <!-- turn page -->
	  <div class="turnPage center fr">
	   <a  @click="left">第一页</a>
	   <a v-model="cpage">{{cpage}}</a>
	   <a @click="right">最后一页</a>
	  </div>
  </div>
 </div>
 </div>
  
  <script>
  var vm = new Vue({
		el:'#deng',
		data:{
			list:[],
			name:'',
			pst:'',
			cpage:1

		},
		methods:{
			//搜索-姓名-订单状态
			pro:function(){
				if(this.name !="" && this.pst!=""){
					axios.get('../dorder',{
						params:{
							name:this.name,
							pst:this.pst
						}
					})
						.then((ret)=>{
							this.list=ret.data;
						});
				}else if(this.name =="" && this.pst==""){
					axios.get('../dorder02',{
					})
						.then((ret)=>{
							this.list=ret.data;
						});
				}else if(this.name !=""){
					axios.get('../dorder03',{
						params:{
							name:this.name,	
						}
					})
						.then((ret)=>{
							this.list=ret.data;
						});
				} 
				},
				pro2:function(id){
						axios.get('../dorder04',{
							params:{
								pid:id,
								
							}
						})
							.then((ret)=>{
								this.list=ret.data;
							});
		        },
		        pro3:function(id){
					axios.get('../ddel',{
						params:{
							pid:id,							
						}
					})
						.then((ret)=>{
							this.list=ret.data;
							this.init();
						});
	        },
	        right:function(){
				this.cpage+=1;
				axios.get('../dpage',{
					params:{
						cpage:this.cpage
					}
				}).then((ret)=>{
					this.list=ret.data
					
				});
			},
			left:function(){
				this.cpage-=1;
				axios.get('../dpage',{
					params:{
						cpage:this.cpage
					}
				}).then((ret)=>{
					this.list=ret.data
					
				});
			},
		
				//页面加载显示
				init:function(){	
						axios.get('../dorder02',{
						})
							.then((ret)=>{
								this.list=ret.data;
							});			
					}
		},
		mounted(){
		  this.init();
		}
	});	
  </script>
  
 
</body>
</html>
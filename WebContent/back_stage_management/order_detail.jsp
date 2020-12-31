<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
<title>订单详情</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="style/adminStyle.css" rel="stylesheet" type="text/css" />
<script src="js/vue.js" type="text/javascript"></script>
<script src="js/axios.js" type="text/javascript"></script>
</head>
<body>
<div id="deng">
 <div class="wrap">
  <div class="page-title">
    <span class="modular fl"><i class="order"></i><em>订单编号：${list[0]['pid']}</em></span>
  </div>
  <dl class="orderDetail">
   <dt class="order-h">订单详情</dt>
   <dd>
    <ul>
     <li>
      <span class="h-cont h-right">收件人姓名：${list[0]['aname']}</span>
     
     </li>
     <li>
      <span class="h-cont h-right">联系电话：</span>
      <span class="h-cont h-left">${list[0]['aphone']}</span>
     </li>
     <li>
      <span class="h-cont h-right">联系地址：</span>
      <span class="h-cont h-left">${list[0]['axiangxi']}</span>
     </li>
     <li>
      <span class="h-cont h-right">付款状态：</span>
      <span class="h-cont h-left">${list[0]['pst']}</span>
     </li>
     <li>
      <span class="h-cont h-right">下单时间：</span>
      <span class="h-cont h-left">${list[0]['ptime']}</span>
     </li>
    <!--  <li>
      <span class="h-cont h-right">付款时间：</span>
      <span class="h-cont h-left">2015-04-18 13:35</span>
     </li> -->
    </ul>
   </dd>
   <dd style="padding:1em 0;">
    <span><b>订单留言：</b></span>
    <span>发货请告知【${list[0]['aname']}】</span>
   </dd>
   <dd>
    <table class="list-style">
     <tr>
     <!--  <th>缩略图</th> -->
      <th>产品</th>
      <th>单价</th>
      <th>数量</th>
      <th>小计</th>
     </tr>
     <tr>
     <!--  <td><img src="#" class="thumbnail"/></td> -->
      <td>${list[0]['panme']}</td>
      <td>
       <span>
        <i>￥</i>
        <em>${list[0].pprice}</em>
       </span>
      </td>
      <td>${list[0].pcount}</td>
      <td>
       <span>
        <i>￥</i>
        <em>${list[0]['pric']}</em>
       </span>
      </td>
     </tr>
     <tr>
      <td colspan="5">
       <div class="fr">
        <span style="font-size:15px;font-weight:bold;">
         <i>订单共计金额：￥</i>
         <b>${list[0]['pric']}</b>
        </span>
       </div>
      </td>
     </tr>
    </table>
   </dd>
   <dd>
    <table class="noborder">
     <tr>
      <td width="10%" style="text-align:right;"><b>管理员操作：</b></td>
      <td>
       <textarea class="block" style="width:80%;height:35px;outline:none;"></textarea>
      </td>
     </tr>
    </table>
   </dd>
   <dd>
      <!-- Operation -->
	  <div class="BatchOperation">
	  <!--  <input type="button" value="打印订单" class="btnStyle"/>
	   <input type="button" value="配送" class="btnStyle"/>
	   <input type="button" value="发货" class="btnStyle"/> -->
	   <input type="button" value="返回订单列表"  class="btnStyle" @click="gotolink"/>
	  
	<div>
        <router-view></router-view>
    </div>
	  </div>
   </dd>
  </dl>
 </div>
 </div>
 
  <script>
  var vm = new Vue({
		el:'#deng',
		methods:{
			   gotolink:function(){
			     window.location.href = 'order_list.jsp'; 
			        }
		}	
	});	
  </script>
 
 
 
 
 
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
 	String path=request.getContextPath();
 %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>产品列表</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="style/adminStyle.css" rel="stylesheet" type="text/css" />
<script src="js/jquery.js"></script>
<script src="js/public.js"></script>
</head>
<body>
 <div class="wrap" id="app">
  <div class="page-title">
    <span class="modular fl"><i></i><em>产品列表</em></span>
    <span class="modular fr"><a href="edit_product.jsp" class="pt-link-btn">+添加商品</a></span>
  </div>
  <div class="operate">
   <form>
    <input type="text" class="textBox length-long" placeholder="输入产品名称..." v-model="uname"/>
    <input type="button" value="查询" class="tdBtn" @click="btn"/>
   </form>
  </div>
  <table class="list-style Interlaced">
   <tr>
    <th>ID编号</th>
    <th>产品</th>
    <th>名称</th>
    <th>市场价</th>
    <th>库存</th>
    <th>操作</th>
   </tr>
 <div >
   <tr v-for="(item,index) in list">
    <td>
     <span>
     <input type="checkbox" class="middle children-checkbox"/>
     <i>{{item.allProduct_id}}</i>
     </span>
    </td>
    <td class="center pic-area">
  		<img :src="location(item.allProduct_location)" class="thumbnail"/>
   <!--  {{item.allProduct_location}} -->
    </td>
    <td class="td-name">
      <span class="ellipsis td-name block">{{item.allProduct_name}}</span>
    </td>
    <td class="center">
     <span>
      <i>￥</i>
      <em>{{item.allProduct_price}}</em>
     </span>
    </td>
    <td class="center">
     <span>
      <em>{{item.allProduct_count}}</em>
      <i>件</i>
     </span>
    </td>
 
    <td class="center">
     <a href="../index.jsp" title="查看" target="_blank"><img src="images/icon_view.gif"/></a>
     <a :href="update(item.allProduct_id)" title="编辑"  ><img src="images/icon_edit.gif"/></a>
     <a :href="deletes(item.allProduct_id)" title="删除"><img src="images/icon_drop.gif"/></a>
     <!--  @click="aaa(item.allProduct_id);     location.reload(); //刷新当前页面    -->
    </td>
   </tr>
</div>


  </table>
  
    <!-- BatchOperation -->
  <div style="overflow:hidden;">
      <!-- Operation -->
	  <div class="BatchOperation fl">
	   <input type="checkbox" id="del"/>
	   <label for="del" class="btnStyle middle">全选</label>
	   <input type="button" value="批量删除" class="btnStyle"/>
	  </div>
	  <!-- turn page -->
	  <div class="turnPage center fr">
	   <a>第一页</a>
	   <a>1</a>
	   <a>最后一页</a>
	  </div>
  </div>
 </div>
 <script src="js/vue.js" type="text/javascript"></script>
<script src="js/axios.js" type="text/javascript"></script>
<script>
 var vm =  new Vue({
	 el:"#app",
	 data:{
		 list:[],
         uname:""  
	 },
	 methods:{
		 init:function(){
			 axios.get('../GetInfo').then(ret=>{
				 this.list=ret.data;
				 //alert(this.list[0].allProduct_name);
			 });
		 },
		 btn:function(){
			 axios.get('../Select',{
				 params:{
					uname:this.uname 
				 }
				 }).then(ret=>{
					 this.list=ret.data;
					
				 });
			 },
			 update:function(id){
					return '../Update?allProduct_id='+id;
				},
			 deletes:function(id){
				    return '../Delete?allProduct_id='+id;
			 },
			 location:function(loca){
				 return '../'+loca;
			 }
		 
	 },
	 mounted(){
		 this.init();
	 }
 });
</script>
</body>
</html>
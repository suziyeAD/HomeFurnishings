<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
	String path = request.getContextPath();
	%>
<!DOCTYPE html>
<html>
<head>
<title>会员列表</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link href="style/adminStyle.css" rel="stylesheet" type="text/css" />
<link href="<%=path %>/css/animate.css" rel="stylesheet" type="text/css" />
<link href="<%=path %>/css/jPages.css" rel="stylesheet" type="text/css" />
<script src="js/jquery.js"></script>
<script src="<%=path %>/js/jquery-1.12.4.min.js"></script>

<script src="<%=path %>/js/jPages.js"></script>
<script language="javascript" >
			$(function(){  
				$("div.holder").jPages({  
				  containerID : "itemContainer",  
				  previous : "←",  
				  next : "→",  
				  perPage : 3,  
				  delay : 100
				});  
			 }); 
	</script>
<script type="text/javascript">
		function pitchOn(){
		    var check=document.getElementsByName("cars");
		    var alc=document.getElementById("ca");
		    var txt=document.getElementsByClassName("ss");
		    var isd = alc.checked;
		    if(isd){
		        txt[0].innerText="取消全选";
		    }else{
		        txt[0].innerText="全选";
		    }
		    for(var i=0;i<check.length;i++){
		        check[i].checked=isd;
		    }
		}
		
		function deleteAI() {
		    var cn = document.getElementsByName("cars");
		
		    for (var i = 0; i < cn.length;i++) {
		        if (cn[i].checked){
		            deleteTr(cn[i]);
		            i = -1;
		        }
		    }
		}
</script>
</head>
<body>
<div id="app">
 <div class="wrap">
  <div class="page-title">
    <span class="modular fl"><i class="user"></i><em>会员列表</em></span>
    <span class="modular fr"><a href="add_user.jsp" class="pt-link-btn">+添加新会员</a></span>
  </div>
  <div class="operate">
   <form>
    <input type="text" class="textBox length-long sel" placeholder="输入会员昵称..."/>
    <input type="button" value="查询" class="tdBtn" @click="cc"/>
   </form>
  </div>
  <table class="list-style Interlaced">
   <tr>
     <th>编号</th>
     <th>会员昵称</th>
     <th>邮件地址</th>
     <th>手机号码</th>
     <th>注册日期</th>
     <th>操作</th>
   </tr>
   <tbody id="itemContainer">
   <tr v-for="item in list">
    <td>
     <!-- <input type="checkbox"/> -->
     <input type="checkbox"name="cars" onclick="calculatAll()"/>
     <span class="middle" id="userId" >{{item.userId}}</span>
    </td>
    <td class="center">{{item.userName}}</td>
    <td class="center">{{item.userEmail}}</td>
	<td class="center">{{item.userPhone}}</td>
    <td class="center">{{item.userTime}}</td>
    <td class="center">
     <a :href="update(item.userId)" class="inline-block" title="编辑"><img src="images/icon_edit.gif"/></a><!-- edit_user.jsp -->
     <a class="inline-block" title="删除" @click="sc(item.userId)"><img src="images/icon_drop.gif"/></a>
    </td>
   </tr>
   </tbody>
  </table>
  <div class="holder" style="padding-left:380px !important;"></div>
  <!-- BatchOperation -->
  <div style="overflow:hidden;">
      <!-- Operation -->
	  <div class="BatchOperation fl">
	   <!-- <input type="checkbox" id="del"/> -->
	   <!-- <label for="del" class="btnStyle middle">全选</label> -->
	   <input type="checkbox"  id="ca" onclick="pitchOn()" /><span class="ss">全选</span>
	   <!-- <input type="button" value="批量删除" class="btnStyle"/> -->
	   <input type="button" value="批量删除" onclick="deleteAI()"/>
	  </div>
	  <!-- turn page -->
	  <!-- <div class="turnPage center fr">
	   <a>第一页</a>
	   <a>1</a>
	   <a>最后一页</a>
	  </div> -->
  </div>
 </div>
 </div>
 <script type="text/javascript" src="../js/vue.js"></script>
<script type="text/javascript" src="../js/axios.js"></script>
<script>
		var vm = new Vue({
			el:'#app',
			data:{
				list:[]
			},
			methods:{
		sc:function(ss){	
				axios.get('../hdel',{
					params:{
						userId:ss
					}
				}).then((ret)=>{
					var flag = ret.data;
					
					location.reload();
				});
			},
			update:function(id){
				return '../upd?sid='+id;
			},
			cc:function(){
				var sel =$(".sel").val();
				axios.get('../sbn',{
					params:{
						names:sel
					}
				}).then((ret)=>{	
					this.list=ret.data;
					
				});
			},
			init:function(){
				axios.get('../HUser').then((ret)=>{	
					this.list=ret.data;
				});
			},
		},
			created:function(){
			 	this.init();
			}
		});
</script>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path=request.getContextPath();
%>
<!DOCTYPE>
<html>
<head>
<title>产品列表</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="style/adminStyle.css" rel="stylesheet" type="text/css" />
</head>
<body>
 <div class="wrap" id="app">
  <div class="page-title">
    <span class="modular fl"><i class="add"></i><em>编辑/添加产品</em></span>
    <span class="modular fr"><a href="product_list.html" class="pt-link-btn">产品列表</a></span>
  </div>
  <!-- enctype="multipart/form-data" -->
<form action="../Adds2"  method="post" enctype="multipart/form-data">
  <table class="list-style">
   <tr>
    <td style="text-align:right;width:15%;">产品名称：</td>
    <td><input type="text" class="textBox length-long xx" name="cname" value="${list[0].allProduct_name}"/></td>
   </tr>
   <tr>
    <td style="text-align:right;">产品分类：</td>
    <td>
     <select class="textBox sel"  name="cxxFn" value="${list[0].allProduct_picturename}">

      <option >装饰摆件</option>
      <option>墙式壁挂</option>
      <option>布艺软饰</option>
      <option>装饰</option>
     <option>墙式壁挂1</option>
     <option>墙式壁挂2</option>
     <option>墙式壁挂3</option>
     <option>墙式壁挂4</option>
       <option>香薰精油</option>
      <option>香薰炉</option>
     <option>创艺101</option>
      <option>创艺102</option>
      <option>创艺103</option>
      <option>创艺201</option>
      <option>创艺202</option>
     <option>创艺301</option>
     <option>创艺302</option>
     
     </select>
    </td>
   </tr>
   <tr>
    <td style="text-align:right;">市场价：</td>
    <td>
     <input type="text" class="textBox length-short" name="cprice" value="${list[0].allProduct_price}"/>
     <span>元</span>
    </td>
   </tr>
 
   <tr>
    <td style="text-align:right;">库存：</td>
    <td>
     <input type="text" class="textBox length-short" name="ccount" value="${list[0].allProduct_count}"/>
     <span>盘</span>
    </td>
   </tr>
 
   
  
   
   <tr>
    <td style="text-align:right;">产品主图：</td>
    <td>
     <input type="file"  multiple="multiple" id="chanpinzhutu" class="hide" name="ufile" v-model="cufile"/>
     <label for="chanpinzhutu" class="labelBtn2">本地上传(最多选择N张)</label>
    </td>
   </tr>
   <tr>
    <td style="text-align:right;"></td>
    <td>
     <img src="#" width="80" height="80"/>
     
    </td>
   </tr>
   
   <tr>
    <td style="text-align:right;"></td>
    <td><input type="submit" value="发布新商品" class="tdBtn" /></td>
   </tr>
  </table>
    </form>

    
  

 </div>
</body>
</html>
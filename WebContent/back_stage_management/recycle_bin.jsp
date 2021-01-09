<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>商品回收站</title>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<link href="style/adminStyle.css" rel="stylesheet" type="text/css" />
	</head>
	<body>
		<div id="app">
			<div class="wrap">
				<div class="page-title">
					<span class="modular fl"><i></i><em>商品回收站</em></span>
				</div>

				<table class="list-style">
					<tr>
						<th>ID编号</th>
						<th>产品</th>
						<th>名称</th>
						<th>删除时间</th>
						<th>操作</th>
					</tr>
					<tr v-for="(item,index) in list">
						<td><span> <input type="checkbox" class="middle children-checkbox" /> <i>{{item.deleteProduct_id}}</i>
							</span></td>
						<td class="center pic-area"><img :src="location(item.deleteProduct_location)" class="thumbnail" /></td>
						<td class="td-name"><span class="ellipsis td-name block">{{item.deleteProduct_name}}</span>
						</td>
						<td class="center"><span>{{item.delete_Date}}</span></td>
						<td class="center"><a :href="getTbale(item.deleteProduct_id)" title="恢复" target="_blank">恢复</a> <a :href="delTbale(item.deleteProduct_id)"
							 title="彻底删除">彻底删除</a></td>
					</tr>
				</table>
				<!-- BatchOperation -->
				<div style="overflow: hidden;">
					<!-- Operation -->
					<div class="BatchOperation fl">
					<!-- 	<input type="checkbox" id="del" /> <label for="del" class="btnStyle middle">全选</label> <input type="button" value="批量彻底删除"
						 class="btnStyle" /> <input type="button" value="批量恢复" class="btnStyle" />
					</div>  -->
					<!-- turn page -->
					<div class="turnPage center fr">
						<a>第一页</a> <a>1</a> <a>最后一页</a>
					</div>
				</div>
			</div>
		</div>
		<script src="js/vue.js" type="text/javascript"></script>
		<script src="js/axios.js" type="text/javascript"></script>
		<script>
			var vm = new Vue({
				el: "#app",
				data: {
					list: []
				},
				methods: {
					init: function() {
						axios.get('../DeleteTable').then(ret => {
							this.list = ret.data;
							
						});
					},
					getTbale: function(id) {
						return '../GetTbale?deleteProduct_id=' + id;
					},

					delTbale: function(id) {
						return '../DelTbale?deleteProduct_id=' + id;
					},
					location:function(loc){
						return '../'+loc;
					}
				},

				mounted() {
					this.init();
				}

			});
		</script>


	</body>
</html>

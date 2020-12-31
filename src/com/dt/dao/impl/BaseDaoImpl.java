package com.dt.dao.impl;

import java.sql.SQLException;
import java.util.List;
import java.util.Random;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.dt.dao.BaseDao;
import com.dt.info.AllProduct;
import com.dt.info.ShoppingCart;
import com.dt.util.DbUntils_;

public class BaseDaoImpl implements BaseDao {
	private QueryRunner qr = new QueryRunner(DbUntils_.getDataSource());

	@Override
	public List<AllProduct> getIndexFlower() {
		List<AllProduct> list = null;
		String sql = "SELECT * FROM AllProduct WHERE AllProduct_picturename='装饰摆件' limit 3";
		try {
			list = qr.query(sql, new BeanListHandler<>(AllProduct.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<AllProduct> getIndexFlower2() {
		List<AllProduct> list = null;
		String sql = "SELECT * FROM AllProduct WHERE AllProduct_picturename='装饰摆件' limit 3,3";
		try {
			list = qr.query(sql, new BeanListHandler<>(AllProduct.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<AllProduct> getIndexWall() {
		List<AllProduct> list = null;
		String sql = "SELECT * FROM AllProduct WHERE AllProduct_picturename='墙式壁挂' limit 4";
		try {
			list = qr.query(sql, new BeanListHandler<>(AllProduct.class));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<AllProduct> getFlowerDer() {
		List<AllProduct> list = null;
		String sql = "SELECT * FROM AllProduct WHERE AllProduct_picturename='布艺软饰'";
		try {
			list = qr.query(sql, new BeanListHandler<>(AllProduct.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<AllProduct> getDecoration() {
		List<AllProduct> list = null;
		String sql = "SELECT * FROM AllProduct WHERE AllProduct_picturename='装饰'";
		try {
			list = qr.query(sql, new BeanListHandler<>(AllProduct.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<AllProduct> getPaint1() {
		// paint页面第1个板块
		List<AllProduct> list = null;
		String sql = "SELECT * FROM AllProduct WHERE AllProduct_picturename='墙饰壁挂1'";
		try {
			list = qr.query(sql, new BeanListHandler<>(AllProduct.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<AllProduct> getPaint2() {
		// paint页面第2个板块
		List<AllProduct> list = null;
		String sql = "SELECT * FROM AllProduct WHERE AllProduct_picturename='墙饰壁挂2'";
		try {
			list = qr.query(sql, new BeanListHandler<>(AllProduct.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<AllProduct> getPaint3() {
		// paint页面第3个板块
		List<AllProduct> list = null;
		String sql = "SELECT * FROM AllProduct WHERE AllProduct_picturename='墙饰壁挂3'";
		try {
			list = qr.query(sql, new BeanListHandler<>(AllProduct.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<AllProduct> getPaint4() {
		// paint页面第四个板块
		List<AllProduct> list = null;
		String sql = "SELECT * FROM AllProduct WHERE AllProduct_picturename='墙饰壁挂4'";
		try {
			list = qr.query(sql, new BeanListHandler<>(AllProduct.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<AllProduct> getPerfume1() {
		List<AllProduct> list = null;
		String sql = "SELECT * FROM AllProduct WHERE AllProduct_picturename='香薰精油'";
		try {
			list = qr.query(sql, new BeanListHandler<>(AllProduct.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<AllProduct> getPerfume2() {
		List<AllProduct> list = null;
		String sql = "SELECT * FROM AllProduct WHERE AllProduct_picturename='香薰炉'";
		try {
			list = qr.query(sql, new BeanListHandler<>(AllProduct.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<AllProduct> getIdeaOne1() {
		List<AllProduct> list = null;
		String sql = "SELECT * FROM AllProduct WHERE AllProduct_picturename='创艺101'";
		try {
			list = qr.query(sql, new BeanListHandler<>(AllProduct.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<AllProduct> getIdeaOne2() {
		List<AllProduct> list = null;
		String sql = "SELECT * FROM AllProduct WHERE AllProduct_picturename='创艺102'";
		try {
			list = qr.query(sql, new BeanListHandler<>(AllProduct.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<AllProduct> getIdeaOne3() {
		List<AllProduct> list = null;
		String sql = "SELECT * FROM AllProduct WHERE AllProduct_picturename='创艺103'";
		try {
			list = qr.query(sql, new BeanListHandler<>(AllProduct.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<AllProduct> getIdeaTwo1() {
		List<AllProduct> list = null;
		String sql = "SELECT * FROM AllProduct WHERE AllProduct_picturename='创艺201'";
		try {
			list = qr.query(sql, new BeanListHandler<>(AllProduct.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<AllProduct> getIdeaTwo2() {
		List<AllProduct> list = null;
		String sql = "SELECT * FROM AllProduct WHERE AllProduct_picturename='创艺202'";
		try {
			list = qr.query(sql, new BeanListHandler<>(AllProduct.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<AllProduct> getIdeaThree1() {
		List<AllProduct> list = null;
		String sql = "SELECT * FROM AllProduct WHERE AllProduct_picturename='创艺301'";
		try {
			list = qr.query(sql, new BeanListHandler<>(AllProduct.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<AllProduct> getIdeaThree2() {
		List<AllProduct> list = null;
		String sql = "SELECT * FROM AllProduct WHERE AllProduct_picturename='创艺302'";
		try {
			list = qr.query(sql, new BeanListHandler<>(AllProduct.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<AllProduct> getIndexWall2() {
		List<AllProduct> list = null;
		String sql = "SELECT * FROM AllProduct WHERE AllProduct_picturename='墙式壁挂' limit 4,4";
		try {
			list = qr.query(sql, new BeanListHandler<>(AllProduct.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<AllProduct> getIndexWall3() {
		List<AllProduct> list = null;
		String sql = "SELECT * FROM AllProduct WHERE AllProduct_picturename='墙式壁挂' limit 8,4";
		try {
			list = qr.query(sql, new BeanListHandler<>(AllProduct.class));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public AllProduct getSale(Integer sid) {
		AllProduct allpro = null;
		String sql = "SELECT * FROM allproduct WHERE AllProduct_id=?";
		try {
			allpro = qr.query(sql, sid, new BeanHandler<>(AllProduct.class));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return allpro;
	}

	@Override // 商品编号, 商品数量 付款人id
	public int insertById(Integer sid, Integer num, Integer payId) {
		int flag = 0;
		AllProduct allpro = null;
		String sql = "SELECT * FROM allproduct WHERE AllProduct_id=?";
		String sql2 = "INSERT INTO ShoppingCart VALUES(NULL,?,?,?,?,?,?,?,NULL,DEFAULT)";
		try {
			allpro = qr.query(sql, sid, new BeanHandler<>(AllProduct.class));
			String name = allpro.getAllProduct_name();
			String loction = allpro.getAllProduct_location();
			String pictureName = allpro.getAllProduct_picturename();
			double price = allpro.getAllProduct_price();
			flag = qr.update(sql2, sid, name, payId, loction, pictureName, price, num);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public List<ShoppingCart> getAllShopping(Integer payId) {
		List<ShoppingCart> list = null;
		String sql = "SELECT * FROM ShoppingCart where ShoppingCart_payId=?";
		try {
			list = qr.query(sql, new BeanListHandler<>(ShoppingCart.class),payId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public String getoOrderId() {
		String str = "";
		for (int i = 0; i < 16; i++) {
			int random = new Random().nextInt(10);
			str = str + random;
		}
		return str;
	}

	@Override
	public void InsertPayedProduct() {
		List<ShoppingCart> list = null;
		String sql = "SELECT * FROM ShoppingCart";
		try {
			list = qr.query(sql, new BeanListHandler<>(ShoppingCart.class));
			for (ShoppingCart ss : list) {
				//通过循环，将购物车中的物品全部添加到PayedProduct表中
				String sql2 = "INSERT INTO PayedProduct VALUES(null,?,?,?,?,?,?,null,?,DEFAULT)";
				int shoppingCart_count = ss.getShoppingCart_count();
				qr.update(sql2, ss.getShoppingCart_name(), ss.getShoppingCart_payId(), ss.getShoppingCart_location(),
						ss.getShoppingCart_picturename(), ss.getShoppingCart_price(), shoppingCart_count,
						getoOrderId());
				int id = ss.getAllProduct_id();//获得每个商品的数量
				String sql3 = "SELECT * FROM  `allproduct` where AllProduct_id=?";
				AllProduct all = qr.query(sql3,id, new BeanHandler<>(AllProduct.class));
				int allProduct_count = all.getAllProduct_count();//得到所有数量
				String sql4 = "UPDATE allproduct SET AllProduct_count=(?-?) WHERE AllProduct_id=?";
				qr.update(sql4,allProduct_count,shoppingCart_count,id);
			}
			//将购物车表全部清空
			String sql3 = "delete from ShoppingCart where shoppingCart_orderStatus='未支付'";
			qr.update(sql3);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public int addtoShoppingCrt(Integer id, Integer num,Integer payid) {
		int flag =0;
		int nums =0;
		String sql = "SELECT * FROM allproduct WHERE AllProduct_id = ?";
		String sql2 = "INSERT INTO ShoppingCart VALUES(NULL,?,?,?,?,?,?,?,NULL,DEFAULT)";
		String sql3 = "UPDATE shoppingcart SET ShoppingCart_count=? WHERE allproduct_id=?";
		String sql4 = "SELECT * from ShoppingCart where AllProduct_id=?";
		try {
			ShoppingCart cart = qr.query(sql4, new BeanHandler<>(ShoppingCart.class),id);
			AllProduct all = qr.query(sql, new BeanHandler<>(AllProduct.class),id);
			if (cart != null) {
				int i =cart.getShoppingCart_count();
				nums=i+num;
				flag = qr.update(sql3,nums,id);
			}else{
				flag = qr.update(sql2,all.getAllProduct_id(),all.getAllProduct_name(),payid,all.getAllProduct_location(),all.getAllProduct_picturename(),all.getAllProduct_price(),num );
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public int delShopping(Integer id) {
		int flag = 0;
		String sql = "delete from ShoppingCart where shoppingCart_id=?";
		String sql2 ="delete from ShoppingCart where shoppingCart_orderStatus='未支付'";
		try {
			if (id != -1) {
				flag = qr.update(sql, id);
			}else{
				flag = qr.update(sql2);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}

}

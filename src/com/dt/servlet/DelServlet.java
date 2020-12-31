package com.dt.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.dt.dao.PayDao;
import com.dt.dao.impl.PayDaoImpl;
import com.dt.info.ClosedOrder;
import com.dt.info.PayedProduct;

/**
 * Servlet implementation class Del
 */
@WebServlet("/del")
public class DelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DelServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		PayDaoImpl pdi = new PayDaoImpl();
		String sid = request.getParameter("sid");
		List<PayedProduct> pp = pdi.getInfoProduct(Integer.parseInt(sid));
		
		int aid = pp.get(0).getPayedproduct_id();
		String name=pp.get(0).getPayedProduct_name();
		int payid=pp.get(0).getPayedProduct_payId();
		String location=pp.get(0).getPayedProduct_location();
		String picturename=pp.get(0).getPayedProduct_picturename();
		Double price=pp.get(0).getPayedProduct_price();
		int count=pp.get(0).getPayedProduct_count();
		String paytime = pp.get(0).getPayedProduct_paytime();
		String orderid = pp.get(0).getPayedProduct_orderId();
		String orderstatus = pp.get(0).getPayedProduct_orderStatus();
		
		//request.setAttribute("aid", aid);
		//request.setAttribute("name", name);
		//request.setAttribute("payid", payid);
		//request.setAttribute("location", location);
		//request.setAttribute("picturename", picturename);
		//request.setAttribute("price", price);
		//request.setAttribute("count", count);
		//request.setAttribute("paytime", paytime);
		//request.setAttribute("orderid", orderid);
		//request.setAttribute("orderstatus", orderstatus);
		ClosedOrder co = new ClosedOrder();
		co.setClosedorder_id(aid);
		co.setClosedorder_name(name);
		co.setClosedorder_payId(payid);
		co.setClosedorder_location(location);
		co.setClosedorder_picturename(picturename);
		co.setClosedorder_price(price);
		co.setClosedorder_count(count);
		co.setClosedorder_closetime(paytime);
		co.setClosedorderproduct_orderId(orderid);
		co.setShoppingcart_orderStatus(orderstatus);
		PayDao pd = new PayDaoImpl();
		pd.addProduct(co);
		
		
		
		int flag = pdi.delById(Integer.parseInt(sid));
		response.setContentType("application/json;charset=utf-8");
		response.getWriter().write(JSON.toJSONString(flag));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

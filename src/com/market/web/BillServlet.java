package com.market.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.market.entity.Bill;
import com.market.mysql.BillMysql;
import com.market.mysql.impl.BillMysqlImpl;
import com.market.service.impl.BillServiceImpl;

/**
 * Servlet implementation class BillServlet
 */
@WebServlet("/BillServlet")
public class BillServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BillServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		BillServiceImpl billService = new BillServiceImpl();
		BillMysql billDao=new BillMysqlImpl();
		billService.setBillDao(billDao);
		List<Bill> queryAll = billService.queryAll();
		List<String> selectProvider=billService.selectProvider();
		request.setAttribute("billlist",queryAll);
		request.setAttribute("bproviderlist",selectProvider);
		request.getRequestDispatcher("billList.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

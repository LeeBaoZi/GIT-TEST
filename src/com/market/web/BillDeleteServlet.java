package com.market.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.market.mysql.BillMysql;
import com.market.mysql.impl.BillMysqlImpl;
import com.market.service.impl.BillServiceImpl;

/**
 * Servlet implementation class BillDeleteServlet
 */
@WebServlet("/BillDeleteServlet")
public class BillDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BillDeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String bname = request.getParameter("bname");
		response.setContentType("text/html;charset=utf-8");
		BillServiceImpl billService = new BillServiceImpl();
		BillMysql billDao=new BillMysqlImpl();
		billService.setBillDao(billDao);
		boolean delete = billService.delete(bname);
		if(delete) {
			response.sendRedirect("BillServlet");
		}else {
			response.sendRedirect("login.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

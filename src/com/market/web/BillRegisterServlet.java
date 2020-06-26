package com.market.web;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.market.mysql.BillMysql;
import com.market.mysql.impl.BillMysqlImpl;
import com.market.service.impl.BillServiceImpl;

/**
 * Servlet implementation class BillRegisterServlet
 */
@WebServlet("/BillRegisterServlet")
public class BillRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BillRegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String bid = request.getParameter("billId");
		String bname = request.getParameter("billName");
		String price=request.getParameter("billCom");
		String amount=request.getParameter("billNum");
		String bprovider=request.getParameter("billprovider");
		String binfo=request.getParameter("zhifu");
		double bprice=Double.valueOf(price);
		double bamount=Double.valueOf(amount);
		double btotal=bprice*bamount;
		Date date=new Date();
		DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm");
		String bdate=format.format(date);
		response.setContentType("text/html;charset=utf-8");
		BillServiceImpl billService = new BillServiceImpl();
		BillMysql billDao=new BillMysqlImpl();
		billService.setBillDao(billDao);
		boolean register = billService.register(bid, bname, bprice, bamount, btotal, bprovider, binfo,bdate);
		if (register) {
			response.sendRedirect("BillServlet");
		}else {
			request.getRequestDispatcher("billAdd.jsp").forward(request, response);
		}
	}

}

package com.market.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.market.mysql.ProviderMysql;
import com.market.mysql.impl.ProviderMysqlImpl;
import com.market.service.impl.ProviderServiceImpl;

/**
 * Servlet implementation class ProviderRegisterServlet
 */
@WebServlet("/ProviderRegisterServlet")
public class ProviderRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProviderRegisterServlet() {
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
		String sid = request.getParameter("providerId");
		String sname = request.getParameter("providerName");
		String sadmin=request.getParameter("people");
		String sphone=request.getParameter("phone");
		String saddress=request.getParameter("address");
		String scast=request.getParameter("cast");
		String sinfo=request.getParameter("describe");
		response.setContentType("text/html;charset=utf-8");
		ProviderServiceImpl providerService = new ProviderServiceImpl();
		ProviderMysql providerDao=new ProviderMysqlImpl();
		providerService.setProviderDao(providerDao);
		boolean register = providerService.register(sid,sname, sadmin,sphone,saddress,scast,sinfo);
		if (register) {
			response.sendRedirect("ProviderServlet");
		}else {
			request.getRequestDispatcher("userAdd.jsp").forward(request, response);
		}
	}

}

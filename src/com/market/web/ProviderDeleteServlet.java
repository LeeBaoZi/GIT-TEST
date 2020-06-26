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
 * Servlet implementation class ProviderDeleteServlet
 */
@WebServlet("/ProviderDeleteServlet")
public class ProviderDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProviderDeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		response.setContentType("text/html;charset=utf-8");
		ProviderServiceImpl providerService = new ProviderServiceImpl();
		ProviderMysql providerDao=new ProviderMysqlImpl();
		providerService.setProviderDao(providerDao);
		boolean delete = providerService.delete(name);
		if(delete) {
			response.sendRedirect("ProviderServlet");
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

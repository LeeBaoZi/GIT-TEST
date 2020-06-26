package com.market.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.market.mysql.UserMysql;
import com.market.mysql.impl.UserMysqlImpl;
import com.market.service.impl.UserServiceImpl;
/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
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
		String name = request.getParameter("userName");
		String pwd = request.getParameter("userpassword");
		String id=request.getParameter("userId");
		int cid=Integer.parseInt(id);
		String csex=request.getParameter("sex");
		String cphone=request.getParameter("userphone");
		String cadress=request.getParameter("userAddress");
		String cposition=request.getParameter("userlei");
		response.setContentType("text/html;charset=utf-8");
		UserServiceImpl userService = new UserServiceImpl();
		UserMysql userDao=new UserMysqlImpl();
		userService.setUserDao(userDao);
		boolean register = userService.register(cid,name, pwd,csex,cposition,cadress,cphone);
		if (register) {
			response.sendRedirect("UserServlet");
		}else {
			request.getRequestDispatcher("userAdd.jsp").forward(request, response);
		}
	}

}

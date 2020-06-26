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
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		String name = request.getParameter("username");
		String pwd = request.getParameter("password");
		response.setContentType("text/html;charset=utf-8");
		UserServiceImpl userService = new UserServiceImpl();
		UserMysql userDao=new UserMysqlImpl();
		userService.setUserDao(userDao);
		boolean login = userService.login(name, pwd);
		if (login) {//登录成功，进入主界面
			request.getSession().setAttribute("name", name);
			response.sendRedirect("index.jsp");
		}else {
			//失败的话就需要重新登录
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

}

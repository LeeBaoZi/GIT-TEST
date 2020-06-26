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
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String pwd1 = request.getParameter("newPassword");
		String pwd = request.getParameter("oldPassword");
		response.setContentType("text/html;charset=utf-8");
		UserServiceImpl userService = new UserServiceImpl();
		UserMysql userDao=new UserMysqlImpl();
		userService.setUserDao(userDao);
		String username=(String)request.getSession().getAttribute("name");
		boolean update = userService.update(username,pwd, pwd1);
		if (update) {//修改成功，进入登录
			request.getSession().invalidate();
			response.sendRedirect("UserServlet");
		}else {
			//失败的话就需要重新修改
			request.getRequestDispatcher("password.jsp").forward(request, response);
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

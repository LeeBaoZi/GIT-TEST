
		/**
		* Project
		Name:market
		* File Name:UserMysqlImpl.java
		* Package
		Name:com.market.mysql.impl
		* Date:2020年4月27日下午9:08:15
		* Copyright (c) 2020,
		277809183@qq.com All Rights Reserved.
		*
		*/
		
		/**
		* Project Name:market
		* File Name:UserMysqlImpl.java
		*
		Package Name:com.market.mysql.impl
		* Date:2020年4月27日下午9:08:15
		* Copyright (c)
		2020, 837806955@qq.com All Rights Reserved.
		*
		*/
	

		package com.market.mysql.impl;
		/**
		* ClassName:UserMysqlImpl <br/>
		*
		Function: TODO ADD FUNCTION. <br/>
		* Reason: TODO ADD
		REASON. <br/>
		* Date: 2020年4月27日 下午9:08:15 <br/>
		* @author
		Future
		* @version
		* @since JDK 1.8
		* @see
		*/
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.market.entity.User;
import com.market.mysql.BaseMysql;
import com.market.mysql.UserMysql;

/**
* ClassName: UserMysqlImpl <br/>
* Function: TODO ADD
FUNCTION. <br/>
* Reason: TODO ADD REASON(可选). <br/>
*
date: 2020年4月27日 下午9:08:15 <br/>
*
* @author Li Zhengyu
* @version
* @since JDK 1.8
*/

public class UserMysqlImpl extends BaseMysql implements UserMysql {
	public List<User> queryAll() {
		List<User> users = new ArrayList<User>();
		User user = null;
		String sql = "select * from castinfo";
		Object[] params = {};
		rs = this.executeQuery(sql, params);
		try {
			while (rs.next()) {
				String name = rs.getString("cname");
				String pwd = null;
				int id = rs.getInt("cid");
				String sex = rs.getString("csex");
				String phone = rs.getString("cphone");
				String position = rs.getString("cposition");
				String address = rs.getString("caddress");
				user = new User(id,name,pwd,sex,position,address,phone);
				users.add(user);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.closeResource(rs, pstmt, conn);// 关闭资源
		}
		return users;
	}
	
	public List<User> search(String username) {
		List<User> users = new ArrayList<User>();
		User user = null;
		String sql = "select * from castinfo where cname=?";
		Object[] params = {username};
		rs = this.executeQuery(sql, params);
		try {
			while (rs.next()) {
				String name = rs.getString("cname");
				String pwd = null;
				int id = rs.getInt("cid");
				String sex = rs.getString("csex");
				String phone = rs.getString("cphone");
				String position = rs.getString("cposition");
				String address = rs.getString("caddress");
				user = new User(id,name,pwd,sex,position,address,phone);
				users.add(user);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.closeResource(rs, pstmt, conn);// 关闭资源
		}
		return users;
	}

	@Override
	public boolean register(User user) {
		boolean flag=false;
		try {
			String sql = "insert into castinfo values(?,?,?,?,?,?,?)";
			Object[] params = {user.getCid(),user.getName(), user.getPwd(),user.getCsex(),user.getCposition(),user.getCadress(),user.getCphone()};
			result = this.executeUpdate(sql, params);
			if(result!=0) {
				flag=true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.closeResource(null, pstmt, conn);
		}
		return flag;
	}

	@Override
	public boolean queryNameAndPwd(User user) throws SQLException{
		boolean flag=false;
		String sql="SELECT * FROM castinfo WHERE CNAME=? AND CPASSWORD=? ";
		Object[] params= {user.getName(),user.getPwd()};
		rs = this.executeQuery(sql, params);
		if (rs.next()) {
			flag=true;
			}
		return flag;
		}
	
	public boolean update(User user,String pwd1) {
		boolean flag=false;
		try {
			String sql = "UPDATE castinfo SET cpassword=? where cname=? and cpassword=?";
			Object[] params = { pwd1,user.getName(), user.getPwd() };
			result = this.executeUpdate(sql, params);
			if(result!=0) {
				flag=true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.closeResource(null, pstmt, conn);
		}
		return flag;
	}
	
	public boolean delete(String name)
	{
		boolean flag=false;
		try {
			String sql = "delete from castinfo where cname=?";
			Object[] params = {name};
			result = this.executeUpdate(sql, params);
			if(result!=0) {
				flag=true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.closeResource(null, pstmt, conn);
		}
		return flag;
	}
	
	public boolean change(String id, String phone, String address)
	{
		boolean flag=false;
		try {
			String sql = "UPDATE castinfo SET cphone=?,caddress=? where cid=?";
			Object[] params = {phone,address,id};
			result = this.executeUpdate(sql, params);
			if(result!=0) {
				flag=true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.closeResource(null, pstmt, conn);
		}
		return flag;
	}
}

	
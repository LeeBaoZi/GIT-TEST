
		/**
		* Project
		Name:market
		* File Name:UserServiceImpl.java
		* Package
		Name:UserServiceImpl
		* Date:2020年4月27日下午9:00:28
		* Copyright (c) 2020,
		277809183@qq.com All Rights Reserved.
		*
		*/
		
		/**
		* Project Name:market
		* File Name:UserServiceImpl.java
		*
		Package Name:UserServiceImpl
		* Date:2020年4月27日下午9:00:28
		* Copyright (c)
		2020, 837806955@qq.com All Rights Reserved.
		*
		*/
	

		package com.market.service.impl;
		/**
		* ClassName:UserServiceImpl <br/>
		*
		Function: TODO ADD FUNCTION. <br/>
		* Reason: TODO ADD
		REASON. <br/>
		* Date: 2020年4月27日 下午9:00:28 <br/>
		* @author
		Future
		* @version
		* @since JDK 1.8
		* @see
		*/

import java.sql.SQLException;
import java.util.List;

import com.market.mysql.UserMysql;
import com.market.entity.User;
import com.market.service.UserService;

/**
* ClassName: UserServiceImpl <br/>
* Function: TODO ADD
FUNCTION. <br/>
* Reason: TODO ADD REASON(可选). <br/>
*
date: 2020年4月27日 下午9:00:28 <br/>
*
* @author Li Zhengyu
* @version
* @since JDK 1.8
*/

public class UserServiceImpl implements UserService{
private UserMysql userMysql;

	
//	public UserServiceImpl(UserDao userDao) {
//		super();
//		this.userDao = userDao;
//	}

	public UserMysql getUserDao() {
		return userMysql;
	}

	public void setUserDao(UserMysql userDao) {
		this.userMysql = userDao;
	}

	@Override
	public List<User> queryAll() {
		return userMysql.queryAll();
	}

	@Override
	public boolean login(String name, String pwd) {
		try {
			return userMysql.queryNameAndPwd(new User(name, pwd));
		} catch (SQLException e) {
			
					// TODO Auto-generated catch block
					e.printStackTrace();
					return false;
				
		}
	}
		
	public boolean register(int cid,String name, String pwd,String csex,String cposition,String cadress,String cphone) {
		return userMysql.register(new User(cid,name, pwd,csex,cposition,cadress,cphone));
	}
		
	public boolean update(String username, String pwd, String pwd1) {
		return userMysql.update(new User(username, pwd),pwd1);
			
	}
		
	public List<User> search(String username) {
	    return userMysql.search(username);		
	}
		
	public boolean delete(String name) {
		return userMysql.delete(name);	
	}
		
	public boolean change(String id, String phone, String address) {		
		return userMysql.change(id,phone,address);	
	}

}

	
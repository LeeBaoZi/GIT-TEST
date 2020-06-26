
		/**
		* Project
		Name:market
		* File Name:UserMysql.java
		* Package
		Name:com.market.mysql
		* Date:2020��4��27������4:39:18
		* Copyright (c) 2020,
		277809183@qq.com All Rights Reserved.
		*
		*/
		
		/**
		* Project Name:market
		* File Name:UserMysql.java
		*
		Package Name:com.market.mysql
		* Date:2020��4��27������4:39:18
		* Copyright (c)
		2020, 837806955@qq.com All Rights Reserved.
		*
		*/
	

		package com.market.mysql;
		/**
		* ClassName:UserMysql <br/>
		*
		Function: TODO ADD FUNCTION. <br/>
		* Reason: TODO ADD
		REASON. <br/>
		* Date: 2020��4��27�� ����4:39:18 <br/>
		* @author
		Future
		* @version
		* @since JDK 1.8
		* @see
		*/

import java.sql.SQLException;
import java.util.List;

import com.market.entity.User;

/**
* ClassName: UserMysql <br/>
* Function: TODO ADD
FUNCTION. <br/>
* Reason: TODO ADD REASON(��ѡ). <br/>
*
date: 2020��4��27�� ����4:39:18 <br/>
*
* @author Li Zhengyu
* @version
* @since JDK 1.8
*/

public interface UserMysql {
	public List<User> queryAll();
	//public boolean add(User user);
	
	public boolean queryNameAndPwd(User user) throws SQLException;	
	public boolean update(User user, String pwd1);
		
	boolean register(User user);
		
	public List<User> search(String username);
		
	public boolean delete(String name);
	
	public boolean change(String id, String phone, String address);
	
}

	
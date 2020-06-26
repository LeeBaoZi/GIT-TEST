
		/**
		* Project
		Name:market
		* File Name:UserService.java
		* Package
		Name:com.market.service
		* Date:2020年4月27日下午8:58:19
		* Copyright (c) 2020,
		277809183@qq.com All Rights Reserved.
		*
		*/
		
		/**
		* Project Name:market
		* File Name:UserService.java
		*
		Package Name:com.market.service
		* Date:2020年4月27日下午8:58:19
		* Copyright (c)
		2020, 837806955@qq.com All Rights Reserved.
		*
		*/
	

		package com.market.service;
		/**
		* ClassName:UserService <br/>
		*
		Function: TODO ADD FUNCTION. <br/>
		* Reason: TODO ADD
		REASON. <br/>
		* Date: 2020年4月27日 下午8:58:19 <br/>
		* @author
		Future
		* @version
		* @since JDK 1.8
		* @see
		*/

import java.util.List;

import com.market.entity.User;

/**
* ClassName: UserService <br/>
* Function: TODO ADD
FUNCTION. <br/>
* Reason: TODO ADD REASON(可选). <br/>
*
date: 2020年4月27日 下午8:58:19 <br/>
*
* @author Li Zhengyu
* @version
* @since JDK 1.8
*/

public interface UserService {
	public List<User> queryAll();
    public boolean login(String name,String pwd);
}

	
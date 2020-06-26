
		/**
		* Project
		Name:market
		* File Name:ProviderMysql.java
		* Package
		Name:com.market.mysql
		* Date:2020年4月29日下午3:15:54
		* Copyright (c) 2020,
		277809183@qq.com All Rights Reserved.
		*
		*/
		
		/**
		* Project Name:market
		* File Name:ProviderMysql.java
		*
		Package Name:com.market.mysql
		* Date:2020年4月29日下午3:15:54
		* Copyright (c)
		2020, 837806955@qq.com All Rights Reserved.
		*
		*/
	

		package com.market.mysql;
		/**
		* ClassName:ProviderMysql <br/>
		*
		Function: TODO ADD FUNCTION. <br/>
		* Reason: TODO ADD
		REASON. <br/>
		* Date: 2020年4月29日 下午3:15:54 <br/>
		* @author
		Future
		* @version
		* @since JDK 1.8
		* @see
		*/

import java.sql.SQLException;
import java.util.List;

import com.market.entity.Provider;

/**
* ClassName: ProviderMysql <br/>
* Function: TODO ADD
FUNCTION. <br/>
* Reason: TODO ADD REASON(可选). <br/>
*
date: 2020年4月29日 下午3:15:54 <br/>
*
* @author Li Zhengyu
* @version
* @since JDK 1.8
*/

public interface ProviderMysql {
	public List<Provider> queryAll();
	//public boolean add(User user);
	
		
	boolean register(Provider provider);
		
	public List<Provider> search(String sname);
		
	public boolean delete(String sname);
	
	public boolean change(String id, String phone, String address);
}

	
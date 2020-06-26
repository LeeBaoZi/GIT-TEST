
		/**
		* Project
		Name:market
		* File Name:ProviderServiceImpl.java
		* Package
		Name:com.market.service.impl
		* Date:2020年4月29日下午3:41:25
		* Copyright (c) 2020,
		277809183@qq.com All Rights Reserved.
		*
		*/
		
		/**
		* Project Name:market
		* File Name:ProviderServiceImpl.java
		*
		Package Name:com.market.service.impl
		* Date:2020年4月29日下午3:41:25
		* Copyright (c)
		2020, 837806955@qq.com All Rights Reserved.
		*
		*/
	

		package com.market.service.impl;
		/**
		* ClassName:ProviderServiceImpl <br/>
		*
		Function: TODO ADD FUNCTION. <br/>
		* Reason: TODO ADD
		REASON. <br/>
		* Date: 2020年4月29日 下午3:41:25 <br/>
		* @author
		Future
		* @version
		* @since JDK 1.8
		* @see
		*/

import java.sql.SQLException;
import java.util.List;

import com.market.entity.Provider;
import com.market.mysql.ProviderMysql;
import com.market.service.ProviderService;

/**
* ClassName: ProviderServiceImpl <br/>
* Function: TODO ADD
FUNCTION. <br/>
* Reason: TODO ADD REASON(可选). <br/>
*
date: 2020年4月29日 下午3:41:25 <br/>
*
* @author Li Zhengyu
* @version
* @since JDK 1.8
*/

public class ProviderServiceImpl implements ProviderService{
private ProviderMysql ProviderMysql;

	
//	public UserServiceImpl(UserDao userDao) {
//		super();
//		this.userDao = userDao;
//	}

	public ProviderMysql getProviderDao() {
		return ProviderMysql;
	}

	public void setProviderDao(ProviderMysql ProviderMysql) {
		this.ProviderMysql = ProviderMysql;
	}

	@Override
	public List<Provider> queryAll() {
		return ProviderMysql.queryAll();
	}

		
	public boolean register(String sid,String sname, String sadmin,String sphone,String saddress,String scast,String sinfo) {
		return ProviderMysql.register(new Provider(sid,sname,sadmin,sphone,saddress,scast,sinfo));
	}
		
	public List<Provider> search(String sname) {
	    return ProviderMysql.search(sname);		
	}
		
	public boolean delete(String name) {
		return ProviderMysql.delete(name);	
	}
		
	public boolean change(String id, String phone, String address) {		
		return ProviderMysql.change(id,phone,address);	
	}
}

	
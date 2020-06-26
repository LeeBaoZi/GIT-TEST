
		/**
		* Project
		Name:market
		* File Name:BillMysql.java
		* Package
		Name:com.market.mysql
		* Date:2020年4月29日下午5:21:33
		* Copyright (c) 2020,
		277809183@qq.com All Rights Reserved.
		*
		*/
		
		/**
		* Project Name:market
		* File Name:BillMysql.java
		*
		Package Name:com.market.mysql
		* Date:2020年4月29日下午5:21:33
		* Copyright (c)
		2020, 837806955@qq.com All Rights Reserved.
		*
		*/
	

		package com.market.mysql;
		/**
		* ClassName:BillMysql <br/>
		*
		Function: TODO ADD FUNCTION. <br/>
		* Reason: TODO ADD
		REASON. <br/>
		* Date: 2020年4月29日 下午5:21:33 <br/>
		* @author
		Future
		* @version
		* @since JDK 1.8
		* @see
		*/

import java.util.List;

import com.market.entity.Bill;

/**
* ClassName: BillMysql <br/>
* Function: TODO ADD
FUNCTION. <br/>
* Reason: TODO ADD REASON(可选). <br/>
*
date: 2020年4月29日 下午5:21:33 <br/>
*
* @author Li Zhengyu
* @version
* @since JDK 1.8
*/

public interface BillMysql {
	public List<Bill> queryAll();
		
	boolean register(Bill bill);
		
	public List<Bill> search(String bname);
	public List<Bill> searchProvider(String bprovider);
	public List<Bill> searchInfo(String binfo);
		
	public boolean delete(String bname);
	
	public List<String> selectProvider();

}

	
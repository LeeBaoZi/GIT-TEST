
		/**
		* Project
		Name:market
		* File Name:BillServiceImpl.java
		* Package
		Name:com.market.service.impl
		* Date:2020年4月29日下午6:00:36
		* Copyright (c) 2020,
		277809183@qq.com All Rights Reserved.
		*
		*/
		
		/**
		* Project Name:market
		* File Name:BillServiceImpl.java
		*
		Package Name:com.market.service.impl
		* Date:2020年4月29日下午6:00:36
		* Copyright (c)
		2020, 837806955@qq.com All Rights Reserved.
		*
		*/
	

		package com.market.service.impl;
		/**
		* ClassName:BillServiceImpl <br/>
		*
		Function: TODO ADD FUNCTION. <br/>
		* Reason: TODO ADD
		REASON. <br/>
		* Date: 2020年4月29日 下午6:00:36 <br/>
		* @author
		Future
		* @version
		* @since JDK 1.8
		* @see
		*/

import java.util.List;

import com.market.entity.Bill;
import com.market.mysql.BillMysql;
import com.market.service.BillService;

/**
* ClassName: BillServiceImpl <br/>
* Function: TODO ADD
FUNCTION. <br/>
* Reason: TODO ADD REASON(可选). <br/>
*
date: 2020年4月29日 下午6:00:36 <br/>
*
* @author Li Zhengyu
* @version
* @since JDK 1.8
*/

public class BillServiceImpl implements BillService{
private BillMysql billMysql;

	
//	public UserServiceImpl(UserDao userDao) {
//		super();
//		this.userDao = userDao;
//	}

	public BillMysql getBillDao() {
		return billMysql;
	}

	public void setBillDao(BillMysql billMysql) {
		this.billMysql = billMysql;
	}

	@Override
	public List<Bill> queryAll() {
		return billMysql.queryAll();
	}

		
	public boolean register(String bid,String bname, double bprice,double bamount,double btotal,String bprovider,String binfo,String bdate) {
		return billMysql.register(new Bill(bid, bname, bprice, bamount, btotal, bprovider, binfo,bdate));
	}
		
	public List< Bill> search(String bname) {
	    return billMysql.search(bname);		
	}
	
	public List< Bill> searchProvider(String bprovider) {
	    return billMysql.search(bprovider);		
	}
	
	public List< Bill> searchInfo(String binfo) {
	    return billMysql.search(binfo);		
	}
		
	public boolean delete(String name) {
		return billMysql.delete(name);	
	}

	public List<String> selectProvider() {	
		return billMysql.selectProvider();	
	}
		
}

	
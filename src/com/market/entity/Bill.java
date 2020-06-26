
		/**
		* Project
		Name:market
		* File Name:Bill.java
		* Package
		Name:com.market.entity
		* Date:2020年4月29日下午5:09:26
		* Copyright (c) 2020,
		277809183@qq.com All Rights Reserved.
		*
		*/
		
		/**
		* Project Name:market
		* File Name:Bill.java
		*
		Package Name:com.market.entity
		* Date:2020年4月29日下午5:09:26
		* Copyright (c)
		2020, 837806955@qq.com All Rights Reserved.
		*
		*/
	

		package com.market.entity;
		/**
		* ClassName:Bill <br/>
		*
		Function: TODO ADD FUNCTION. <br/>
		* Reason: TODO ADD
		REASON. <br/>
		* Date: 2020年4月29日 下午5:09:26 <br/>
		* @author
		Future
		* @version
		* @since JDK 1.8
		* @see
		*/

/**
* ClassName: Bill <br/>
* Function: TODO ADD
FUNCTION. <br/>
* Reason: TODO ADD REASON(可选). <br/>
*
date: 2020年4月29日 下午5:09:26 <br/>
*
* @author Li Zhengyu
* @version
* @since JDK 1.8
*/

public class Bill {
	private String bid;
	private String bname;
	private double bprice;
	private double bamount;
	private double btotal;
	private String bprovider;
	private String binfo;
	private String bdate;
	
	public Bill() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bill(String bid, String bname, double bprice, double bamount, double btotal,String bprovider, String binfo,String bdate) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.bprice = bprice;
		this.bamount = bamount;
		this.btotal=btotal;
		this.bprovider=bprovider;
		this.binfo=binfo;
		this.bdate=bdate;
	}
	
	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public double getBprice() {
		return bprice;
	}

	public void setBprice(double bprice) {
		this.bprice = bprice;
	}

	public double getBamount() {
		return bamount;
	}

	public void setBamount(double bamount) {
		this.bamount = bamount;
	}

	public double getBtotal() {
		return btotal;
	}

	public void setBtotal(double btotal) {
		this.btotal = btotal;
	}

	public String getBprovider() {
		return bprovider;
	}

	public void setBprovider(String bprovider) {
		this.bprovider = bprovider;
	}

	public String getBinfo() {
		return binfo;
	}

	public void setBinfo(String binfo) {
		this.binfo = binfo;
	}

	public String getBdate() {
		return bdate;
	}

	public void setBdate(String bdate) {
		this.bdate = bdate;
	}
	
	
}

	
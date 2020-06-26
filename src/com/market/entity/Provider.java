
		/**
		* Project
		Name:market
		* File Name:Provider.java
		* Package
		Name:com.market.entity
		* Date:2020年4月29日下午2:28:38
		* Copyright (c) 2020,
		277809183@qq.com All Rights Reserved.
		*
		*/
		
		/**
		* Project Name:market
		* File Name:Provider.java
		*
		Package Name:com.market.entity
		* Date:2020年4月29日下午2:28:38
		* Copyright (c)
		2020, 837806955@qq.com All Rights Reserved.
		*
		*/
	

		package com.market.entity;
		/**
		* ClassName:Provider <br/>
		*
		Function: TODO ADD FUNCTION. <br/>
		* Reason: TODO ADD
		REASON. <br/>
		* Date: 2020年4月29日 下午2:28:38 <br/>
		* @author
		Future
		* @version
		* @since JDK 1.8
		* @see
		*/

/**
* ClassName: Provider <br/>
* Function: TODO ADD
FUNCTION. <br/>
* Reason: TODO ADD REASON(可选). <br/>
*
date: 2020年4月29日 下午2:28:38 <br/>
*
* @author Li Zhengyu
* @version
* @since JDK 1.8
*/

public class Provider {
	private String sid;
	private String sname;
	private String sadmin;
	private String sphone;
	private String saddress;
	private String scast;
	private String sinfo;
	
	public Provider() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Provider(String sid, String sname, String sadmin, String sphone, String saddress,String scast, String sinfo) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sadmin = sadmin;
		this.sphone = sphone;
		this.saddress=saddress;
		this.scast=scast;
		this.sinfo=sinfo;
	}
	
	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}


	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public String getSadmin() {
		return sadmin;
	}


	public void setSadmin(String sadmin) {
		this.sadmin = sadmin;
	}


	public String getSphone() {
		return sphone;
	}


	public void setSphone(String sphone) {
		this.sphone = sphone;
	}


	public String getSaddress() {
		return saddress;
	}


	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}


	public String getScast() {
		return scast;
	}


	public void setScast(String scast) {
		this.scast = scast;
	}


	public String getSinfo() {
		return sinfo;
	}


	public void setSinfo(String sinfo) {
		this.sinfo = sinfo;
	}

}

	

/**
* Project
Name:market
* File Name:User.java
* Package
Name:com.market.entity
* Date:2020年4月27日下午5:34:58
* Copyright (c) 2020,
277809183@qq.com All Rights Reserved.
*
*/

/**
* Project Name:market
* File Name:User.java
*
Package Name:com.market.entity
* Date:2020年4月27日下午5:34:58
* Copyright (c)
2020, 837806955@qq.com All Rights Reserved.
*
*/

package com.market.entity;
/**
* ClassName:User <br/>
*
Function: TODO ADD FUNCTION. <br/>
* Reason: TODO ADD
REASON. <br/>
* Date: 2020年4月27日 下午5:34:58 <br/>
* @author
Future
* @version
* @since JDK 1.8
* @see
*/

/**
 * ClassName: User <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 *
 * date: 2020年4月27日 下午5:34:58 <br/>
 *
 * @author Li Zhengyu
 * @version
 * @since JDK 1.8
 */

public class User {
	private int cid;
	private String name;
	private String pwd;
	private String csex;
	private String cposition;
	private String cadress;
	private String cphone;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String name, String pwd) {
		super();
		this.name = name;
		this.pwd = pwd;
	}

	public User(int cid, String name, String pwd, String csex, String cposition, String cadress, String cphone) {
		super();
		this.name = name;
		this.pwd = pwd;
		this.cid = cid;
		this.csex = csex;
		this.setCposition(cposition);
		this.setCadress(cadress);
		this.setCphone(cphone);
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getCsex() {
		return csex;
	}

	public void setCsex(String csex) {
		this.csex = csex;
	}

	@Override
	public String toString() {
		return "User [id=" + cid + ", name=" + name + ", pwd=" + pwd + "]";
	}

	public String getCposition() {
		return cposition;
	}

	public void setCposition(String cposition) {
		this.cposition = cposition;
	}

	public String getCadress() {
		return cadress;
	}

	public void setCadress(String cadress) {
		this.cadress = cadress;
	}

	public String getCphone() {
		return cphone;
	}

	public void setCphone(String cphone) {
		this.cphone = cphone;
	}
}

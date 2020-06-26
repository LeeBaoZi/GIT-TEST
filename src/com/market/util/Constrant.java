
		/**
		* Project
		Name:market
		* File Name:Constrant.java
		* Package
		Name:com.market.util
		* Date:2020年4月27日下午4:43:05
		* Copyright (c) 2020,
		277809183@qq.com All Rights Reserved.
		*
		*/
		
		/**
		* Project Name:market
		* File Name:Constrant.java
		*
		Package Name:com.market.util
		* Date:2020年4月27日下午4:43:05
		* Copyright (c)
		2020, 837806955@qq.com All Rights Reserved.
		*
		*/
	

		package com.market.util;
		/**
		* ClassName:Constrant <br/>
		*
		Function: TODO ADD FUNCTION. <br/>
		* Reason: TODO ADD
		REASON. <br/>
		* Date: 2020年4月27日 下午4:43:05 <br/>
		* @author
		Future
		* @version
		* @since JDK 1.8
		* @see
		*/

import com.market.util.ConfigureManager;

/**
* ClassName: Constrant <br/>
* Function: TODO ADD
FUNCTION. <br/>
* Reason: TODO ADD REASON(可选). <br/>
*
date: 2020年4月27日 下午4:43:05 <br/>
*
* @author Li Zhengyu
* @version
* @since JDK 1.8
*/

public interface Constrant {
	public static final String DRIVER=ConfigureManager.getInstance().getValueByKey("jdbc.driver");
	public static final String URL=ConfigureManager.getInstance().getValueByKey("jdbc.url");
	public static final String NAME=ConfigureManager.getInstance().getValueByKey("jdbc.name");
	public static final String PWD=ConfigureManager.getInstance().getValueByKey("jdbc.pwd");
}

	

		/**
		* Project
		Name:market
		* File Name:ConfigureManager.java
		* Package
		Name:com.market.util
		* Date:2020��4��27������4:44:10
		* Copyright (c) 2020,
		277809183@qq.com All Rights Reserved.
		*
		*/
		
		/**
		* Project Name:market
		* File Name:ConfigureManager.java
		*
		Package Name:com.market.util
		* Date:2020��4��27������4:44:10
		* Copyright (c)
		2020, 837806955@qq.com All Rights Reserved.
		*
		*/
	

		package com.market.util;
		/**
		* ClassName:ConfigureManager <br/>
		*
		Function: TODO ADD FUNCTION. <br/>
		* Reason: TODO ADD
		REASON. <br/>
		* Date: 2020��4��27�� ����4:44:10 <br/>
		* @author
		Future
		* @version
		* @since JDK 1.8
		* @see
		*/

import java.io.IOException;
import java.util.Properties;


/**
* ClassName: ConfigureManager <br/>
* Function: TODO ADD
FUNCTION. <br/>
* Reason: TODO ADD REASON(��ѡ). <br/>
*
date: 2020��4��27�� ����4:44:10 <br/>
*
* @author Li Zhengyu
* @version
* @since JDK 1.8
*/

public class ConfigureManager {
	@SuppressWarnings("unused")
	private Properties properties;
	private static ConfigureManager configureManager=null;

	private ConfigureManager() {
		properties = new Properties();
		try {
			properties.load(ConfigureManager.class.getClassLoader().getResourceAsStream("database.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static ConfigureManager getInstance() {
		if (configureManager==null) {
			configureManager=new ConfigureManager();
		}
		return configureManager;
	}
	//����key����value
	public String getValueByKey(String key) {
		return properties.getProperty(key);
	}
	public static void main(String[] args) {
		//String driver = new ConfigureManager().getValueByKey("jdbc.driver");
		ConfigureManager instance = ConfigureManager.getInstance();
		String driver = instance.getValueByKey("jdbc.driver");
		System.out.println(driver);
	}
}

	
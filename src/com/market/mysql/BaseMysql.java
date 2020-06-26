
/**
* Project
Name:market
* File Name:BaseMysql.java
* Package
Name:com.market.mysql
* Date:2020��4��27������4:40:13
* Copyright (c) 2020,
277809183@qq.com All Rights Reserved.
*
*/

/**
* Project Name:market
* File Name:BaseMysql.java
*
Package Name:com.market.mysql
* Date:2020��4��27������4:40:13
* Copyright (c)
2020, 837806955@qq.com All Rights Reserved.
*
*/

package com.market.mysql;
/**
* ClassName:BaseMysql <br/>
*
Function: TODO ADD FUNCTION. <br/>
* Reason: TODO ADD
REASON. <br/>
* Date: 2020��4��27�� ����4:40:13 <br/>
* @author
Future
* @version
* @since JDK 1.8
* @see
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.market.entity.User;
import com.market.util.Constrant;

/**
 * ClassName: BaseMysql <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(��ѡ). <br/>
 *
 * date: 2020��4��27�� ����4:40:13 <br/>
 *
 * @author Li Zhengyu
 * @version
 * @since JDK 1.8
 */

public class BaseMysql {
	protected Connection conn;
	protected ResultSet rs;
	protected PreparedStatement pstmt;
	protected int result = 0;

	
	public boolean getConn() {
		boolean flag = false;
		
		try {
			Class.forName(Constrant.DRIVER);
			
			conn = DriverManager.getConnection(Constrant.URL, Constrant.NAME, Constrant.PWD);
			flag = true;
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return flag;
	}

	
	public ResultSet executeQuery(String sql, Object[] params) {
		if (getConn()) {
			try {
				pstmt = conn.prepareStatement(sql);

				for (int i = 0; i < params.length; i++) {
					pstmt.setObject(i + 1, params[i]);
				}
				rs = pstmt.executeQuery();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return rs;
	}

	
	public int executeUpdate(String sql, Object[] params) {

		if (getConn()) {
			try {
				pstmt = conn.prepareStatement(sql);
				for (int i = 0; i < params.length; i++) {
					pstmt.setObject(i + 1, params[i]);
				}
				result = pstmt.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}

	
	@SuppressWarnings("null")
	public void closeResource(ResultSet rs, PreparedStatement pstmt, Connection conn) {
		
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		try {
			if (pstmt == null) {
				pstmt.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if (conn == null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}

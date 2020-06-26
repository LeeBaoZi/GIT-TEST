
/**
* Project
Name:market
* File Name:ProviderMysqlImpl.java
* Package
Name:com.market.mysql.impl
* Date:2020年4月29日下午3:22:01
* Copyright (c) 2020,
277809183@qq.com All Rights Reserved.
*
*/

/**
* Project Name:market
* File Name:ProviderMysqlImpl.java
*
Package Name:com.market.mysql.impl
* Date:2020年4月29日下午3:22:01
* Copyright (c)
2020, 837806955@qq.com All Rights Reserved.
*
*/

package com.market.mysql.impl;
/**
* ClassName:ProviderMysqlImpl <br/>
*
Function: TODO ADD FUNCTION. <br/>
* Reason: TODO ADD
REASON. <br/>
* Date: 2020年4月29日 下午3:22:01 <br/>
* @author
Future
* @version
* @since JDK 1.8
* @see
*/

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.market.entity.Provider;
import com.market.mysql.BaseMysql;
import com.market.mysql.ProviderMysql;

/**
 * ClassName: ProviderMysqlImpl <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 *
 * date: 2020年4月29日 下午3:22:01 <br/>
 *
 * @author Li Zhengyu
 * @version
 * @since JDK 1.8
 */

public class ProviderMysqlImpl extends BaseMysql implements ProviderMysql {
	public List<Provider> queryAll() {
		List<Provider> providers = new ArrayList<Provider>();
		Provider provider = null;
		String sql = "select * from suppinfo";
		Object[] params = {};
		rs = this.executeQuery(sql, params);
		try {
			while (rs.next()) {
				String sname = rs.getString("sname");
				String scast = rs.getString("scast");
				String sid = rs.getString("sid");
				String sadmin = rs.getString("sadmin");
				String sphone = rs.getString("sphone");
				String sinfo = rs.getString("sinfo");
				String saddress = rs.getString("saddress");
				provider = new Provider(sid, sname, sadmin, sphone, saddress, scast, sinfo);
				providers.add(provider);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.closeResource(rs, pstmt, conn);
		}
		return providers;
	}

	public List<Provider> search(String sname) {
		List<Provider> providers = new ArrayList<Provider>();
		Provider provider = null;
		String sql = "select * from suppinfo where sname=?";
		Object[] params = { sname };
		rs = this.executeQuery(sql, params);
		try {
			while (rs.next()) {
				String name = rs.getString("sname");
				String scast = rs.getString("scast");
				String sid = rs.getString("sid");
				String sadmin = rs.getString("sadmin");
				String sphone = rs.getString("sphone");
				String sinfo = rs.getString("sinfo");
				String saddress = rs.getString("saddress");
				provider = new Provider(sid, name, sadmin, sphone, saddress, scast, sinfo);
				providers.add(provider);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.closeResource(rs, pstmt, conn);// �ر���Դ
		}
		return providers;
	}

	@Override
	public boolean register(Provider provider) {
		boolean flag = false;
		try {
			String sql = "insert into suppinfo values(?,?,?,?,?,?,?)";
			Object[] params = { provider.getSid(), provider.getSname(), provider.getSadmin(), provider.getSphone(),
					provider.getSaddress(), provider.getScast(), provider.getSinfo() };
			result = this.executeUpdate(sql, params);
			if (result != 0) {
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.closeResource(null, pstmt, conn);
		}
		return flag;
	}

	public boolean delete(String name) {
		boolean flag = false;
		try {
			String sql = "delete from suppinfo where sname=?";
			Object[] params = { name };
			result = this.executeUpdate(sql, params);
			if (result != 0) {
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.closeResource(null, pstmt, conn);
		}
		return flag;
	}

	public boolean change(String id, String phone, String address) {
		boolean flag = false;
		try {
			String sql = "UPDATE suppinfo SET sphone=?,saddress=? where sid=?";
			Object[] params = { phone, address, id };
			result = this.executeUpdate(sql, params);
			if (result != 0) {
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.closeResource(null, pstmt, conn);
		}
		return flag;
	}
}

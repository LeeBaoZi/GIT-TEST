
		/**
		* Project
		Name:market
		* File Name:BillMysqlImpl.java
		* Package
		Name:com.market.mysql.impl
		* Date:2020年4月29日下午5:40:57
		* Copyright (c) 2020,
		277809183@qq.com All Rights Reserved.
		*
		*/
		
		/**
		* Project Name:market
		* File Name:BillMysqlImpl.java
		*
		Package Name:com.market.mysql.impl
		* Date:2020年4月29日下午5:40:57
		* Copyright (c)
		2020, 837806955@qq.com All Rights Reserved.
		*
		*/
	

		package com.market.mysql.impl;
		/**
		* ClassName:BillMysqlImpl <br/>
		*
		Function: TODO ADD FUNCTION. <br/>
		* Reason: TODO ADD
		REASON. <br/>
		* Date: 2020年4月29日 下午5:40:57 <br/>
		* @author
		Future
		* @version
		* @since JDK 1.8
		* @see
		*/

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.market.entity.Bill;
import com.market.mysql.BaseMysql;
import com.market.mysql.BillMysql;

/**
* ClassName: BillMysqlImpl <br/>
* Function: TODO ADD
FUNCTION. <br/>
* Reason: TODO ADD REASON(可选). <br/>
*
date: 2020年4月29日 下午5:40:57 <br/>
*
* @author Li Zhengyu
* @version
* @since JDK 1.8
*/

public class BillMysqlImpl extends BaseMysql implements BillMysql{
	public List<Bill> queryAll() {
		List<Bill> bills = new ArrayList<Bill>();
		Bill bill = null;
		String sql = "select * from billinfo";
		Object[] params = {};
		rs = this.executeQuery(sql, params);
		try {
			while (rs.next()) {
				String bname = rs.getString("bname");
				String bdate = rs.getString("bdate");
				String bid = rs.getString("bid");
				String binfo = rs.getString("binfo");
				double bprice=rs.getDouble("bprice");
				double bamount=rs.getDouble("bamount");
				double btotal=rs.getDouble("btotal");
				String bprovider = rs.getString("bprovider");
				bill = new Bill(bid, bname, bprice, bamount, btotal, bprovider, binfo,bdate);
				bills.add(bill);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.closeResource(rs, pstmt, conn);
		}
		return bills;
	}

	public List<Bill> search(String bname) {
		List<Bill> bills = new ArrayList<Bill>();
		Bill bill = null;
		String sql = "select * from billinfo where bname=?";
		Object[] params = { bname };
		rs = this.executeQuery(sql, params);
		try {
			while (rs.next()) {
				String name = rs.getString("bname");
				String bdate = rs.getString("bdate");
				String bid = rs.getString("bid");
				String binfo = rs.getString("binfo");
				double bprice=rs.getDouble("bprice");
				double bamount=rs.getDouble("bamount");
				double btotal=rs.getDouble("btotal");
				String bprovider = rs.getString("bprovider");
				bill = new Bill(bid, name, bprice, bamount, btotal, bprovider, binfo,bdate);
				bills.add(bill);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.closeResource(rs, pstmt, conn);// �ر���Դ
		}
		return bills;
	}
	
	public List<Bill> searchProvider(String bprovider) {
		List<Bill> bills = new ArrayList<Bill>();
		Bill bill = null;
		String sql = "select * from billinfo where bprovider=?";
		Object[] params = {bprovider};
		rs = this.executeQuery(sql, params);
		try {
			while (rs.next()) {
				String bname = rs.getString("bname");
				String bdate = rs.getString("bdate");
				String bid = rs.getString("bid");
				String binfo = rs.getString("binfo");
				double bprice=rs.getDouble("bprice");
				double bamount=rs.getDouble("bamount");
				double btotal=rs.getDouble("btotal");
				String provider = rs.getString("bprovider");
				bill = new Bill(bid, bname, bprice, bamount, btotal, provider, binfo,bdate);
				bills.add(bill);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.closeResource(rs, pstmt, conn);
		}
		return bills;
	}
	
	public List<Bill> searchInfo(String binfo) {
		List<Bill> bills = new ArrayList<Bill>();
		Bill bill = null;
		String sql = "select * from billinfo where binfo=?";
		Object[] params = {binfo};
		rs = this.executeQuery(sql, params);
		try {
			while (rs.next()) {
				String bname = rs.getString("bname");
				String bdate = rs.getString("bdate");
				String bid = rs.getString("bid");
				String info = rs.getString("binfo");
				double bprice=rs.getDouble("bprice");
				double bamount=rs.getDouble("bamount");
				double btotal=rs.getDouble("btotal");
				String provider = rs.getString("bprovider");
				bill = new Bill(bid, bname, bprice, bamount, btotal, provider, info,bdate);
				bills.add(bill);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.closeResource(rs, pstmt, conn);
		}
		return bills;
	}

	@Override
	public boolean register(Bill bill) {
		boolean flag = false;
		try {
			String sql = "insert into billinfo values(?,?,?,?,?,?,?,?)";
			Object[] params = { bill.getBid(), bill.getBname(), bill.getBprice(),bill.getBamount(),bill.getBtotal(),
					bill.getBprovider(), bill.getBinfo(), bill.getBdate() };
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
			String sql = "delete from billinfo where bname=?";
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
	
	public List<String> selectProvider(){
		List<String> bproviders = new ArrayList<String>();
		String sql = "select sname from suppinfo";
		Object[] params = {};
		rs = this.executeQuery(sql, params);
		try {
			while (rs.next()) {
				String bprovider = rs.getString("sname");
				bproviders.add(bprovider);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.closeResource(rs, pstmt, conn);
		}
		return bproviders;
	}


}

	
package com.jdbc.dto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class 주문Load {
	private String DriverClassName = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	private String username = "mire001";
	private String password = "mire001";

	public List<주문VO> 주문DataLoad() throws Exception {
		

		Class.forName(DriverClassName);

		Connection conn = DriverManager.getConnection(url, username, password);

		List<주문VO> 주문리스트 = new ArrayList<주문VO>();
		String sql = "select * from 주문";
		Statement stmt = conn.createStatement();

		ResultSet rs = stmt.executeQuery(sql);

		while (rs.next()) {
			주문VO 주문 = new 주문VO();

			주문.set주문번호(rs.getString("주문번호"));
			주문.set주문고객(rs.getString("주문고객"));
			주문.set주문제품(rs.getString("주문제품"));
			주문.set수량(rs.getInt("수량"));
			주문.set배송지(rs.getString("배송지"));
			주문.set주문일자(rs.getDate("주문일자"));

			주문리스트.add(주문);
		}

		if (stmt != null)
			stmt.close();
		if (conn != null)
			conn.close();

		return 주문리스트;
	}
}

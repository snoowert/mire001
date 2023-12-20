package com.jdbc.dto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class 제품Load {
	private String DriverClassName = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	private String username = "mire001";
	private String password = "mire001";
	
	public List<제품VO> 제품DataLoad() throws Exception{
		List<제품VO> 제품리스트 = new ArrayList<제품VO>();
		
		Class.forName(DriverClassName);

		Connection conn = DriverManager.getConnection(url, username, password);

		String sql = "select * from 제품";
		Statement stmt = conn.createStatement();

		ResultSet rs = stmt.executeQuery(sql);
		
		while (rs.next()) {
			제품VO 제품 = new 제품VO();

			제품.set제품번호(rs.getString("제품번호"));
			제품.set제품명(rs.getString("제품명"));
			제품.set재고량(rs.getInt("재고량"));
			제품.set단가(rs.getInt("단가"));
			제품.set제조업체(rs.getString("제조업체"));

			제품리스트.add(제품);
		}
		
		if (stmt != null)
			stmt.close();
		if (conn != null)
			conn.close();
		
		return 제품리스트;
	}
}

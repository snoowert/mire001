package com.java.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;

public class JDBC_Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String driverClassName = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String username = "mire001";
		String password = "mire001";

		// 1.Driver loading
		Class.forName(driverClassName);
		System.out.println("드라이버 로딩 성공");

		// 2.database connection
		Connection conn = DriverManager.getConnection(url, username, password);
		System.out.println("연결 성공");

		// 3.sql tranmission
		String sql = "select * from MEMBER";
		Statement stmt = conn.createStatement();

		// 4.receive result
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) {
			String user = rs.getString("USERNAME");
			String pw = rs.getString("PASSWORD");
			String name = rs.getString("NAME");
			String email = rs.getString("EMAIL");
			String phone = rs.getString("PHONE");
			Date inDate = rs.getDate("INDATE");
			String inDateStr = new SimpleDateFormat("yyyy.MM.dd").format(inDate);
			System.out.println(user + "\t" + pw + "\t" + name + "\t" + email + "\t" + phone + "\t" + inDateStr);
			
		}
	}

}

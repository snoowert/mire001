package com.jdbc.datasource;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataSource {
	private static DataSource instance = new DataSource();
	//private DataSource() {}
	public static DataSource getInstance() {
		return instance;
	}
	
	private String DriverClassName = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	private String username = "mire001";
	private String password = "mire001";
	{
		try {
			Class.forName(DriverClassName);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public String getDriverClassName() {
		return DriverClassName;
	}
	public void setDriverClassName(String driverClassName) {
		DriverClassName = driverClassName;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public static void setInstance(DataSource instance) {
		DataSource.instance = instance;
	}
	public Connection getConnection() throws Exception{
		Class.forName(DriverClassName);
		Connection conn =DriverManager.getConnection(url, username, password);
		return conn;
	}
	
}

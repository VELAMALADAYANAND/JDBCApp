package com.demo.database.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UsernameDatabase {
//	public static final String DB_DRIVER_CLASS = "org.postgresql.Driver";
	public static final String DB_USERNAME = "postgres";
	public static final String DB_PASSWORD = "root";
	public static final String DB_URL = "jdbc:postgresql://localhost/awsdb";
	
	public static Connection connection = null;
	static{
		try {
//			Class.forName(DB_DRIVER_CLASS);
			connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection(){
		return connection;
	}

}

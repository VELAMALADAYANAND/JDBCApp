package com.demo.logicimplementation;

import com.demo.database.app.UsernameDatabase;
import com.demo.service.LoginInterface;
import com.demo.util1.app.UserLogin;

import java.util.*;

import java.sql.*;

public class UserLogin1 implements LoginInterface {

	public void user_cred(UserLogin user) throws SQLException {
		// TODO Auto-generated method stub
		
		if (user.username.length() >= 4 && user.username.length() < 10 && user.password.length() > 4
				&& user.password.length() < 10 && user.password.matches("[[A-Za-z]!@#%&]{4,10}")) {
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost/awsdb", "postgres",
					"root");

			Statement st;
			try {
				st = UsernameDatabase.connection.createStatement();
				st.executeUpdate("insert into user_login values('" + user.username + "','" + user.password + "','"
						+ user.email + "')");
				
				System.out.println("User created successfully");
			} catch (SQLException e) {
				e.printStackTrace();
			}

		} else {
			System.out.println("Insert proper data");
		}

	}
}
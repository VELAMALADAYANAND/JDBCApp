package com.implement.database;

import java.sql.SQLException;
import java.util.Scanner;

import com.demo.logicimplementation.UserLogin1;
import com.demo.util1.app.UserLogin;

public class MainApp {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Usernsame:");
		String name=sc.next();
		System.out.println("password:");
		String pass= sc.next();
		System.out.println("email");
		String mail=sc.next();
		UserLogin obj2=new UserLogin(name,pass,mail);
		UserLogin1 obj=new UserLogin1();
		obj.user_cred(obj2);

	}

}

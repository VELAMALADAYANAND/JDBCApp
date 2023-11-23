package com.demo.util1.app;

public class UserLogin {
	public String username;
	public String password;
	public String email;
	/**
	 */
	public UserLogin(String username, String password, String email) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "UserLogin [username=" + username + ", password=" + password + ", email=" + email + "]";
	}
	public void userLogin(String name, String pass, String mail) {
		// TODO Auto-generated method stub
		
	}
	

}

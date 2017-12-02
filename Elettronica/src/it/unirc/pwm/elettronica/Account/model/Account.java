package it.unirc.pwm.elettronica.Account.model;

public class Account{
	
	private int idaccount;
	private String username, password;

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(int idaccount, String username, String password) {
		super();
		this.idaccount = idaccount;
		this.username = username;
		this.password = password;
	}

	public int getIdaccount() {
		return idaccount;
	}

	public void setIdaccount(int idaccount) {
		this.idaccount = idaccount;
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

	@Override
	public String toString() {
		return "Account [idaccount=" + idaccount + ", username=" + username + ", password=" + password + "]";
	}

}

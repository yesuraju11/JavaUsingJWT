package com.javainuse.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class UserData 
{
	@Id
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="userName")
	private String userName;
	@Column(name="password")
	private String password;
	
	
	public UserData() {
		super();
		// TODO Auto-generated constructor stub
	}


	public UserData(int id, String name, String userName, String password) {
		super();
		this.id = id;
		this.name = name;
		this.userName = userName;
		this.password = password;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "UserData [id=" + id + ", name=" + name + ", userName=" + userName + ", password=" + password + "]";
	}
	
	
	
	
	

}

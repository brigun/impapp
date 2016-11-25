package com.code.brigun.imp.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.code.brigun.imp.models.util.PasswordHash;

/**
*	created by brigun 11.24.16
*/

//sets up a db table for the user object list
@Entity

//initializes a sequence generator to restrict the number of users
@SequenceGenerator(name = "supervisors", initialValue = 1, allocationSize = 25)

@Table(name = "Users")
public class User
{
	
	private String userName;
	private String pwHash;
	private String role;
	private long uid;
	

//	no-args constructor for Hibernate
	public User(){}

	
	public User(String name, String pwd)
	{
		@SuppressWarnings("unused")
		User user = new User(name, pwd, "USER");
	}
	
	@SuppressWarnings("null")
	public User(String name, String pwd, String role)
	{
		this.userName = name;
		this.pwHash = PasswordHash.getMd5(pwd);
		this.role = role;
		this.uid = (Long) null;
	}
	
	@NotNull
	@Column(name = "username", unique = true)
	public String getUserName() {
		return userName;
	}

	@SuppressWarnings("unused")
	private void setUserName(String userName) {
		this.userName = userName;
	}
	
	@NotNull
	@Column(name = "pwhash")
	public String getPwHash() {
		return pwHash;
	}

	@SuppressWarnings("unused")
	private void setPwHash(String pwHash) {
		this.pwHash = pwHash;
	}
	
	@NotNull
	@Column(name = "role")
	public String getRole() {
		return role;
	}

	@SuppressWarnings("unused")
	private void setRole(String role) {
		this.role = role;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator =  "supervisors")
	@Column(name = "uid", unique = true)
	public long getUid()
	{
		return uid;
	}
	
	public void setUid(long uid)
	{
		this.uid = uid;
	}
	
	


}
package com.code.brigun.imp.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
*	created by brigun 11.24.16
*/


// create Vendors table
@Entity
@Table(name  = "Vendors")
public class Vendor 
{

	private String name;
	private String phoneNumber;
	private long vID;
	private String repName;
	
	public Vendor() {}
	
	@SuppressWarnings("null")
	public Vendor(String name, String phoneNumber, String repName)
	{
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.repName = repName;
		this.vID = (Long)null;
	}
	
	@NotNull
	@Column(name = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@NotNull
	@Column(name = "phonenumber")
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	// set vID as primary key for vendors, ensure unique
	@Id
	@GeneratedValue
	@NotNull
	@Column(name = "vid", unique = true)
	public long getvID() {
		return vID;
	}

	public void setvID(long vID) {
		this.vID = vID;
	}
	
	// this field will have a default value so @NotNull is not needed
	@Column(name = "repname")
	public String getRepName() {
		return repName;
	}

	public void setRepName(String repName) {
		this.repName = repName;
	}
	
	// replace possible null value with the String "none"
	public void setRepName()
	{
		this.setRepName("none");
	}
	
	
	
	
	
}

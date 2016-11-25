package com.code.brigun.imp.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Items")
public class Item 
{
	
	private String itemName;
	private long quantity;
	private String category;
	private int par;
	private Vendor vendor;
	
	public Item () {}
	
	public Item(String name, long quantity, String category, Vendor vendor)
	{
		itemName = name;
		this.quantity = quantity;
		this.category = category;
		this.vendor = vendor;
		this.par = 0;
	}
	
	@NotNull
	@Column(name = "itemname")
	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	@NotNull
	@Column(name = "quantity")
	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	
	@NotNull
	@Column(name = "category")
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	@Column(name = "par")
	public int getPar() {
		return par;
	}

	public void setPar(int par) {
		this.par = par;
	}
	
	@NotNull
	@ManyToOne
	@Column(name = "vendor")
	public Vendor getVendor() {
		return vendor;
	}

	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}
	
	
	
	
}

package com.myproj.demo;


import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter 
@Entity
@Table
public class users {
	
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	@Column
	private String name;
	@Column
	private String phoneNo;
	@Column
	private String address;
	@Column
	private String email;
	
   
	public users() {
		
	}

	public users(String name, String phoneNo, String address, String email) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.address = address;
		this.email = email;
	}


	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return  "users [ id="+ id + ",name=" + name + ",phoneNo=" + phoneNo + ",address=" + address + ",email=" + email + "]";
	}


}

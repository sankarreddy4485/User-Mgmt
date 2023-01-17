package com.userdetails.dto;

import lombok.Data;

public class UserDto {
	private int id;
	private String name;
	private String userName;
	private String email;
	private String phone;
	private String website;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	@Override
	public String toString() {
		return "UserDto [id=" + id + ", name=" + name + ", userName=" + userName + ", email=" + email + ", phone="
				+ phone + ", website=" + website + "]";
	}
	
	

}

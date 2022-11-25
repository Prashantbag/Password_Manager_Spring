package com.ty.password_mnger.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserSocial {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String facebookPassword;
	private String instagramPassword;
	private String gmailPassword;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFacebookPassword() {
		return facebookPassword;
	}
	public void setFacebookPassword(String facebookPassword) {
		this.facebookPassword = facebookPassword;
	}
	public String getInstagramPassword() {
		return instagramPassword;
	}
	public void setInstagramPassword(String instagramPassword) {
		this.instagramPassword = instagramPassword;
	}
	public String getGmailPassword() {
		return gmailPassword;
	}
	public void setGmailPassword(String gmailPassword) {
		this.gmailPassword = gmailPassword;
	}
	@Override
	public String toString() {
		return "UserSocial [id=" + id + ", facebookPassword=" + facebookPassword + ", instagramPassword="
				+ instagramPassword + ", gmailPassword=" + gmailPassword + "]";
	}
	
	
	
	
	
}

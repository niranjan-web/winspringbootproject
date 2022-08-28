package com.hospital.Entity;
import javax.persistence.*;

@Entity
public class AdminEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int adminId;
	@Column
	private String adminEmail;
	@Column
	private String adminPassword;
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminEmail() {
		return adminEmail;
	}
	public void setAdminLogin(String adminEmail) {
		this.adminEmail = adminEmail;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	public AdminEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AdminEntity(int adminId, String adminEmail, String adminPassword) {
		super();
		this.adminId = adminId;
		this.adminEmail = adminEmail;
		this.adminPassword = adminPassword;
	}
	@Override
	public String toString() {
		return "AdminEntity [adminId=" + adminId + ", adminEmail=" + adminEmail + ", adminPassword=" + adminPassword
				+ "]";
	}
	
	
}

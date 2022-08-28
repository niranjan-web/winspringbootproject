package com.hospital.Entity;
import javax.persistence.*;

@Entity
public class StaffEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int staffId;
	@Column
	private String staffName;
	@Column
	private String staffAge;
	@Column
	private String staffGender;
	@Column
	private String staffDateOfBirth;
	@Column
	private String staffQualification;
	@Column
	private String staffContact;
	@Column
	private String staffAddress;
	@Column
	private String staffEmailId;
	@Column
	private String staffPassword;
	
	
	public int getStaffId() {
		return staffId;
	}
	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public String getStaffAge() {
		return staffAge;
	}
	public void setStaffAge(String staffAge) {
		this.staffAge = staffAge;
	}
	public String getStaffGender() {
		return staffGender;
	}
	public void setStaffGender(String staffGender) {
		this.staffGender = staffGender;
	}
	public String getStaffDOB() {
		return staffDateOfBirth;
	}
	public void setStaffDOB(String staffDOB) {
		this.staffDateOfBirth = staffDOB;
	}
	public String getStaffQualification() {
		return staffQualification;
	}
	public void setStaffQualification(String staffQualification) {
		this.staffQualification = staffQualification;
	}
	public String getStaffContact() {
		return staffContact;
	}
	public void setStaffContact(String staffContact) {
		this.staffContact = staffContact;
	}
	public String getStaffAddress() {
		return staffAddress;
	}
	public void setStaffAddress(String staffAddress) {
		this.staffAddress = staffAddress;
	}
	public String getStaffMail() {
		return staffEmailId;
	}
	public void setStaffMail(String staffMail) {
		this.staffEmailId = staffMail;
	}
	public String getStaffPassword() {
		return staffPassword;
	}
	public void setStaffPassword(String staffPassword) {
		this.staffPassword = staffPassword;
	}
	public StaffEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StaffEntity(int staffId, String staffName, String staffAge, String staffGender, String staffDOB,
			String staffQualification, String staffContact, String staffAddress, String staffMail,
			String staffPassword) {
		super();
		this.staffId = staffId;
		this.staffName = staffName;
		this.staffAge = staffAge;
		this.staffGender = staffGender;
		this.staffDateOfBirth = staffDOB;
		this.staffQualification = staffQualification;
		this.staffContact = staffContact;
		this.staffAddress = staffAddress;
		this.staffEmailId = staffMail;
		this.staffPassword = staffPassword;
	}
	@Override
	public String toString() {
		return "StaffEntity [staffId=" + staffId + ", staffName=" + staffName + ", staffAge=" + staffAge
				+ ", staffGender=" + staffGender + ", staffDOB=" + staffDateOfBirth + ", staffQualification="
				+ staffQualification + ", staffContact=" + staffContact + ", staffAddress=" + staffAddress
				+ ", staffMail=" + staffEmailId + ", staffPassword=" + staffPassword + "]";
	}
	
	
	
}

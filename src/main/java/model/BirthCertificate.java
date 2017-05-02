package model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BirthCertificate")
public class BirthCertificate
{ 
	@Id
	@GeneratedValue
	@Column(name="CertificateNo")
	public int certificateNo;
	
	@Column(name="DateOfApplying")
	public Date dateOfApplying ;
	
	@Column(name="DateOfApproval")
	public Date dateOfApproval ;
	
	
	@Column(name="fathersName")
	public String fathersName = null;
	
	@Column(name="mothersName")
	public String mothersName = null;
	
	@Column(name="fatherAadhaarNumber")
	public String fatherAadhaarNumber = null;
	
	@Column(name="sex")
	public String sex = null;
	
	@Column(name="name")
	public String name = null;
	
	@Column(name="district")
	public String district = null;
	
	@Column(name="placeOfBirth")
	public String placeOfBirth = null;
	
	@Column(name="dateOfBirth")
	public Date dateOfBirth=null;
	
	@Column(name="Approval")
	public int approval;
	
	public int getCertificateNo() {
		return certificateNo;
	}
	public void setCertificateNo(int certificateNo) {
		this.certificateNo = certificateNo;
	}
	public Date getDateOfApplying() {
		return dateOfApplying;
	}
	public void setDateOfApplying(Date dateOfApplying) {
		this.dateOfApplying = dateOfApplying;
	}
	public Date getDateOfApproval() {
		return dateOfApproval;
	}
	public void setDateOfApproval(Date dateOfApproval) {
		this.dateOfApproval = dateOfApproval;
	}
	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getFathersName() {
		return fathersName;
	}
	public void setFathersName(String fathersName) {
		this.fathersName = fathersName;
	}
	public String getMothersName() {
		return mothersName;
	}
	public void setMothersName(String mothersName) {
		this.mothersName = mothersName;
	}
	public String getFatherAadhaarNumber() {
		return fatherAadhaarNumber;
	}
	public void setFatherAadhaarNumber(String fatherAadhaarNumber) {
		this.fatherAadhaarNumber = fatherAadhaarNumber;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getPlaceOfBirth() {
		return placeOfBirth;
	}
	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}
	public int getApproval() {
		return approval;
	}
	public void setApproval(int approval) {
		this.approval = approval;
	}
	
}
	
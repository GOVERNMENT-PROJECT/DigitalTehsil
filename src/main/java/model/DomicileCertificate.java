package model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="domicilecertificate")
public class DomicileCertificate {
	
	
	@Column(name="AadhaarNo")
	public String aadhaarNo;
	
	@Id
	@GeneratedValue
	@Column(name="DomicileCertificateNo")
	public int certificateNo;
	
	@Column(name="DateOfApplying")
	public Date dateOfApplying;
	
	@Column(name="DateOfApproval")
	public Date dateOfApproval;
	
	@Column(name="Approval")
	public int approval;

	public Date getDateOfApproval() {
		return dateOfApproval;
	}

	public void setDateOfApproval(Date dateOfApproval) {
		this.dateOfApproval = dateOfApproval;
	}

	public int getApproval() {
		return approval;
	}

	public void setApproval(int approval) {
		this.approval = approval;
	}

	public String getAadharNo() {
		return aadhaarNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadhaarNo = aadharNo;
	}

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
	
	

}

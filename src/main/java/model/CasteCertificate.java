package model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="castecertificate")
public class CasteCertificate {
	
	
	@Column(name="AadhaarNo")
	public String aadharNo;
	
	@Id
	@GeneratedValue
	@Column(name="CertificateNo")
	public int certificateNo;
	
	@Column(name="Approval")
	public int approval;

	@Column(name="DateOfApplying")
	public Date dateOfApplying;
	
	@Column(name="DateOfApproval")
	public Date dateOfApproval;
    
	@Column(name="Caste")
	public String caste;
	
	public int getApproval() {
		return approval;
	}

	public void setApproval(int approval) {
		this.approval = approval;
	}
	
	public Date getDateOfApproval() {
		return dateOfApproval;
	}

	public void setDateOfApproval(Date dateOfApproval) {
		this.dateOfApproval = dateOfApproval;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
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

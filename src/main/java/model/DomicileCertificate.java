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
	public String aadharNo;
	
	@Id
	@GeneratedValue
	@Column(name="DomicileCertificateNo")
	public int certificateNo;
	
	@Column(name="DateOfApplying")
	public Date dateOfApplying;

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

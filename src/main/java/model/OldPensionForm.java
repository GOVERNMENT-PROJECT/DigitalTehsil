package model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="oldagepensionform")
public class OldPensionForm {
	
	@Column(name="categories")
	public String categories;
	
	@Column(name="IdentificationMark")
	public String mark;
	
	@Column(name="aadhaarno")
	public String aadhaarno;
	
	
	public String check1;
	
	public String check2;
	
	@Column(name="DateOfApproval")
	public Date dateOfApproval;
	
	@Column(name="DateOfApplying")
	public Date dateOfApplying;
	
	@Column(name="Approval")
	public int approval;
	
	@Id
	@GeneratedValue
	@Column(name="CertificateNo")
	public int certificateNo;
	
	public String getCategories() {
		return categories;
	}

	public void setCategories(String categories) {
		this.categories = categories;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getCheck1() {
		return check1;
	}

	public void setCheck1(String check1) {
		this.check1 = check1;
	}

	public String getCheck2() {
		return check2;
	}

	public void setCheck2(String check2) {
		this.check2 = check2;
	}

	public int getCertificateNo() {
		return certificateNo;
	}

	public void setCertificateNo(int certificateNo) {
		this.certificateNo = certificateNo;
	}

	

	public Date getDateOfApproval() {
		return dateOfApproval;
	}

	public void setDateOfApproval(Date dateOfApproval) {
		this.dateOfApproval = dateOfApproval;
	}

	public Date getDateOfApplying() {
		return dateOfApplying;
	}

	public void setDateOfApplying(Date dateOfApplying) {
		this.dateOfApplying = dateOfApplying;
	}

	public int getApproval() {
		return approval;
	}

	public void setApproval(int approval) {
		this.approval = approval;
	}

	public String getAadhaarno() {
		return aadhaarno;
	}

	public void setAadhaarno(String aadhaarno) {
		this.aadhaarno = aadhaarno;
	}

	
	


}

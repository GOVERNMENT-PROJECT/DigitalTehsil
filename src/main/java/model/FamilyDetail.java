package model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="rationcard")
public class FamilyDetail {
	
	
	
	@Column(name="HeadAadhaarNo")
	public String id;

	@Id
	@Column(name="FamilyMemberAadhaarNo")
	public String aadhaarNo;
	
	@Column(name="DateOfApproval")
	public Date dateOfApproval;
	
	@Column(name="DateOfApplying")
	public Date dateOfApplying;
	
	@Column(name="Approval")
	public int approval;
	
	@Column(name="FamilyMemberRelation")
	public String realationWithHead;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAadhaarNo() {
		return aadhaarNo;
	}

	public void setAadhaarNo(String aadhaarNo) {
		this.aadhaarNo = aadhaarNo;
	}

	public String getRealationWithHead() {
		return realationWithHead;
	}

	public void setRealationWithHead(String realationWithHead) {
		this.realationWithHead = realationWithHead;
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
	
	

}

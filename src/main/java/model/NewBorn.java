package model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="newborn")
public class NewBorn
{ 
	@Id
	@GeneratedValue
	@Column(name="newBornId")
	public int newBornId;
	
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
	
	public int getNewBornId() {
		return newBornId;
	}
	public void setNewBornId(int newBornId) {
		this.newBornId = newBornId;
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
	
}
	
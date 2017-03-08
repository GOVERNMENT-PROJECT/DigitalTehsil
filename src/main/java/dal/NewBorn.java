package dal;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="newborn")
public class NewBorn {
	
	@Id@GeneratedValue
	@Column(name="NewBornId")
	int NewBornId;
	
	@Column(name="FathersName")
	String FathersName;
	
	@Column(name="MothersName")
	String Mothersname;
	
	@Column(name="FatherAadhaarNumber")
	String FatherAadhaarNumber;
	
	@Column(name="Sex")
	String Sex;
	
	@Column(name="Name")
	String Name;
	
	//@Column(name="DateOfBirth")
	//Date DateOfBirth;
	
	@Column(name="District")
	String District;
	
	@Column(name="PlaceOfBirth")
	String PlaceOfBirth;
	
	
	public NewBorn() {}
	//@Column(name="RegistrationNumber")
	//int RegistrationNumber;
	
	/*
	public int getNewUserId() {
		return NewUserId;
	}
	public void setNewUserId(int newUserId) {
		NewUserId = newUserId;
	}*/
	public String getFathersName() {
		return FathersName;
	}
	public void setFathersName(String fathersName) {
		this.FathersName = fathersName;
	}
	public String getMothersname() {
		return Mothersname;
	}
	public void setMothersname(String mothersname) {
		this.Mothersname = mothersname;
	}
	public String getFatherAadhaarNumber() {
		return FatherAadhaarNumber;
	}
	public void setFatherAadhaarNumber(String fatherAadhaarNumber) {
		this.FatherAadhaarNumber = fatherAadhaarNumber;
	}
	public String getSex() {
		return Sex;
	}
	public void setSex(String sex) {
		this.Sex = sex;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}/*
	public Date getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}*/
	public String getDistrict() {
		return District;
	}
	public void setDistrict(String district) {
		this.District = district;
	}
	public String getPlaceOfBirth() {
		return PlaceOfBirth;
	}
	public void setPlaceOfBirth(String placeOfBirth) {
		this.PlaceOfBirth = placeOfBirth;
	}/*
	public int getRegistrationNumber() {
		return RegistrationNumber;
	}
	public void setRegistrationNumber(int registrationNumber) {
		RegistrationNumber = registrationNumber;
	}*/
	
	

}

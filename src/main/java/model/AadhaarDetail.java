package model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.type.BinaryType;

@Entity
@Table (name="aadhardetails")
public class AadhaarDetail {
	
	@Id
	@Column(name="AadhaarNumber")
	public String AadhaarNumber;
	
	@Column(name="FirstName")
	public String FirstName;
	
	@Column(name="MiddleName")
	public String MiddleName;
	
	@Column(name="LastName")
	public String LastName;
	
	@Column(name="FathersFirstName")
	public String FathersFirstName;
	
	@Column(name="FathersLastName")
	public String FathersLastName;
	
	@Column(name="AddressLine1")
	public String AddressLine1;
	
	@Column(name="AddressLine2")
	public String AddressLine2;
	
	@Column(name="CityId")
	public int CityId;
	
	@Column(name="DateOfBirth")
	public Date DateOfBirth;
	
	@Column(name="Sex")
	public String Sex;
	/*
	@Column(name="Photo")
	public byte[] Photo;

	public byte[] getPhoto() {
		return Photo;
	}

	public void setPhoto(byte[] photo) {
		Photo = photo;
	}
    */
	public String getAadhaarNumber() {
		return AadhaarNumber;
	}

	public void setAadhaarNumber(String aadhaarNumber) {
		AadhaarNumber = aadhaarNumber;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getMiddleName() {
		return MiddleName;
	}

	public void setMiddleName(String middleName) {
		MiddleName = middleName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getFatherFirstName() {
		return FathersFirstName;
	}

	public void setFatherFirstName(String fatherFirstName) {
		FathersFirstName = fatherFirstName;
	}

	public String getFatherLastName() {
		return FathersLastName;
	}

	public void setFatherLastName(String fatherLastName) {
		FathersLastName = fatherLastName;
	}

	public String getAddressLine1() {
		return AddressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		AddressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return AddressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		AddressLine2 = addressLine2;
	}

	public int getCityId() {
		return CityId;
	}

	public void setCityId(int cityId) {
		CityId = cityId;
	}

	public Date getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}

	public String getSex() {
		return Sex;
	}

	public void setSex(String sex) {
		Sex = sex;
	}

	

}

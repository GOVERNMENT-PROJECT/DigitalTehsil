package model;

import java.util.ArrayList;

public class UserProfile {
	
	public model.AadhaarDetail user;
	
	public ArrayList<model.CertificateDetail> certi;

	public model.AadhaarDetail getUser() {
		return user;
	}

	public void setUser(model.AadhaarDetail user) {
		this.user = user;
	}

	public ArrayList<model.CertificateDetail> getCerti() {
		return certi;
	}

	public void setCertificatedetails(ArrayList<model.CertificateDetail> certi) {
		this.certi = certi;
	}
	

}

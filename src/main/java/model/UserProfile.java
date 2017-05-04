package model;

import java.util.ArrayList;

public class UserProfile {
	
	public model.User user;
	
	public ArrayList<model.CertificateDetail> certi;

	public model.User getUser() {
		return user;
	}

	public void setUser(model.User user) {
		this.user = user;
	}

	public ArrayList<model.CertificateDetail> getCerti() {
		return certi;
	}

	public void setCertificatedetails(ArrayList<model.CertificateDetail> certi) {
		this.certi = certi;
	}
	

}

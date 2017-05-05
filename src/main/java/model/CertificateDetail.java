package model;

public class CertificateDetail {
	
	public int certificateNumber;
	public String typeOfCertificate;
	public String approval;
	
	public int getCertificateNumber() {
		return certificateNumber;
	}
	public void setCertificateNumber(int CertificateNumber) {
		certificateNumber = CertificateNumber;
	}
	public String getTypeOfCertificate() {
		return typeOfCertificate;
	}
	public void setTypeOfCertificate(String TypeOfCertificate) {
		typeOfCertificate = TypeOfCertificate;
	}
	public String getApproval() {
		return approval;
	}
	public void setApproval(String Approval) {
		approval = Approval;
	} 

}

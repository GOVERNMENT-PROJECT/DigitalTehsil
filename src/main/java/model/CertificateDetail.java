package model;

public class CertificateDetail {
	
	public int CertificateNumber;
	public String TypeOfCertificate;
	public String Approval;
	
	public int getCertificateNumber() {
		return CertificateNumber;
	}
	public void setCertificateNumber(int certificateNumber) {
		CertificateNumber = certificateNumber;
	}
	public String getTypeOfCertificate() {
		return TypeOfCertificate;
	}
	public void setTypeOfCertificate(String typeOfCertificate) {
		TypeOfCertificate = typeOfCertificate;
	}
	public String getApproval() {
		return Approval;
	}
	public void setApproval(String approval) {
		Approval = approval;
	} 

}

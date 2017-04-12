package util;

public  enum ApprovalCode {
	Applied(0),
	InProcess(-2),
	Rejected(-1),
	Accepted(1);
	
	private final int ApprovalCode;
	
	ApprovalCode( int status)
	{		
		ApprovalCode = status;
	}
	
	public int getApprovalCode()
	{		
		return this.ApprovalCode;
	}
	
}

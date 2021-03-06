package util;

public  enum StatusCode {
	UnknownError(-2),
	Error(-1),
	Success(1);
	
	private final int statusCode;
	
	StatusCode( int status)
	{
		
		statusCode = status;
	}
	
	public int getStatusCode()
	{		
		return this.statusCode;
	}
	
}

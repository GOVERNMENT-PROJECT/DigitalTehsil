package admin;

import util.StatusCode;

public class Validation {
	
	public util.StatusCode checkAdminValidation(model.User admin)
	{
		util.StatusCode statuscode =  StatusCode.Error;
		
		if(admin.getEmailId().equals("shiva")  && admin.getPassword().equals("123"))
		{
			statuscode= StatusCode.Success;
			return statuscode;
		}
		
		else
			return statuscode;
	}

}

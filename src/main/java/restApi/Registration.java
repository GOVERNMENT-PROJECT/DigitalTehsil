package restApi;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("register")
public class Registration {
	
	@Path("/newborn")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String newBornRegister(dal.NewBorn newuser)
	{
		String s= new  biz.Registration().newBornRegistration(newuser);
		return s;
		
	}
	
	

}

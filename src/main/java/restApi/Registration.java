package restApi;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("register")
public class Registration {
	/*
	@Path("/newborn")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String newBornRegister(dal.NewBorn newuser)
	{
		String s= new  biz.Registration().newBornRegistration(newuser);
		return s;
		
	}
	
	*/
	
	
	@Path("/newborn")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public dal.SampleOutput newBornRegister(dal.NewBorn newBorn)
	{
		System.out.println("Fathers Name : " +newBorn.getFathersName());
		System.out.println("Mothers Name : " +newBorn.getMothersName());
		System.out.println("asd : " +newBorn);
		
		dal.SampleOutput so = new dal.SampleOutput();
		so.code = "200";
		so.message = "Your success code : ";
		return so;
		
	}

}

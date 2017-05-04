package restApi;

import java.util.ArrayList;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import util.StatusCode;

@Path("User")
public class User {
	
	@Path("/SignUp")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public model.Result newRegistration(model.User user)
	{
		System.out.println("Phone number : " +user.getMobile());
		System.out.println("aadhaar number : " +user.aadhaarNumber);
		
		StatusCode status= new  biz.User().signUp(user);
		
		model.Result result=new model.Result();
		result.setStatus(status.getStatusCode());
		
		return result;
	}
	
	
	@Path("/Login")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public model.Result login(model.User user)
	{
		System.out.println("Phone number : " +user.getMobile());
		System.out.println("aadhaar number : " +user.aadhaarNumber);
		
		StatusCode status= new  biz.User().login(user);
		
		model.Result result=new model.Result();
		result.setStatus(status.getStatusCode());
		
		return result;
	}
	
	@Path("/Profile/{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public model.UserProfile login(String id)
	{
				return new biz.User().getUserProfile(id);
	}
}
	
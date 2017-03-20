package restApi;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("register")
public class Registration {
	
	@Path("/newborn")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String newBornRegister(model.NewBorn newuser)
	{
		System.out.println("Fathers Name : " +newuser.getFathersName());
		System.out.println("Mothers Name : " +newuser.getMothersName());
		String s= new  biz.Registration().newBornRegistration(newuser);
		return s;
		
	}
	
	
	@Path("/rationcard/{Id}")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String rationCardRegister(@PathParam("Id") String id,ArrayList<model.FamilyDetail> rationcarddetail)
	{
		System.out.println("size : " +rationcarddetail.size());
		for(model.FamilyDetail rationcard : rationcarddetail)
		{
			System.out.println("relation="+rationcard.getRealationWithHead());
			System.out.println("a no="+rationcard.getAadhaarNo());
			
		}
		System.out.println("id : " +id);
		String s= new  biz.Registration().rationCardRegistration(rationcarddetail,id);
		return s;
		
	}
	
	/*
	
	
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
        */
}

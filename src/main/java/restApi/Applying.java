package restApi;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("apply")
public class Applying {
	
	@Path("/newborn")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String newBornRegister(model.NewBorn newuser)
	{
		System.out.println("Fathers Name : " +newuser.getFathersName());
		System.out.println("Mothers Name : " +newuser.getMothersName());
		String s= new  biz.Applying().newBornRegistration(newuser).toString();
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
		String s= new  biz.Applying().rationCardRegistration(rationcarddetail,id).toString();
		return s;
		
	}
	
	
	@Path("/castecertificate/{Id}")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String casteRegister(@PathParam("Id") String id,model.CasteCertificate cz)
	{
		
		System.out.println("id : " +id);
		String s= new  biz.Applying().casteCertificateRegistration(cz, id).toString();
		return s;
		
	}
	
	
	@Path("/domicilecertificate/{Id}")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String domicileRegister(@PathParam("Id") String id,model.DomicileCertificate cz)
	{
		
		System.out.println("id : " +id);
		String s= new  biz.Applying().domicileCertificateRegistration(cz, id).toString();
		return s;
		
	}
	
	
	
	
	@Path("/identitycertificate/{Id}")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public model.User identityCertificate(@PathParam("Id") String id)
	{
		
		System.out.println("id : " +id);
		return new biz.Applying().identityCertificateRegistering(id);
		
	}
        
}

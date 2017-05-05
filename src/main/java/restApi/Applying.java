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
	@Produces(MediaType.APPLICATION_JSON)
	public model.Result newBornRegister(model.BirthCertificate newuser)
	{
		System.out.println("Fathers Name : " +newuser.getFathersName());
		System.out.println("Mothers Name : " +newuser.getMothersName());
		model.Result result=new model.Result();
		result.setStatus(new  biz.Applying().newBornRegistration(newuser).getStatusCode());
		return result;
		
	}
	
	
	@Path("/rationcard/{Id}")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public model.Result rationCardRegister(@PathParam("Id") String id,ArrayList<model.FamilyDetail> rationcarddetail)
	{
		System.out.println("size : " +rationcarddetail.size());
		for(model.FamilyDetail rationcard : rationcarddetail)
		{
			System.out.println("relation="+rationcard.getRealationWithHead());
			System.out.println("a no="+rationcard.getAadhaarNo());
			
		}
		System.out.println("id : " +id);
		model.Result result = new model.Result();
		result.setStatus(new  biz.Applying().rationCardRegistration(rationcarddetail,id).getStatusCode());
		return result;
		
	}
	
	
	@Path("/oldpensionform/{Id}")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public model.Result casteRegister(@PathParam("Id") String id,model.OldPensionForm cz)
	{
		
		System.out.println("id : " +id);
		model.Result result=new model.Result();
		result.setStatus( new  biz.Applying().oldagepensionCertificateRegistration(cz, id).getStatusCode());
		return result;
		
	}
	
	
	@Path("/domicilecertificate/{Id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public model.Result domicileRegister(@PathParam("Id") String id)
	{
		
		System.out.println("id : " +id);
		model.Result result = new model.Result();
		
		result.setStatus( new  biz.Applying().domicileCertificateRegistration( id).getStatusCode());
		return result;
		
	}
	
	
	
	
	@Path("/identitycertificate/{Id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public model.AadhaarDetail identityCertificate(@PathParam("Id") String id)
	{
		
		System.out.println("id : " +id);
		return new biz.Applying().identityCertificateRegistering(id);
		
	}
        
}

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

@Path("Admin")
public class AdminFunction {
	
	@Path("/Login")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public model.Result newRegistration(model.User admin)
	{
		System.out.println("Email-Id : " +admin.getEmailId());
		System.out.println("Password : " +admin.getPassword());
		
		StatusCode status= new  admin.Validation().checkAdminValidation(admin);
		
		model.Result result=new model.Result();
		result.setStatus(status.getStatusCode());
		
		return result;
	}
	
	
	@Path("/CasteCertificateApproval")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public model.Result casteCertificateApproval(ArrayList<model.CasteCertificate>  castecertificate)
	{		
		StatusCode status= new  admin.CertificateApproval().casteCertificateAprroval(castecertificate);
		
		model.Result result=new model.Result();
		result.setStatus(status.getStatusCode());
		
		return result;
	}
	
	
	@Path("/DomicileCertificateApproval")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public model.Result domicileCertificateApproval(ArrayList<model.DomicileCertificate>  domicilecertificates)
	{		
		StatusCode status= new  admin.CertificateApproval().domicileCertificateAprroval(domicilecertificates);
		
		model.Result result=new model.Result();
		result.setStatus(status.getStatusCode());
		
		return result;
	}
	
	
	@Path("/RationCardApproval")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public model.Result RationCardApproval(ArrayList<model.FamilyDetail>  rationcards)
	{		
		StatusCode status= new  admin.CertificateApproval().rationCardAprroval(rationcards);
		
		model.Result result=new model.Result();
		result.setStatus(status.getStatusCode());
		
		return result;
	}
	
	
	@Path("/BirthCertificateApproval")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public model.Result birthCertificateApproval(ArrayList<model.BirthCertificate>  birthcertificates)
	{		
		StatusCode status= new  admin.CertificateApproval().birthCertificateAprroval(birthcertificates);
		
		model.Result result=new model.Result();
		result.setStatus(status.getStatusCode());
		
		return result;
	}
	
	
	@Path("/BirthCertificateRequest")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<model.BirthCertificate> birthCertificateApproval()
	{		
		return new admin.CertificateRequest().birthCertificateRequest();
	}
	
	@Path("/CasteCertificateRequest")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<model.CasteCertificate> casteCertificateApproval()
	{		
		return new admin.CertificateRequest().casteCertificateRequest();
	}
	
	@Path("/DomicileCertificateRequest")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<model.DomicileCertificate> domicileCertificateApproval()
	{		
		return new admin.CertificateRequest().domocileCertificateRequest();
	}
	
	@Path("/RationCardRequest")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<model.FamilyDetail> rationCardApproval()
	{		
		return new admin.CertificateRequest().rationCardRequest();
	}
	
	@Path("/UserDetail/{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public model.AadhaarDetail domicileCertificateApproval(@PathParam("Id") String id)
	{		
		return new admin.UserDetail().getUserDetail(id);
	}
	
	

}

package biz;

import java.util.ArrayList;
import java.util.Calendar;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import util.StatusCode;

public class Applying {

	public util.StatusCode newBornRegistration(model.BirthCertificate newuser)
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		StatusCode status = StatusCode.UnknownError;
		
		try
		{		
			newuser.setApproval(-1);
			newuser.setDateOfApplying(new java.sql.Date(Calendar.getInstance().getTime().getTime()));
			
		   session.save(newuser);
		   tx.commit();
		   status=StatusCode.Success;
		   return status;
		}
		
		catch(Exception e)
		{
			tx.rollback();
			return status;
		}
		
		finally
		{
			session.close();
		}

		
	}
	
	
	public util.StatusCode rationCardRegistration(ArrayList<model.FamilyDetail> rationcarddetail,String id)
	{
		
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		StatusCode status = StatusCode.UnknownError;
		
		try
		{
			for(model.FamilyDetail rationcard : rationcarddetail)
			{
				System.out.println("a no="+rationcard.getAadhaarNo());
				Transaction tx=session.beginTransaction();
				rationcard.setId(id);
				rationcard.setApproval(-1);
				rationcard.setDateOfApplying(new java.sql.Date(Calendar.getInstance().getTime().getTime()));
				System.out.println(session.save(rationcard));
				tx.commit();
				
			}
			status=StatusCode.Success;
		   return status;
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			//tx.rollback();
			return status;
		}
		
		finally
		{
			session.close();
		}

		
	}
	
	
	public util.StatusCode casteCertificateRegistration(model.CasteCertificate cz,String id)
	{
		
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx=null;
		StatusCode status = StatusCode.UnknownError;
		try
		{
		tx=session.beginTransaction();
		cz.setApproval(-1);
		cz.setDateOfApplying(new java.sql.Date(Calendar.getInstance().getTime().getTime()));
		
				cz.setAadharNo(id);
				session.save(cz);
				tx.commit();
				
			status=StatusCode.Success;
		   return status;
		}
		
		catch(Exception e)
		{
			tx.rollback();
			return status;
		}
		
		finally
		{
			session.close();
		}

		
	}
	
	
	public util.StatusCode domicileCertificateRegistration(String id)
	{
		
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx=null;
		StatusCode status = StatusCode.UnknownError;
		model.DomicileCertificate cz=new model.DomicileCertificate();
		try
		{
		tx=session.beginTransaction();
				cz.setAadharNo(id);
				cz.setApproval(-1);
				cz.setDateOfApplying(new java.sql.Date(Calendar.getInstance().getTime().getTime()));
				
				session.save(cz);
				tx.commit();
				
		   status=StatusCode.Success;	
		   return status;
		}
		
		catch(Exception e)
		{
			tx.rollback();
			return status;
		}
		
		finally
		{
			session.close();
		}

		
	}
	
	public model.AadhaarDetail identityCertificateRegistering(String id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Query query=null;
		String hql =null;
		model.AadhaarDetail u =new model.AadhaarDetail();
		try {
			
			hql = "FROM AadhaarDetail E WHERE  E.AadhaarNumber= :useraadhaarNumber";
			query = session.createQuery(hql);
			query.setParameter("useraadhaarNumber", id);
			u = (model.AadhaarDetail)query.uniqueResult();
			session.getTransaction().commit();
		    return u;
		}

		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			return u;
		}

		finally {
			session.close();
			
		}

	}
}

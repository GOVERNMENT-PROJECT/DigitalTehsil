package biz;

import java.util.ArrayList;

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
		Transaction tx=null;
		StatusCode status = StatusCode.UnknownError;
		
		try
		{
			for(model.FamilyDetail rationcard : rationcarddetail)
			{
				tx=session.beginTransaction();
				rationcard.setId(id);
				session.save(rationcard);
				tx.commit();
				
			}
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
	
	
	public util.StatusCode casteCertificateRegistration(model.CasteCertificate cz,String id)
	{
		
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx=null;
		StatusCode status = StatusCode.UnknownError;
		try
		{
		tx=session.beginTransaction();
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
	
	
	public util.StatusCode domicileCertificateRegistration(model.DomicileCertificate cz,String id)
	{
		
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx=null;
		StatusCode status = StatusCode.UnknownError;
		try
		{
		tx=session.beginTransaction();
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

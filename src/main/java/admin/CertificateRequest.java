package admin;

import java.util.ArrayList;
import java.util.Calendar;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import biz.HibernateUtil;
import util.StatusCode;

public class CertificateRequest {
	
	
	public ArrayList<model.CasteCertificate> casteCertificateRequest()
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		ArrayList<model.CasteCertificate> castecertificates = null;
		
		try
		{		
			session.beginTransaction();
			Query query=session.createQuery("FROM CasteCertificate C WHERE C.approval=-1");
			castecertificates = (ArrayList<model.CasteCertificate>) query.list();
		
		    return castecertificates;
		
		}
		
		catch(Exception e)
		{
			return castecertificates;
		}
		
		finally
		{
			session.close();
		}
	}
	
	
	public ArrayList<model.BirthCertificate> birthCertificateRequest()
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		ArrayList<model.BirthCertificate> birthcertificates = null;
		
		try
		{		
			session.beginTransaction();
			Query query=session.createQuery("FROM CasteCertificate C WHERE C.approval=-1");
			birthcertificates = (ArrayList<model.BirthCertificate>) query.list();
		
		    return birthcertificates;
		
		}
		
		catch(Exception e)
		{
			return birthcertificates;
		}
		
		finally
		{
			session.close();
		}
	}	
	
	public ArrayList<model.DomicileCertificate> domocileCertificateRequest()
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		ArrayList<model.DomicileCertificate> domocilecertificates = null;
		
		try
		{		
			session.beginTransaction();
			Query query=session.createQuery("FROM CasteCertificate C WHERE C.approval=-1");
			domocilecertificates = (ArrayList<model.DomicileCertificate>) query.list();
		
		    return domocilecertificates;
		
		}
		
		catch(Exception e)
		{
			return domocilecertificates;
		}
		
		finally
		{
			session.close();
		}
	}

}

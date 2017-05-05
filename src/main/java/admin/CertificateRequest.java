package admin;

import java.util.List;
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
			Query query=session.createQuery("FROM BirthCertificate C WHERE C.approval=-1");
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
			Query query=session.createQuery("FROM DomicileCertificate C WHERE C.approval=-1");
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
	
	
	public ArrayList<model.FamilyDetail> rationCardRequest()
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		ArrayList<model.FamilyDetail> rationcards = null;
		model.FamilyDetail f=new model.FamilyDetail();
		try
		{		
			session.beginTransaction();
			Query query=session.createQuery(" FROM FamilyDetail F WHERE F.approval=-1 ");
			rationcards = (ArrayList<model.FamilyDetail>) query.list();
			
		    return rationcards;
		
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			return rationcards;
		}
		
		finally
		{
			session.close();
		}
	}
	
	public ArrayList<model.OldPensionForm> oldpensionformRequest()
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		ArrayList<model.OldPensionForm> op = null;
		
		try
		{		
			session.beginTransaction();
			Query query=session.createQuery("FROM OldPensionForm C WHERE C.approval=-1");
			op = (ArrayList<model.OldPensionForm>) query.list();
		
		    return op;
		
		}
		
		catch(Exception e)
		{
			return op;
		}
		
		finally
		{
			session.close();
		}
	}

}

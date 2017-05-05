package admin;

import java.sql.Date;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import org.hibernate.Session;
import org.hibernate.Transaction;

import biz.HibernateUtil;
import util.StatusCode;

public class CertificateApproval {
	
	public util.StatusCode casteCertificateAprroval(ArrayList<model.CasteCertificate> castecertificates)
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		StatusCode status = StatusCode.UnknownError;
		Calendar c;
		
		try
		{
			
		
		for(model.CasteCertificate castecertificate: castecertificates )
		{
			Transaction tx=session.beginTransaction();
			castecertificate.setDateOfApproval(new java.sql.Date(Calendar.getInstance().getTime().getTime()));
			//castecertificate.setApproval(1);
			session.update(castecertificate);
			tx.commit();
		}
		
		status=StatusCode.Success;
		return status;
		
		}
		
		catch(Exception e)
		{
			status=StatusCode.UnknownError;
			return status;
		}
		
		finally
		{
			session.close();
		}
	}
	
	
	public util.StatusCode domicileCertificateAprroval(ArrayList<model.DomicileCertificate> domocilecertificates)
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		StatusCode status = StatusCode.UnknownError;
		Calendar c;
		
		try
		{
			
		
		for(model.DomicileCertificate domicilecertificate: domocilecertificates )
		{
			Transaction tx=session.beginTransaction();
			domicilecertificate.setDateOfApproval(new java.sql.Date(Calendar.getInstance().getTime().getTime()));
			//domicilecertificate.setApproval(1);
			session.update(domicilecertificate);
			tx.commit();
		}
		
		status=StatusCode.Success;
		return status;
		
		}
		
		catch(Exception e)
		{
			status=StatusCode.UnknownError;
			return status;
		}
		
		finally
		{
			session.close();
		}
	}
	
	
	public util.StatusCode birthCertificateAprroval(ArrayList<model.BirthCertificate> birthcertificates)
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		StatusCode status = StatusCode.UnknownError;
		Calendar c;
		
		try
		{
			
		
		for(model.BirthCertificate birthcertificate: birthcertificates )
		{
			Transaction tx=session.beginTransaction();
			birthcertificate.setDateOfApproval(new java.sql.Date(Calendar.getInstance().getTime().getTime()));
			//birthcertificate.setApproval(1);
			session.update(birthcertificate);
			tx.commit();
		}
		
		status=StatusCode.Success;
		return status;
		
		}
		
		catch(Exception e)
		{
			status=StatusCode.UnknownError;
			return status;
		}
		
		finally
		{
			session.close();
		}
	}
	
	
	public util.StatusCode rationCardAprroval(ArrayList<model.FamilyDetail> rationcards)
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		StatusCode status = StatusCode.UnknownError;
		Calendar c;
		
		try
		{
			
		
		for(model.FamilyDetail rationcard: rationcards )
		{
			Transaction tx=session.beginTransaction();
			rationcard.setDateOfApproval(new java.sql.Date(Calendar.getInstance().getTime().getTime()));
			//rationcard.setApproval(1);
			session.update(rationcard);
			tx.commit();
		}
		
		status=StatusCode.Success;
		return status;
		
		}
		
		catch(Exception e)
		{
			status=StatusCode.UnknownError;
			return status;
		}
		
		finally
		{
			session.close();
		}
	}

}

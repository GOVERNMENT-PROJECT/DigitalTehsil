package biz;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import util.StatusCode;

public class User {

	public util.StatusCode signUp(model.User user) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		StatusCode status = StatusCode.UnknownError;
		try {
			session.save(user);
			tx.commit();
			status= StatusCode.Success;
			return status;
		}

		catch (Exception e) {
			tx.rollback();
			System.out.println(e.getMessage());
			return status;
		}

		finally {
			session.close();
			
		}

	}
	
	
	public util.StatusCode login(model.User user) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Query query=null;
		String hql =null;
		StatusCode status = StatusCode.UnknownError;
		try {
			
			
			if(user.getAadhaarNumber()!=null)
			{
				hql = "FROM User E WHERE E.aadhaarNumber = :userAadhaarNumber  AND E.password= :userPassword";
				query = session.createQuery(hql);
				query.setParameter("userAadhaarNumber", user.getAadhaarNumber());
			}
			
			else if(user.getEmailId()!=null)
			{
				hql = "FROM User E WHERE E.emailId = :userEmailId  AND E.password= :userPassword";
				query = session.createQuery(hql);
				query.setParameter("userEmailId", user.getEmailId());;
				
			}
			
			else
			{
				hql = "FROM User E WHERE E.mobile = :userMobile  AND E.password= :userPassword";
				 query = session.createQuery(hql);
				query.setParameter("userMobile", user.getAadhaarNumber());
				
			}
			
			query.setParameter("userPassword", user.getPassword());
			model.User u = (model.User)query.uniqueResult();
			session.getTransaction().commit();

		    if(u!=null)
		    {
		    	status= StatusCode.Success;
		    }
		    else
		    {
		    	status= StatusCode.Error;
		    }
			
			return status;
		}

		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			return status;
		}

		finally {
			session.close();
			
		}

	}
	
	public model.UserProfile getUserProfile(String id) 
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		model.UserProfile userprofile=new model.UserProfile();
		model.CertificateDetail c=new model.CertificateDetail();
		
		try {
			
			Query query=session.createQuery("FROM AadhaarDetail A WHERE A.AadhaarNumber=:id");
			query.setParameter("id", id);
			userprofile.setUser((model.User) query.uniqueResult());
			
			model.FamilyDetail f=null;
			query=session.createQuery("FROM FamilyDetail A WHERE A.FamilyMemberAadhaarNo=:id");
			query.setParameter("id", id);
			f=(model.FamilyDetail) query.uniqueResult();
			if(f!=null)
			{
				c.setCertificateNumber(f.getCertificateno());
				c.setTypeOfCertificate("RationCard");
				if(f.getApproval()==-1)
				{
					c.setApproval("NotApproved");
				}
				else
				  c.setApproval("Approved");
				
			}
			
			userprofile.getCerti().add(c);
			
			model.CasteCertificate p=null;
			query=session.createQuery("FROM CasteCertificate A WHERE A.aadharNo=:id");
			query.setParameter("id", id);
			p=(model.CasteCertificate) query.uniqueResult();
			if(f!=null)
			{
				c.setCertificateNumber(f.getCertificateno());
				c.setTypeOfCertificate("CasteCertificate");
				if(f.getApproval()==-1)
				{
					c.setApproval("NotApproved");
				}
				else
				  c.setApproval("Approved");
				
			}
			
			
			userprofile.getCerti().add(c);
			
			model.DomicileCertificate u=null;
			query=session.createQuery("FROM DomicileCertificate A WHERE A.aadharNo=:id");
			query.setParameter("id", id);
			u=(model.DomicileCertificate) query.uniqueResult();
			if(f!=null)
			{
				c.setCertificateNumber(f.getCertificateno());
				c.setTypeOfCertificate("DomicileCertificate");
				if(f.getApproval()==-1)
				{
					c.setApproval("NotApproved");
				}
				else
				  c.setApproval("Approved");
				
			}
			
			userprofile.getCerti().add(c);
			
			
			model.BirthCertificate b=null;
			query=session.createQuery("FROM BirthCertificate A WHERE A.aadharNo=:id");
			query.setParameter("id", id);
			b=(model.BirthCertificate) query.uniqueResult();
			if(f!=null)
			{
				c.setCertificateNumber(f.getCertificateno());
				c.setTypeOfCertificate("BirthCertificate");
				if(f.getApproval()==-1)
				{
					c.setApproval("NotApproved");
				}
				else
				  c.setApproval("Approved");
				
			}
			
			userprofile.getCerti().add(c);
			
			return userprofile;
			
		}

		catch (Exception e) {
			return userprofile;
		}

		finally {
			session.close();
			
		}

	}
}

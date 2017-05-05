package biz;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.exception.ConstraintViolationException;

import util.StatusCode;

public class User {

	public util.StatusCode signUp(model.User user) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		model.AadhaarDetail a=new model.AadhaarDetail();
		
		StatusCode status = StatusCode.UnknownError;
		try {
			String hql = "FROM AadhaarDetail E WHERE E.AadhaarNumber = :userAadhaarNumber  ";
			Query query = session.createQuery(hql);
			query.setParameter("userAadhaarNumber", user.getAadhaarNumber());
			a=(model.AadhaarDetail) query.uniqueResult();
			tx.commit();
			if(a==null)
			{
				return status;
			}
			else
			{
				try
				{
						tx = session.beginTransaction();
			            session.save(user);
			            tx.commit();
			            status= StatusCode.Success;
			            return status;
				}
				
				catch (Exception  e) 
				{
					tx.rollback();
					e.printStackTrace();
					status=StatusCode.Error;
					return status;
				}
				
				
			}
		}
		
		catch(Exception e)
		{
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
		//Transaction tx = session.beginTransaction();
		model.UserProfile userprofile=new model.UserProfile();
		ArrayList<model.CertificateDetail> cd=new ArrayList<model.CertificateDetail>();
		model.CertificateDetail c=new model.CertificateDetail();
		System.out.println("id="+id);
		
		try {
			Transaction tx = session.beginTransaction();
			Query query=session.createQuery("FROM AadhaarDetail A WHERE A.AadhaarNumber = :id");
			query.setParameter("id", id);
			userprofile.setUser((model.AadhaarDetail) query.uniqueResult());
			tx.commit();
			
			//System.out.println("111111111f="+userprofile.getUser().getAadhaarNumber());
			
			 tx = session.beginTransaction();
			model.FamilyDetail f=new model.FamilyDetail();
			f.setCertificateno(-1);
			query=session.createQuery("FROM FamilyDetail A WHERE A.aadhaarNo = :id");
			query.setParameter("id", id);
			f=(model.FamilyDetail) query.uniqueResult();
			if(f!=null)
			{
				System.out.println("f="+f.getAadhaarNo());
				c.setCertificateNumber(f.getCertificateno());
				c.setTypeOfCertificate("RationCard");
				if(f.getApproval()==-1)
				{
					c.setApproval("NotApproved");
				}
				else
				  c.setApproval("Approved");
				
				cd.add(c);
				//userprofile.certi.add(c);
			}
			tx.commit();
			
			
			model.CasteCertificate p=null;
			tx = session.beginTransaction();
			query=session.createQuery("FROM CasteCertificate A WHERE A.aadharNo = :id");
			query.setParameter("id", id);
			p=(model.CasteCertificate) query.uniqueResult();
			if(p!=null)
			{
				c.setCertificateNumber(p.getCertificateNo());
				c.setTypeOfCertificate("CasteCertificate");
				if(p.getApproval()==-1)
				{
					c.setApproval("NotApproved");
				}
				else
				  c.setApproval("Approved");
				
				cd.add(c);
				//userprofile.getCerti().add(c);
			}
			
			tx.commit();
			
			model.DomicileCertificate u=null;
			tx = session.beginTransaction();
			query=session.createQuery("FROM DomicileCertificate A WHERE A.aadhaarNo= :id");
			query.setParameter("id", id);
			u=(model.DomicileCertificate) query.uniqueResult();
			if(u!=null)
			{
				c.setCertificateNumber(u.getCertificateNo());
				c.setTypeOfCertificate("DomicileCertificate");
				if(u.getApproval()==-1)
				{
					c.setApproval("NotApproved");
				}
				else
				  c.setApproval("Approved");
				
				cd.add(c);
				//userprofile.getCerti().add(c);
			}
			
			tx.commit();
			
			
			model.BirthCertificate b=null;
			tx = session.beginTransaction();
			query=session.createQuery("FROM BirthCertificate A WHERE A.fathersName = :fathername AND A.name = :name");
			query.setParameter("fathername", userprofile.getUser().getFatherFirstName());
			query.setParameter("name", userprofile.getUser().getFirstName());
			b=(model.BirthCertificate) query.uniqueResult();
			if(b!=null)
			{
				c.setCertificateNumber(b.getCertificateNo());
				c.setTypeOfCertificate("BirthCertificate");
				if(b.getApproval()==-1)
				{
					c.setApproval("NotApproved");
				}
				else
				  c.setApproval("Approved");
				
				cd.add(c);
				//userprofile.getCerti().add(c);
			}
			
			tx.commit();
			
			userprofile.setCertificatedetails(cd);
			return userprofile;
			
		}

		catch (Exception e) {
			e.printStackTrace();
			return userprofile;
		}

		finally {
			session.close();
			
		}

	}
}

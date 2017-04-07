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
}

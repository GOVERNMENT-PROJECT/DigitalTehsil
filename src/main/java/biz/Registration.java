package biz;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Registration {

	public String newBornRegistration(model.NewBorn newuser)
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		
		try
		{		
		   session.save(newuser);
		   tx.commit();
		   return "1";
		}
		
		catch(Exception e)
		{
			tx.rollback();
			return e.getMessage();
		}
		
		finally
		{
			session.close();
		}

		
	}
	
	
	public String rationCardRegistration(ArrayList<model.FamilyDetail> rationcarddetail,String id)
	{
		
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx=null;
		
		try
		{
			for(model.FamilyDetail rationcard : rationcarddetail)
			{
				tx=session.beginTransaction();
				rationcard.setId(id);
				session.save(rationcard);
				tx.commit();
				
			}
		   return "1";
		}
		
		catch(Exception e)
		{
			tx.rollback();
			return e.getMessage();
		}
		
		finally
		{
			session.close();
		}

		
	}
}

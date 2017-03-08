package biz;

import org.hibernate.Session;

public class Registration {

	public String newBornRegistration(dal.NewBorn newuser)
	{
		try
		{
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		session.save(newuser);
		}
		
		catch(Exception e)
		{
			return e.getMessage();
		}
		
		//session.shutdown();
		return "1";
	}
}

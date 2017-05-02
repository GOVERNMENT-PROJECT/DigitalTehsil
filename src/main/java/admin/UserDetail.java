package admin;


import org.hibernate.Query;
import org.hibernate.Session;

import biz.HibernateUtil;

public class UserDetail {
	
	public model.AadhaarDetail getUserDetail(String id)
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		model.AadhaarDetail a=new model.AadhaarDetail();
		try
		{
			Query query=session.createQuery(" FROM AadhaarDetail A WHERE A.AadhaarNumber = :id");
			query.setParameter("id", id);
			a = (model.AadhaarDetail) query.uniqueResult();
			return a;
		}
		
		catch(Exception e)
		{
			return a;
		}
		
		finally
		{
			session.close();
		}
	}
	

}

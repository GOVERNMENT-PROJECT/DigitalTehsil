package biz;

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
		}

		finally {
			session.close();
			return status;
		}

	}
}

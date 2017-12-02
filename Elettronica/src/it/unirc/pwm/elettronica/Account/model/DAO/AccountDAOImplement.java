package it.unirc.pwm.elettronica.Account.model.DAO;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

import it.unirc.pwm.elettronica.Account.model.Account;
import it.unirc.pwm.elettronica.hibernate.util.HibernateUtil;


public class AccountDAOImplement implements AccountDAOInterface{

	private static Logger logger = LogManager.getLogger(AccountDAOImplement.class); 

	Session session = null;
	Transaction transaction = null;

	public boolean creaAccount(Account a) {
		session = HibernateUtil.getSessionFactory().openSession();
		boolean control=false;
		try {
			transaction=session.beginTransaction();
			session.save(a);
			logger.info("account inserito");
			control=true;
			transaction.commit();
		} catch (Exception e) {
			control=false;
			e.printStackTrace();
			System.out.println("errore dentro il creaAccount");
			transaction.rollback();
		} finally{
			session.close();
		}

		return control;

	}

	public boolean modificaAccount(Account a) {
		session = HibernateUtil.getSessionFactory().openSession();
		boolean control=false;
		try {
			transaction=session.beginTransaction();
			session.update(a);
			logger.info("Account modificato");
			control=true;
			transaction.commit();
			//			transaction= session.beginTransaction();
			//			Account res = (Account)session.createQuery( "from Account where idaccount=?" ).setParameter(0, a.getIdaccount()).uniqueResult();
			//			res.setUsername(a.getUsername());
			//			res.setPassword(a.getPassword());
			//			session.save(res);
			//			control=true;
			//			transaction.commit();
		} catch (Exception e2) {
			control=false;
			e2.printStackTrace();
			System.out.println("errore dentro il modificaAccount");
			transaction.rollback();
		} finally{
			session.close();
		}

		return control;
	}

	public Account cercaAccount(Account a) {
		session = HibernateUtil.getSessionFactory().openSession();
		Account res = null;
		try {
			transaction=session.beginTransaction();
			res = (Account)session.createQuery( "from Account where idaccount= :idaccount" ).setParameter("idaccount", a.getIdaccount()).uniqueResult();
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
			logger.error("errore nella ricerca dell'account");
		}finally{
			session.close();
		}

		return res;
	}

	public boolean eliminaAccount(Account a) {
		session = HibernateUtil.getSessionFactory().openSession();
		boolean control=false;
		try {
			transaction=session.beginTransaction();
			session.delete(a);
			logger.info("account cancellato");
			control=true;
			transaction.commit();
		} catch (Exception e) {
			control=false;
			e.printStackTrace();
			System.out.println("errore dentro l'eliminaAccount");
			transaction.rollback();
		} finally{
			session.close();
		}

		return control;

	}

	public Account esisteAccount(Account a) {
		session = HibernateUtil.getSessionFactory().openSession();
		Account res = null;
		try {
			transaction=session.beginTransaction();
			res = (Account)session.createQuery( "from Account where username= :username AND " +
					"password= :password").setParameter("username", a.getUsername()).setParameter("password",a.getPassword()).uniqueResult();
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("errore dentro l'esisteAccount");
			transaction.rollback();
		} finally{
			session.close();
		}

		return res;

	}



	public boolean esisteUsername(String username) {
		session = HibernateUtil.getSessionFactory().openSession();
		boolean control=false;
		try {
			transaction=session.beginTransaction();
			Account res = (Account)session.createQuery( "from Account where username= :username").setParameter("username", username).uniqueResult();
			if(res!=null)
				control=true;
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("errore dentro l'esisteAccount");
			transaction.rollback();
		} finally{
			session.close();
		}

		return control;

	}

}

package it.unirc.pwm.elettronica.Articolo.model.DAO;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

import it.unirc.pwm.elettronica.Articolo.model.Articolo;
import it.unirc.pwm.elettronica.hibernate.util.HibernateUtil;

public class ArticoloDAOImplement implements ArticoloDAOInterface{

	private static Logger logger = LogManager.getLogger(ArticoloDAOImplement.class); 
	
	Session session = null;
	Transaction transaction = null;
	
	public boolean creaArticolo(Articolo a) {
		session = HibernateUtil.getSessionFactory().openSession();
		boolean control=false;
		try {
			transaction=session.beginTransaction();
			session.save(a);
			logger.info("Articolo inserito");
			control=true;
			transaction.commit();
		} catch (Exception e) {
			control=false;
			e.printStackTrace();
			System.out.println("errore dentro il creaArticolo");
			transaction.rollback();
		} finally{
			session.close();
		}
		
		return control;
		
	}
	
	public boolean modificaArticolo(Articolo a) {
		session = HibernateUtil.getSessionFactory().openSession();
		boolean control=false;
		try {
			transaction=session.beginTransaction();
			session.update(a);
			logger.info("Articolo modificato");
			control=true;
			transaction.commit();
//			transaction= session.beginTransaction();
//			Articolo res = (Articolo)session.createQuery( "from Articolo where idarticolo=?" ).setParameter(0, a.getIdarticolo()).uniqueResult();
//			res.setNome(a.getNome());
//			res.setDescrizione(a.getDescrizione());
//			res.setNumeroPezzi(a.getNumeroPezzi());
//			res.setPrezzo(a.getPrezzo());
//			res.setAcquisti(a.getAcquisti());
//			session.save(res);
//			control=true;
//			transaction.commit();
		} catch (Exception e2) {
			control=false;
			e2.printStackTrace();
			System.out.println("errore dentro il modificaArticolo");
			transaction.rollback();
		} finally{
			session.close();
		}
		
		return control;
	}
	
	public Articolo cercaArticolo(Articolo a) {
		session = HibernateUtil.getSessionFactory().openSession();
		Articolo res = null;
		try {
			transaction=session.beginTransaction();
		    res = (Articolo)session.createQuery( "from Articolo where idarticolo= :idarticolo" ).setParameter("idarticolo", a.getIdarticolo()).uniqueResult();
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
			logger.error("errore nella ricerca dell'Articolo");
		}finally{
			session.close();
		}
		
		return res;
	}
	
	public boolean eliminaArticolo(Articolo a) {
		session = HibernateUtil.getSessionFactory().openSession();
		boolean control=false;
		try {
			transaction=session.beginTransaction();
			session.delete(a);
			logger.info("Articolo cancellato");
			control=true;
			transaction.commit();
		} catch (Exception e) {
			control=false;
			e.printStackTrace();
			System.out.println("errore dentro l'eliminaArticolo");
			transaction.rollback();
		} finally{
			session.close();
		}
		
		return control;
		
	}
	
	public boolean modificaNumeroPezzi(Articolo a) {
		session = HibernateUtil.getSessionFactory().openSession();
		boolean control=false;
		try {
			transaction= session.beginTransaction();
			Articolo res = (Articolo)session.createQuery( "from Articolo where idarticolo= :idarticolo" ).setParameter("idarticolo", a.getIdarticolo()).uniqueResult();
			res.setNumeroPezzi(a.getNumeroPezzi());
			session.save(res);
			control=true;
			transaction.commit();
		} catch (Exception e2) {
			control=false;
			e2.printStackTrace();
			System.out.println("errore dentro il modificaArticolo");
			transaction.rollback();
		} finally{
			session.close();
		}
		
		return control;
	}
	
}

package it.unirc.pwm.elettronica.Acquisto.model.DAO;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

import it.unirc.pwm.elettronica.Acquisto.model.Acquisto;
import it.unirc.pwm.elettronica.hibernate.util.HibernateUtil;

public class AcquistoDAOImplement implements AcquistoDAOInterface{

	private static Logger logger = LogManager.getLogger(AcquistoDAOImplement.class); 
	
	Session session = null;
	Transaction transaction = null;
	
	public boolean creaAcquisto(Acquisto a) {
		session = HibernateUtil.getSessionFactory().openSession();
		boolean control=false;
		try {
			transaction=session.beginTransaction();
			session.save(a);
			logger.info("Acquisto inserito");
			control=true;
			transaction.commit();
		} catch (Exception e) {
			control=false;
			e.printStackTrace();
			System.out.println("errore dentro il creaAcquisto");
			transaction.rollback();
		} finally{
			session.close();
		}
		
		return control;
		
	}
	
	public boolean modificaAcquisto(Acquisto a) {
		session = HibernateUtil.getSessionFactory().openSession();
		boolean control=false;
		try {
			transaction=session.beginTransaction();
			session.update(a);
			logger.info("Acquisto modificato");
			control=true;
			transaction.commit();
//			transaction= session.beginTransaction();
//			Acquisto res = (Acquisto)session.createQuery( "from Acquisto where idaccount=? and idarticolo=? and idricevuta=? and data=?" ).setParameter(0, a.getIda().getIdaccount()).setParameter(1, a.getIda().getIdarticolo()).setParameter(2, a.getIda().getIdricevuta()).setParameter(3, a.getIda().getData()).uniqueResult();
//			res.setArticolo(a.getArticolo());
//			res.setCliente(a.getCliente());
//			res.setRicevuta(a.getRicevuta());
//			res.setQuantita(a.getQuantita());
//			session.save(res);
//			control=true;
//			transaction.commit();
		} catch (Exception e2) {
			control=false;
			e2.printStackTrace();
			System.out.println("errore dentro il modificaAcquisto");
			transaction.rollback();
		} finally{
			session.close();
		}
		
		return control;
	}
	
	public Acquisto cercaAcquisto(Acquisto a) {
		session = HibernateUtil.getSessionFactory().openSession();
		Acquisto res = null;
		try {
			transaction=session.beginTransaction();
		    res = (Acquisto)session.createQuery( "from Acquisto where (idaccount= :idaccount) and (idarticolo= :idarticolo) and (idricevuta= :idricevuta) and (data= :data)" ).setParameter("idaccount", a.getIda().getIdaccount()).setParameter("idarticolo", a.getIda().getIdarticolo()).setParameter("idricevuta", a.getIda().getIdricevuta()).setParameter("data", a.getIda().getData()).uniqueResult();
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
			logger.error("errore nella ricerca dell'Acquisto");
		}finally{
			session.close();
		}
		
		return res;
	}
	
	public boolean eliminaAcquisto(Acquisto a) {
		session = HibernateUtil.getSessionFactory().openSession();
		boolean control=false;
		try {
			transaction=session.beginTransaction();
			session.delete(a);
			logger.info("Acquisto cancellato");
			control=true;
			transaction.commit();
		} catch (Exception e) {
			control=false;
			e.printStackTrace();
			System.out.println("errore dentro l'eliminaAcquisto");
			transaction.rollback();
		} finally{
			session.close();
		}
		
		return control;
		
	}
	
}

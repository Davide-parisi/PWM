package it.unirc.pwm.elettronica.Ricevuta.model.DAO;


import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

import it.unirc.pwm.elettronica.Acquisto.model.Acquisto;
import it.unirc.pwm.elettronica.Cliente.model.Cliente;
import it.unirc.pwm.elettronica.Ricevuta.model.Ricevuta;
import it.unirc.pwm.elettronica.hibernate.util.HibernateUtil;

public class RicevutaDAOImplement implements RicevutaDAOInterface{

	private static Logger logger = LogManager.getLogger(RicevutaDAOImplement.class); 
	
	Session session = null;
	Transaction transaction = null;
	
	public boolean creaRicevuta(Ricevuta r) {
		session = HibernateUtil.getSessionFactory().openSession();
		boolean control=false;
		try {
			transaction=session.beginTransaction();
			session.save(r);
			logger.info("Ricevuta inserita");
			control=true;
			transaction.commit();
		} catch (Exception e) {
			control=false;
			e.printStackTrace();
			System.out.println("errore dentro il creaRicevuta");
			transaction.rollback();
		} finally{
			session.close();
		}
		
		return control;
		
	}
	
	public boolean modificaRicevuta(Ricevuta r) {
		session = HibernateUtil.getSessionFactory().openSession();
		boolean control=false;
		try {
			transaction=session.beginTransaction();
			session.update(r);
			logger.info("Ricevuta modificata");
			control=true;
			transaction.commit();
//			transaction= session.beginTransaction();
//			Ricevuta res = (Ricevuta)session.createQuery( "from Ricevuta where (idricevuta=?) and (data=?)" ).setParameter(0, r.getIdr().getIdricevuta()).setParameter(1, r.getIdr().getData()).uniqueResult();
//			res.setImporto(r.getImporto());
//			session.save(res);
//			control=true;
//			transaction.commit();
		} catch (Exception e2) {
			control=false;
			e2.printStackTrace();
			System.out.println("errore dentro il modificaRicevuta");
			transaction.rollback();
		} finally{
			session.close();
		}
		
		return control;
	}
	
	public Ricevuta cercaRicevuta(Ricevuta r) {
		session = HibernateUtil.getSessionFactory().openSession();
		Ricevuta res = null;
		try {
			transaction=session.beginTransaction();
		     res = (Ricevuta)session.createQuery( "from Ricevuta where idricevuta= :idricevuta" ).setParameter("idricevuta", r.getIdr().getIdricevuta()).uniqueResult();
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
			logger.error("errore nella ricerca della Ricevuta");
		}finally{
			session.close();
		}
		
		return res;
	}
	
	public boolean eliminaRicevuta(Ricevuta r) {
		session = HibernateUtil.getSessionFactory().openSession();
		boolean control=false;
		try {
			transaction=session.beginTransaction();
			session.delete(r);
			logger.info("Ricevuta cancellata");
			control=true;
			transaction.commit();
		} catch (Exception e) {
			control=false;
			e.printStackTrace();
			System.out.println("errore dentro l'eliminaRicevuta");
			transaction.rollback();
		} finally{
			session.close();
		}
		
		return control;
		
	}
	
	@SuppressWarnings("unchecked")
	public List<Ricevuta> cercaRicevute(){
		session = HibernateUtil.getSessionFactory().openSession();
		List<Ricevuta> res = null;
		try {
			transaction=session.beginTransaction();
		    res = (List<Ricevuta>)session.createQuery("from Ricevuta").list();
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
			logger.error("errore nella ricerca delle Ricevute");
		}finally{
			session.close();
		}
		
		return res;
	}
	
	@SuppressWarnings("unchecked")
	public List<Acquisto> getAcquisti(Cliente c){
		session = HibernateUtil.getSessionFactory().openSession();
		List<Acquisto> res = null;
		try {
			transaction=session.beginTransaction();
		    res = (List<Acquisto>)session.createQuery( "from Acquisto where idaccount= :idaccount" ).setParameter(0, c.getIdaccount()).list();
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
			logger.error("errore nella ricerca degli Acquisti");
		}finally{
			session.close();
		}
		
		return res;
	}
	
//	@SuppressWarnings("unchecked")
//	public List<Articolo> articoliRedditizi(){
//		session = HibernateUtil.getSessionFactory().openSession();
//		List<Articolo> res = null;
//		try {
//			transaction=session.beginTransaction();
//		    res = (List<Articolo>)session.createQuery( "from Ricevuta where max count idarticolo" );
//			transaction.commit();
//		} catch (Exception e) {
//			transaction.rollback();
//			e.printStackTrace();
//			logger.error("errore nella ricerca degli Acquisti");
//		}finally{
//			session.close();
//		}
//		
//		return res;
//	}
//	
//	@SuppressWarnings("unchecked")
//	public List<Ricevuta> RicevuteMax(){
//		session = HibernateUtil.getSessionFactory().openSession();
//		List<Ricevuta> res = null;
//		try {
//			transaction=session.beginTransaction();
//		    res = (List<Ricevuta>)session.createQuery( "from Ricevuta where (MAX)importo" );
//			transaction.commit();
//		} catch (Exception e) {
//			transaction.rollback();
//			e.printStackTrace();
//			logger.error("errore nella ricerca degli Acquisti");
//		}finally{
//			session.close();
//		}
//		
//		return res;
//	}

	
}

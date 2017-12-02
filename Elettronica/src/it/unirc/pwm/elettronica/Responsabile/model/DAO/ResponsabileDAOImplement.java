package it.unirc.pwm.elettronica.Responsabile.model.DAO;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

import it.unirc.pwm.elettronica.Responsabile.model.Responsabile;
import it.unirc.pwm.elettronica.hibernate.util.HibernateUtil;

public class ResponsabileDAOImplement implements ResponsabileDAOInterface{

	private static Logger logger = LogManager.getLogger(ResponsabileDAOImplement.class); 
	
	Session session = null;
	Transaction transaction = null;
	
	public boolean creaResponsabile(Responsabile r) {
		session = HibernateUtil.getSessionFactory().openSession();
		boolean control=false;
		try {
			transaction=session.beginTransaction();
			session.save(r);
			logger.info("Responsabile inserito");
			control=true;
			transaction.commit();
		} catch (Exception e) {
			control=false;
			e.printStackTrace();
			System.out.println("errore dentro il creaResponsabile");
			transaction.rollback();
		} finally{
			session.close();
		}
		
		return control;
		
	}
	
	public boolean modificaResponsabile(Responsabile r) {
		session = HibernateUtil.getSessionFactory().openSession();
		boolean control=false;
		try {
			transaction=session.beginTransaction();
			session.update(r);
			logger.info("Responsabile modificato");
			control=true;
			transaction.commit();
//			transaction= session.beginTransaction();
//			Responsabile res = (Responsabile)session.createQuery( "from Responsabile where idaccount=?" ).setParameter(0, r.getIdaccount()).uniqueResult();
//			res.setCodiceF(r.getCodiceF());
//			res.setNome(r.getNome());
//			res.setCognome(r.getCognome());
//			res.setDataNascita(r.getDataNascita());
//			res.setEmail(r.getEmail());
//			res.setTelefono(r.getTelefono());
//			res.setOrdini(r.getOrdini());
//			session.save(res);
//			control=true;
//			transaction.commit();
		} catch (Exception e2) {
			control=false;
			e2.printStackTrace();
			System.out.println("errore dentro il modificaResponsabile");
			transaction.rollback();
		} finally{
			session.close();
		}
		
		return control;
	}
	
	public Responsabile cercaResponsabile(Responsabile r) {
		session = HibernateUtil.getSessionFactory().openSession();
		Responsabile res = null;
		try {
			transaction=session.beginTransaction();
		    res = (Responsabile)session.createQuery( "from Responsabile where idaccount= :idaccount" ).setParameter( "idaccount", r.getIdaccount()).uniqueResult();
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
			logger.error("errore nella ricerca del Responsabile");
		}finally{
			session.close();
		}
		
		return res;
	}
	
}

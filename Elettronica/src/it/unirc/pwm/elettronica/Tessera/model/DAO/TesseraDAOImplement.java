package it.unirc.pwm.elettronica.Tessera.model.DAO;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

import it.unirc.pwm.elettronica.Cliente.model.Cliente;
import it.unirc.pwm.elettronica.Tessera.model.Tessera;
import it.unirc.pwm.elettronica.hibernate.util.HibernateUtil;

public class TesseraDAOImplement implements TesseraDAOInterface{

	private static Logger logger = LogManager.getLogger(TesseraDAOImplement.class); 
	
	Session session = null;
	Transaction transaction = null;
	
	public boolean creaTessera(Tessera t) {
		session = HibernateUtil.getSessionFactory().openSession();
		boolean control=false;
		try {
			transaction=session.beginTransaction();
			session.save(t);
			logger.info("Tessera inserita");
			control=true;
			transaction.commit();
		} catch (Exception e) {
			control=false;
			e.printStackTrace();
			System.out.println("errore dentro il creaTessera");
			transaction.rollback();
		} finally{
			session.close();
		}
		
		return control;
		
	}
	
	public boolean modificaTessera(Tessera t) {
		session = HibernateUtil.getSessionFactory().openSession();
		boolean control=false;
		try {
			transaction=session.beginTransaction();
			session.update(t);
			logger.info("Tessera modificata");
			control=true;
			transaction.commit();
//			transaction= session.beginTransaction();
//			Tessera res = (Tessera)session.createQuery( "from Tessera where idtessera=?" ).setParameter(0, t.getIdtessera()).uniqueResult();
//			res.setValidita(t.getValidita());
//			res.setTotalePunti(t.getTotalePunti());
//			res.setProprietario(t.getProprietario());
//			session.save(res);
//			control=true;
//			transaction.commit();
		} catch (Exception e2) {
			control=false;
			e2.printStackTrace();
			System.out.println("errore dentro il modificaTessera");
			transaction.rollback();
		} finally{
			session.close();
		}
		
		return control;
	}
	
	public Tessera cercaTessera(Tessera t) {
		session = HibernateUtil.getSessionFactory().openSession();
		Tessera res = null;
		try {
			transaction=session.beginTransaction();
		    res = (Tessera)session.createQuery( "from Tessera where idtessera= :idtessera" ).setParameter("idtessera", t.getIdtessera()).uniqueResult();
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
			logger.error("errore nella ricerca della Tessera");
		}finally{
			session.close();
		}
		
		return res;
	}
	
	public boolean eliminaTessera(Tessera t) {
		session = HibernateUtil.getSessionFactory().openSession();
		boolean control=false;
		try {
			transaction=session.beginTransaction();
			session.delete(t);
			logger.info("Tessera cancellata");
			control=true;
			transaction.commit();
		} catch (Exception e) {
			control=false;
			e.printStackTrace();
			System.out.println("errore dentro l'eliminaTessera");
			transaction.rollback();
		} finally{
			session.close();
		}
		
		return control;
		
	}
	
	public Tessera getTesseraCliente(Cliente c) {
		session = HibernateUtil.getSessionFactory().openSession();
		Tessera res = null;
		try {
			transaction=session.beginTransaction();
		    res = (Tessera)session.createQuery( "from Tessera where idtessera= :idtessera" ).setParameter("idtessera", c.getIdaccount()).uniqueResult();
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
			logger.error("errore nella ricerca della TesseraCliente");
		}finally{
			session.close();
		}
		
		return res;
	}

	public boolean modificaPunti(Tessera t) {
		session = HibernateUtil.getSessionFactory().openSession();
		boolean control=false;
		try {
			transaction= session.beginTransaction();
			Tessera res = (Tessera)session.createQuery( "from Tessera where idtessera= :idtessera" ).setParameter("idtessera", t.getIdtessera()).uniqueResult();
			res.setTotalePunti(t.getTotalePunti());
			session.save(res);
			control=true;
			transaction.commit();
		} catch (Exception e2) {
			control=false;
			e2.printStackTrace();
			System.out.println("errore dentro il modificaTessera");
			transaction.rollback();
		} finally{
			session.close();
		}
		
		return control;
	}
	
//	@SuppressWarnings("unchecked")
//	public List<Cliente> clientiMigliori(){
//		session = HibernateUtil.getSessionFactory().openSession();
//		List<Cliente> res = null;
//		try {
//			transaction=session.beginTransaction();
//		    res = (List<Cliente>)session.createQuery( "from Tessera where max totalePunti" );
//			transaction.commit();
//		} catch (Exception e) {
//			transaction.rollback();
//			e.printStackTrace();
//			logger.error("errore nella ricerca dei ClientiMigliori");
//		}finally{
//			session.close();
//		}
//		
//		return res;
//		
//	}


	
}

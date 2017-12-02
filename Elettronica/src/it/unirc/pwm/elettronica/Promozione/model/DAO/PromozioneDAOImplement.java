package it.unirc.pwm.elettronica.Promozione.model.DAO;


import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

import it.unirc.pwm.elettronica.Promozione.model.Promozione;
import it.unirc.pwm.elettronica.Tessera.model.Tessera;
import it.unirc.pwm.elettronica.hibernate.util.HibernateUtil;

public class PromozioneDAOImplement implements PromozioneDAOInterface{

	private static Logger logger = LogManager.getLogger(PromozioneDAOImplement.class); 
	
	Session session = null;
	Transaction transaction = null;
	
	public boolean creaPromozione(Promozione p) {
		session = HibernateUtil.getSessionFactory().openSession();
		boolean control=false;
		try {
			transaction=session.beginTransaction();
			session.save(p);
			logger.info("Promozione inserita");
			control=true;
			transaction.commit();
		} catch (Exception e) {
			control=false;
			e.printStackTrace();
			System.out.println("errore dentro il creaPromozione");
			transaction.rollback();
		} finally{
			session.close();
		}
		
		return control;
		
	}
	
	public boolean modificaPromozione(Promozione p) {
		session = HibernateUtil.getSessionFactory().openSession();
		boolean control=false;
		try {
			transaction=session.beginTransaction();
			session.update(p);
			logger.info("Promozionde modificata");
			control=true;
			transaction.commit();
//			transaction= session.beginTransaction();
//			Promozione res = (Promozione)session.createQuery( "from Promozione where idpromozione=?" ).setParameter(0, p.getIdpromozione()).uniqueResult();
//			res.setDescrizione(p.getDescrizione());
//			res.setPuntiTessera(p.getPuntiTessera());
//			res.setClienti(p.getClienti());
//			session.save(res);
//			control=true;
//			transaction.commit();
		} catch (Exception e2) {
			control=false;
			e2.printStackTrace();
			System.out.println("errore dentro il modificaPromozione");
			transaction.rollback();
		} finally{
			session.close();
		}
		
		return control;
	}
	
	public Promozione cercaPromozione(Promozione p) {
		session = HibernateUtil.getSessionFactory().openSession();
		Promozione res = null;
		try {
			transaction=session.beginTransaction();
		    res = (Promozione)session.createQuery( "from Promozione where idpromozione= :idpromozione" ).setParameter("idpromozione", p.getIdpromozione()).uniqueResult();
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
			logger.error("errore nella ricerca della Promozione");
		}finally{
			session.close();
		}
		
		return res;
	}
	
	public boolean eliminaPromozione(Promozione p) {
		session = HibernateUtil.getSessionFactory().openSession();
		boolean control=false;
		try {
			transaction=session.beginTransaction();
			session.delete(p);
			logger.info("Promozione cancellata");
			control=true;
			transaction.commit();
		} catch (Exception e) {
			control=false;
			e.printStackTrace();
			System.out.println("errore dentro l'eliminaPromozione");
			transaction.rollback();
		} finally{
			session.close();
		}
		
		return control;
		
	}
	
	@SuppressWarnings("unchecked")
	public List<Promozione> cercaPromozioni(){
		session = HibernateUtil.getSessionFactory().openSession();
		List<Promozione> res = null;
		try {
			transaction=session.beginTransaction();
		    res = (List<Promozione>)session.createQuery("from Promozione").list();
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
			logger.error("errore nella ricerca delle Promozioni");
		}finally{
			session.close();
		}
		
		return res;
	}
	
	@SuppressWarnings("unchecked")
	public List<Promozione> getPromozioniCliente(Tessera t){
		session = HibernateUtil.getSessionFactory().openSession();
		List<Promozione> res = null;
		try {
			transaction=session.beginTransaction();
		    res = (List<Promozione>)session.createQuery( "from Promozione where puntiTessera<= :puntiTessera" ).setParameter("puntiTessera", t.getTotalePunti()).list();
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
			logger.error("errore nella ricerca delle PromozioniCliente");
		}finally{
			session.close();
		}
		
		return res;
	}
	
}

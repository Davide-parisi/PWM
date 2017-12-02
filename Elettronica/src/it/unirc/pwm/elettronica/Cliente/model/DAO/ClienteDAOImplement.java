package it.unirc.pwm.elettronica.Cliente.model.DAO;


import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.Query;

import it.unirc.pwm.elettronica.Cliente.model.Cliente;
import it.unirc.pwm.elettronica.hibernate.util.HibernateUtil;

public class ClienteDAOImplement implements ClienteDAOInterface{

	private static Logger logger = LogManager.getLogger(ClienteDAOImplement.class); 
	
	Session session = null;
	Transaction transaction = null;
	
	public boolean creaCliente(Cliente c) {
		session = HibernateUtil.getSessionFactory().openSession();
		boolean control=false;
		try {
			transaction=session.beginTransaction();
			session.save(c);
			logger.info("Cliente inserito");
			control=true;
			transaction.commit();
		} catch (Exception e) {
			control=false;
			e.printStackTrace();
			System.out.println("errore dentro il creaCliente");
			transaction.rollback();
		} finally{
			session.close();
		}
		
		return control;
		
	}
	
	public boolean modificaCliente(Cliente c) {
		session = HibernateUtil.getSessionFactory().openSession();
		boolean control=false;
		try {
			transaction=session.beginTransaction();
			session.update(c);
			logger.info("Cliente modificato");
			control=true;
			transaction.commit();
//			transaction= session.beginTransaction();
//			Cliente res = (Cliente)session.createQuery( "from Cliente where idaccount=?" ).setParameter(0, c.getIdaccount()).uniqueResult();
//			res.setCodiceF(c.getCodiceF());
//			res.setNome(c.getNome());
//			res.setCognome(c.getCognome());
//			res.setDataNascita(c.getDataNascita());
//			res.setEmail(c.getEmail());
//			res.setTelefono(c.getTelefono());
//			res.setIndirizzo(c.getIndirizzo());
//			res.setAcquisti(c.getAcquisti());
//			res.setPromozioni(c.getPromozioni());
//			res.setAbilitato(c.getAbilitato());
//			session.save(res);
//			control=true;
//			transaction.commit();
		} catch (Exception e2) {
			control=false;
			e2.printStackTrace();
			System.out.println("errore dentro il modificaCliente");
			transaction.rollback();
		} finally{
			session.close();
		}
		
		return control;
	}
	
	public Cliente cercaCliente(Cliente c) {
		session = HibernateUtil.getSessionFactory().openSession();
		Cliente res = null;
		try {
			transaction=session.beginTransaction();
		    res = (Cliente)session.createQuery( "from Cliente where idaccount= :idaccount" ).setParameter("idaccount", c.getIdaccount()).uniqueResult();
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
			logger.error("errore nella ricerca dell'Cliente");
		}finally{
			session.close();
		}
		
		return res;
	}
	
	public boolean eliminaCliente(Cliente c) {
		session = HibernateUtil.getSessionFactory().openSession();
		boolean control=false;
		try {
			transaction=session.beginTransaction();
		    Cliente res = (Cliente)session.createQuery( "from Cliente where idaccount= :idaccount" ).setParameter("idaccount", c.getIdaccount()).uniqueResult();
			res.setAbilitato(0);
			session.save(res);
		    logger.info("Cliente cancellato");
			control=true;
			transaction.commit();
		} catch (Exception e) {
			control=false;
			e.printStackTrace();
			System.out.println("errore dentro l'eliminaCliente");
			transaction.rollback();
		} finally{
			session.close();
		}
		
		return control;
		
	}
	
	@SuppressWarnings("unchecked")
	public List<Cliente> cercaClienti(){
		session = HibernateUtil.getSessionFactory().openSession();
		List<Cliente> res = null;
		try {
			transaction=session.beginTransaction();
		    res = (List<Cliente>)session.createQuery("from Cliente").list();
//		    for(Cliente cl:res) {
//				if(cl.getAbilitato()==0)
//					res.remove(index);
//			}
		    transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
			logger.error("errore nella ricerca dei Clienti");
		}finally{
			session.close();
		}
		
		return res;
	}
	
	public Cliente verificaLogin(Cliente c)
	{
		Cliente trovato =null;
		session = HibernateUtil.getSessionFactory().openSession();
		try {
			String hql = "from Cliente c "
					   + "where  "
					   + "c.username ='"+c.getUsername()+"' and "
					   + "c.password ='"+c.getPassword()+"'";
			Query query = session.createQuery(hql);
			if(query.list().size()>0)
			{
				trovato = (Cliente) query.list().get(0);
				logger.info("cliente trovato");
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("cliente non trovato");
		}finally{
			if(session.isOpen())
			session.close();
		}
		
		return trovato;

	}

	
	
}

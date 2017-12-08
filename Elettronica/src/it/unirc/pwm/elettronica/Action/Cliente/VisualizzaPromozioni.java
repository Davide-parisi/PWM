package it.unirc.pwm.elettronica.Action.Cliente;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import it.unirc.pwm.elettronica.Cliente.model.Cliente;
import it.unirc.pwm.elettronica.Cliente.model.DAO.ClienteDAOFactory;
import it.unirc.pwm.elettronica.Cliente.model.DAO.ClienteDAOInterface;
import it.unirc.pwm.elettronica.Promozione.model.Promozione;
import it.unirc.pwm.elettronica.Promozione.model.DAO.PromozioneDAOFactory;
import it.unirc.pwm.elettronica.Promozione.model.DAO.PromozioneDAOInterface;
import it.unirc.pwm.elettronica.Tessera.model.Tessera;
import it.unirc.pwm.elettronica.Tessera.model.DAO.TesseraDAOFactory;
import it.unirc.pwm.elettronica.Tessera.model.DAO.TesseraDAOInterface;

public class VisualizzaPromozioni extends ActionSupport implements SessionAware{

	private static final long serialVersionUID = 1L;
	private Map<String,Object> session;
	private List<Promozione> promozioni=null;
	private PromozioneDAOInterface pdao=PromozioneDAOFactory.getDAO();
	private TesseraDAOInterface tdao=TesseraDAOFactory.getDAO();

	public List<Promozione> getPromozioni() {
		return promozioni;
	}



	public void setPromozioni(List<Promozione> promozioni) {
		this.promozioni = promozioni;
	}



	public Map<String, Object> getSession() {
		return session;
	}



	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


	public String execute() throws Exception{
		Cliente c=(Cliente)session.get("cliente");
		Tessera t=tdao.getTesseraCliente(c);
		promozioni=pdao.getPromozioniCliente(t);
		if(promozioni.size()==0)
			addActionMessage("NON HAI OTTENUTO PROMOZIONI");
		return SUCCESS;

	}
	
}

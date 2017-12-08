package it.unirc.pwm.elettronica.Action.Cliente;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import it.unirc.pwm.elettronica.Cliente.model.Cliente;
import it.unirc.pwm.elettronica.Cliente.model.DAO.ClienteDAOFactory;
import it.unirc.pwm.elettronica.Cliente.model.DAO.ClienteDAOInterface;
import it.unirc.pwm.elettronica.Tessera.model.Tessera;
import it.unirc.pwm.elettronica.Tessera.model.DAO.TesseraDAOFactory;
import it.unirc.pwm.elettronica.Tessera.model.DAO.TesseraDAOInterface;

public class VisualizzaTessera extends ActionSupport implements SessionAware,ModelDriven<Tessera>{

	private static final long serialVersionUID = 1L;
	private Map<String,Object> session;
	private Tessera tessera=new Tessera();
	private TesseraDAOInterface tdao=TesseraDAOFactory.getDAO();


	public Tessera getModel() {

		return tessera;

	}



	public Tessera getTessera() {
		return tessera;
	}



	public void setTessera(Tessera tessera) {
		this.tessera = tessera;
	}



	public Map<String, Object> getSession() {
		return session;
	}



	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


	public String execute() throws Exception{
		Cliente c=(Cliente)session.get("cliente");
		tessera=tdao.getTesseraCliente(c);
		return SUCCESS;

	}
	
}

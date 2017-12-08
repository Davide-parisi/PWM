package it.unirc.pwm.elettronica.Action.Cliente;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import it.unirc.pwm.elettronica.Cliente.model.Cliente;
import it.unirc.pwm.elettronica.Cliente.model.DAO.ClienteDAOFactory;
import it.unirc.pwm.elettronica.Cliente.model.DAO.ClienteDAOInterface;

public class ModificaCliente extends ActionSupport implements Preparable,SessionAware,ModelDriven<Cliente>{

	private static final long serialVersionUID = 1L;
	private Map<String,Object> session;
	private Cliente cliente=new Cliente();
	private ClienteDAOInterface cdao=ClienteDAOFactory.getDAO();


	public Cliente getModel() {

		return cliente;

	}



	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



	public Map<String, Object> getSession() {
		return session;
	}



	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


	public void prepare() throws Exception {
		try {
			setCliente((Cliente)session.get("cliente"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public String execute() throws Exception{

		return SUCCESS;

	}
	
	public String modifica() {
		cliente.setEmail(getModel().getEmail());
		cliente.setTelefono(getModel().getTelefono());
		//		a=adao.esisteAccount(a);
		//		System.out.println(a.toString());
		//		System.out.println(a.getIdaccount());
		//		c.setIdaccount(a.getIdaccount());
		cdao.modificaCliente(cliente);
		addActionMessage("Modifica avvenuta con successo");
		return SUCCESS;
	}
	
	public String elimina() {
		System.out.println(cliente.toString());
		if(cdao.eliminaCliente(cliente)){
		addActionMessage("Account eliminato");
		session.remove("cliente");
		return SUCCESS;}
		else {
			return INPUT;
		}
		
	}
	
}

package it.unirc.pwm.elettronica.Action.Account;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.elettronica.Cliente.model.Cliente;
import it.unirc.pwm.elettronica.Cliente.model.DAO.ClienteDAOFactory;
import it.unirc.pwm.elettronica.Cliente.model.DAO.ClienteDAOInterface;


public class Register extends ActionSupport{

	private static final long serialVersionUID = 1L;
	private Cliente cliente;
	private ClienteDAOInterface cdao=ClienteDAOFactory.getDAO();
	
	public Cliente getCliente(){
		return cliente;
	}public void setCliente (Cliente cliente) {
		this.cliente = cliente;
	}

	public String execute() throws Exception{
		
		if(cdao.creaCliente(cliente)) {
		addActionMessage("Registrazione avvenuta con successo");
		return SUCCESS;
		}
		else {
			return INPUT;
		}
	}
}

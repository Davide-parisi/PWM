package it.unirc.pwm.elettronica.Action.Cliente;

import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.elettronica.Cliente.model.Cliente;
import it.unirc.pwm.elettronica.Cliente.model.DAO.ClienteDAOFactory;
import it.unirc.pwm.elettronica.Cliente.model.DAO.ClienteDAOInterface;


public class EliminaCliente extends ActionSupport{

	private static final long serialVersionUID = 1L;
	private Map<String,Object> session;
	private Cliente cliente;
	private ClienteDAOInterface cdao=ClienteDAOFactory.getDAO();
	
	public Cliente getCliente(){
		return (Cliente) session.get("cliente");
	}public void setCliente (Cliente cliente) {
		this.cliente = cliente;
	}

	public String execute() throws Exception{
		cdao.eliminaCliente(getCliente());
		session.remove("cliente");
		return SUCCESS;

	}

	public void setSession(Map<String, Object> session) {
		this.session = session;		
	}
	
}

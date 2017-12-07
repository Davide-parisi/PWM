package it.unirc.pwm.elettronica.Action.Cliente;

import java.util.Date;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import it.unirc.pwm.elettronica.Account.model.Account;
import it.unirc.pwm.elettronica.Account.model.DAO.AccountDAOFactory;
import it.unirc.pwm.elettronica.Account.model.DAO.AccountDAOInterface;
import it.unirc.pwm.elettronica.Cliente.model.Cliente;
import it.unirc.pwm.elettronica.Cliente.model.DAO.ClienteDAOFactory;
import it.unirc.pwm.elettronica.Cliente.model.DAO.ClienteDAOInterface;
import it.unirc.pwm.elettronica.Responsabile.model.Responsabile;


public class ModificaCliente extends ActionSupport implements ModelDriven<Cliente>{

	private static final long serialVersionUID = 1L;
	private Map<String,Object> session;
	private Cliente cliente=new Cliente();

	private ClienteDAOInterface cdao=ClienteDAOFactory.getDAO();
	private AccountDAOInterface adao=AccountDAOFactory.getDAO();


	public Cliente getModel() {

		return cliente;

	}

	public String execute() throws Exception{
		Account a = new Account();
		a.setUsername(getModel().getUsername());
		a=adao.esisteAccount(a);
		System.out.println(a.toString());
//		a=adao.esisteAccount(a);
//		System.out.println(a.toString());
//		System.out.println(a.getIdaccount());
		Cliente c=getModel();
//		c.setIdaccount(a.getIdaccount());
		System.out.println(c.getIdaccount());
		if(cdao.modificaCliente(getModel())) {
			addActionMessage("Modifica avvenuta con successo");
			return SUCCESS;
		}
		else return INPUT;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;		
	}

}

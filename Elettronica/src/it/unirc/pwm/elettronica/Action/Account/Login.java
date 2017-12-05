package it.unirc.pwm.elettronica.Action.Account;

import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;


import it.unirc.pwm.elettronica.Responsabile.model.Responsabile;
import it.unirc.pwm.elettronica.Responsabile.model.DAO.ResponsabileDAOFactory;
import it.unirc.pwm.elettronica.Responsabile.model.DAO.ResponsabileDAOInterface;
import it.unirc.pwm.elettronica.Account.model.Account;
import it.unirc.pwm.elettronica.Account.model.DAO.AccountDAOInterface;
import it.unirc.pwm.elettronica.Account.model.DAO.AccountDAOFactory;
import it.unirc.pwm.elettronica.Cliente.model.Cliente;
import it.unirc.pwm.elettronica.Cliente.model.DAO.ClienteDAOInterface;
import it.unirc.pwm.elettronica.Cliente.model.DAO.ClienteDAOFactory;

public class Login extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	private Map<String,Object> session; 

	private AccountDAOInterface adao= AccountDAOFactory.getDAO();
	private ResponsabileDAOInterface rdao= ResponsabileDAOFactory.getDAO();
	private ClienteDAOInterface cdao= ClienteDAOFactory.getDAO();

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String execute(){


		Account a = new Account();
		a.setUsername(getUsername());
		a.setPassword(getPassword());
		a=adao.esisteAccount(a);
		
		if(a==null)
			return INPUT;

		Responsabile r=new Responsabile();
		r.setIdaccount(a.getIdaccount());
		Cliente c=new Cliente();
		c.setIdaccount(a.getIdaccount());
		r=rdao.cercaResponsabile(r);
		c=cdao.cercaCliente(c);
		
		if(c!=null) {
			session.put("cliente", c);
			return "successCliente";
		}
			session.put("responsabile", r);
			return "successResponsabile";

		}
	

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}

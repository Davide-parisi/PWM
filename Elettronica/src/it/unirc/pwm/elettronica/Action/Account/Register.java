package it.unirc.pwm.elettronica.Action.Account;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.elettronica.Cliente.model.Cliente;
import it.unirc.pwm.elettronica.Cliente.model.DAO.ClienteDAOFactory;
import it.unirc.pwm.elettronica.Cliente.model.DAO.ClienteDAOInterface;
import it.unirc.pwm.elettronica.Tessera.model.Tessera;
import it.unirc.pwm.elettronica.Tessera.model.DAO.TesseraDAOFactory;
import it.unirc.pwm.elettronica.Tessera.model.DAO.TesseraDAOInterface;


public class Register extends ActionSupport{

	private static final long serialVersionUID = 1L;
	private Cliente cliente;
	private ClienteDAOInterface cdao=ClienteDAOFactory.getDAO();
	private Tessera tessera=new Tessera();
	private TesseraDAOInterface tdao=TesseraDAOFactory.getDAO();

	public Cliente getCliente(){
		return cliente;
	}public void setCliente (Cliente cliente) {
		this.cliente = cliente;
	}

	public Tessera getTessera() {
		return tessera;
	}
	public void setTessera(Tessera tessera) {
		this.tessera = tessera;
	}
	@SuppressWarnings("deprecation")
	public String execute() throws Exception{

		if(cdao.creaCliente(cliente)) {
			
			tessera.setProprietario(cliente);
			tessera.setTotalePunti(0);
			
			GregorianCalendar gc=new GregorianCalendar();
			Integer anno = gc.get(Calendar.YEAR) + 1;
			Integer mese = gc.get(Calendar.MONTH) + 1;
			String validita=gc.get(Calendar.DAY_OF_MONTH)+"/"+mese.toString()+"/"+anno.toString();
			tessera.setValidita(new Date(validita));
			
			tdao.creaTessera(tessera);

			addActionMessage("Registrazione avvenuta con successo");
			return SUCCESS;
		}
		else {
			return INPUT;
		}
	}
}

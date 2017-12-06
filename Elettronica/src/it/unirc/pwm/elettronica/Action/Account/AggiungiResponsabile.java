package it.unirc.pwm.elettronica.Action.Account;



import com.opensymphony.xwork2.ActionSupport;

import com.opensymphony.xwork2.ModelDriven;



import it.unirc.pwm.elettronica.Responsabile.model.Responsabile;

import it.unirc.pwm.elettronica.Responsabile.model.DAO.ResponsabileDAOFactory;

import it.unirc.pwm.elettronica.Responsabile.model.DAO.ResponsabileDAOInterface;



public class AggiungiResponsabile extends ActionSupport implements ModelDriven<Responsabile>{



	private static final long serialVersionUID = 1L;

	private Responsabile responsabile= new Responsabile();

	private ResponsabileDAOInterface rdao=ResponsabileDAOFactory.getDAO();

	

	public Responsabile getModel() {

		return responsabile;

	}	

	

	public Responsabile getResponsabile(){

		return responsabile;

	}

	

	public void setResponsabile (Responsabile responsabile) {

		this.responsabile = responsabile;

	}



	public String execute() throws Exception{

		

		rdao.creaResponsabile(getModel());

		return SUCCESS;

	}

	

	public void validate(){

		if( getModel().getPassword().length()==0){

			this.addFieldError("password", "Password is required.");

		}

		

		if(getModel().getPassword().length()<6){

			this.addFieldError("password", "Password must be longer than 6 chars.");

		}

		

		if(getModel().getNome().length()==0){

			this.addFieldError("name", "Real name is required.");

		}

		

		if(getModel().getUsername().length()==0){

			this.addFieldError("username", "Username is required.");

		}	

	}

	

}
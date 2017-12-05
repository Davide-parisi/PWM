package it.unirc.pwm.elettronica.Action.Account;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import it.unirc.pwm.elettronica.Responsabile.model.Responsabile;
import it.unirc.pwm.elettronica.Responsabile.model.DAO.ResponsabileDAOFactory;
import it.unirc.pwm.elettronica.Responsabile.model.DAO.ResponsabileDAOInterface;


public class AggiungiR extends ActionSupport implements ModelDriven<Responsabile>{

	private static final long serialVersionUID = 1L;
	private Responsabile responsabile;
	private ResponsabileDAOInterface rdao=ResponsabileDAOFactory.getDAO();
	
	public Responsabile getResponsabile(){
		return responsabile;
	}public void setResponsabile (Responsabile responsabile) {
		this.responsabile = responsabile;
	}

	public String execute() throws Exception{
		
		rdao.creaResponsabile(getModel());
		return SUCCESS;
	}
	@Override
	public Responsabile getModel() {
		// TODO Auto-generated method stub
		return responsabile;
	}
	
//	public void validate(){
//		
////		if( getModel().getPassword() == getModel().getUsername()){
////			this.addActionMessage("La password e l'username devono essere diversi");
////		}
//		
//		if( responsabile.getTelefono()==0){
//			this.addFieldError("telefono", "Telefono is required.");
//		}
//		
//		if( responsabile.getPassword().length()==0){
//			this.addFieldError("password", "Password is required.");
//		}
//		
//		if(responsabile.getPassword().length()<6){
//			this.addFieldError("password", "Password must be longer than 6 chars.");
//		}
//		
//		if( responsabile.getNome().length()==0){
//			this.addFieldError("nome", "Real name is required.");
//		}
//		
//		if( responsabile.getUsername().length()==0){
//			this.addFieldError("username", "Username is required.");
//		}	
//	}
	
}

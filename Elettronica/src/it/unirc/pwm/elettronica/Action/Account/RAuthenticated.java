package it.unirc.pwm.elettronica.Action.Account;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.elettronica.Action.Account.utils.ResponsabileAware;
import it.unirc.pwm.elettronica.Responsabile.model.Responsabile;

public class RAuthenticated extends ActionSupport implements ResponsabileAware, Action {

	private static final long serialVersionUID = 1L;
	private Responsabile responsabile;
	
	public String execute(){
		return SUCCESS;
	}
	
	public Responsabile getResponsabile() {
		return responsabile;
	}

	public void setResponsabile(Responsabile responsabile) {
		this.responsabile= responsabile;
	}
}

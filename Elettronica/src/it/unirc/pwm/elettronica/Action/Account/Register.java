package it.unirc.pwm.elettronica.Action.Account;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.elettronica.Cliente.model.Cliente;


public class Register extends ActionSupport{

	private static final long serialVersionUID = 1L;
	private Cliente c;
	
	public Cliente getCliente(){
		return c;
	}public void setUser(Cliente c) {
		this.c = c;
	}

	public String execute() throws Exception{
		
		addActionMessage("Registrazione OK");
		
		System.out.println(c.getNome());
		
		return SUCCESS;
	}
}

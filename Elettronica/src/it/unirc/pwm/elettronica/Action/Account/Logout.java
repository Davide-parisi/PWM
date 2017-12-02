package it.unirc.pwm.elettronica.Action.Account;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;


public class Logout extends ActionSupport implements SessionAware{
	
	private Map<String,Object> session; 

	public String execute(){
		
		if(session.isEmpty()) return SUCCESS;  //Da commentare dopo
		if(session.containsKey("cliente")) 
			session.remove("cliente");
		
		if(session.containsKey("responsabile"))
			session.remove("responsabile");

		return SUCCESS;
	}
	
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}

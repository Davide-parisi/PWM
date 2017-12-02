package it.unirc.pwm.elettronica.Account.model.DAO;

public class AccountDAOFactory {
	
	  private static AccountDAOInterface dao = null;
	  
	  private AccountDAOFactory(){
	  }
	  
	  public static AccountDAOInterface getDAO() {
		  
	    if ( dao == null ) {
	    	dao = new AccountDAOImplement();
	    }
	    return dao;
	  } 

}

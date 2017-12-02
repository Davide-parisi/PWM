package it.unirc.pwm.elettronica.Cliente.model.DAO;

public class ClienteDAOFactory {
	
	  private static ClienteDAOInterface dao = null;
	  
	  private ClienteDAOFactory(){
	  }
	  
	  public static ClienteDAOInterface getDAO() {
		  
	    if ( dao == null ) {
	    	dao = new ClienteDAOImplement();
	    }
	    return dao;
	  } 

}

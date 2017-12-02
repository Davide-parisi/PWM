package it.unirc.pwm.elettronica.Responsabile.model.DAO;

public class ResponsabileDAOFactory {
	
	  private static ResponsabileDAOInterface dao = null;
	  
	  private ResponsabileDAOFactory(){
	  }
	  
	  public static ResponsabileDAOInterface getDAO() {
		  
	    if ( dao == null ) {
	    	dao = new ResponsabileDAOImplement();
	    }
	    return dao;
	  } 

}

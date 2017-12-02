package it.unirc.pwm.elettronica.Acquisto.model.DAO;

public class AcquistoDAOFactory {
	
	  private static AcquistoDAOInterface dao = null;
	  
	  private AcquistoDAOFactory(){
	  }
	  
	  public static AcquistoDAOInterface getDAO() {
		  
	    if ( dao == null ) {
	    	dao = new AcquistoDAOImplement();
	    }
	    return dao;
	  } 

}

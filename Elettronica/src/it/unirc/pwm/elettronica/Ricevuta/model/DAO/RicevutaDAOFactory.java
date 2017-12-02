package it.unirc.pwm.elettronica.Ricevuta.model.DAO;

public class RicevutaDAOFactory {
	
	  private static RicevutaDAOInterface dao = null;
	  
	  private RicevutaDAOFactory(){
	  }
	  
	  public static RicevutaDAOInterface getDAO() {
		  
	    if ( dao == null ) {
	    	dao = new RicevutaDAOImplement();
	    }
	    return dao;
	  } 

}

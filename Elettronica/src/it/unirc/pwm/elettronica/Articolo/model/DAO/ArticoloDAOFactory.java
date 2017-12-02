package it.unirc.pwm.elettronica.Articolo.model.DAO;

public class ArticoloDAOFactory {
	
	  private static ArticoloDAOInterface dao = null;
	  
	  private ArticoloDAOFactory(){
	  }
	  
	  public static ArticoloDAOInterface getDAO() {
		  
	    if ( dao == null ) {
	    	dao = new ArticoloDAOImplement();
	    }
	    return dao;
	  } 

}

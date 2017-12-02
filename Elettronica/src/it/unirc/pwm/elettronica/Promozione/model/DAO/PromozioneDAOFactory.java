package it.unirc.pwm.elettronica.Promozione.model.DAO;

public class PromozioneDAOFactory {
	
	  private static PromozioneDAOInterface dao = null;
	  
	  private PromozioneDAOFactory(){
	  }
	  
	  public static PromozioneDAOInterface getDAO() {
		  
	    if ( dao == null ) {
	    	dao = new PromozioneDAOImplement();
	    }
	    return dao;
	  } 

}

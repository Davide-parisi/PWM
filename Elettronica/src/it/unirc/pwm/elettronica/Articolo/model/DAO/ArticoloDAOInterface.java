package it.unirc.pwm.elettronica.Articolo.model.DAO;

import it.unirc.pwm.elettronica.Articolo.model.Articolo;

public interface ArticoloDAOInterface {
	
		public boolean creaArticolo(Articolo a);
		public boolean modificaArticolo(Articolo a);
		public Articolo cercaArticolo(Articolo a);
		public boolean eliminaArticolo(Articolo a);
		public boolean modificaNumeroPezzi(Articolo a);
}

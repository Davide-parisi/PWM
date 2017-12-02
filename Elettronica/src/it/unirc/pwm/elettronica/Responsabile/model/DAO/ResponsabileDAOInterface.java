package it.unirc.pwm.elettronica.Responsabile.model.DAO;

import it.unirc.pwm.elettronica.Responsabile.model.Responsabile;

public interface ResponsabileDAOInterface {
	public boolean creaResponsabile(Responsabile r);
	public boolean modificaResponsabile(Responsabile r);
	public Responsabile cercaResponsabile(Responsabile r);		
}

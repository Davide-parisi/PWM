package it.unirc.pwm.elettronica.Acquisto.model.DAO;

import it.unirc.pwm.elettronica.Acquisto.model.Acquisto;

public interface AcquistoDAOInterface {
	public boolean creaAcquisto(Acquisto a);
	public boolean modificaAcquisto(Acquisto a);
	public Acquisto cercaAcquisto(Acquisto a);
	public boolean eliminaAcquisto(Acquisto a);
}

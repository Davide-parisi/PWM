package it.unirc.pwm.elettronica.Ricevuta.model.DAO;

import java.util.List;

import it.unirc.pwm.elettronica.Acquisto.model.Acquisto;
import it.unirc.pwm.elettronica.Cliente.model.Cliente;
import it.unirc.pwm.elettronica.Ricevuta.model.Ricevuta;

public interface RicevutaDAOInterface {
	public boolean creaRicevuta(Ricevuta r);
	public boolean modificaRicevuta(Ricevuta r);
	public Ricevuta cercaRicevuta(Ricevuta r);
	public boolean eliminaRicevuta(Ricevuta r);
	public List<Ricevuta> cercaRicevute();
	public List<Acquisto> getAcquisti(Cliente c);
//	public List<Articolo> articoliRedditizi();
//	public List<Ricevuta> RicevuteMax();
}

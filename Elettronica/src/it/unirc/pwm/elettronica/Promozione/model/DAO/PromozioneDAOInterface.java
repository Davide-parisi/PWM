package it.unirc.pwm.elettronica.Promozione.model.DAO;

import java.util.List;

import it.unirc.pwm.elettronica.Promozione.model.Promozione;
import it.unirc.pwm.elettronica.Tessera.model.Tessera;

public interface PromozioneDAOInterface {
	public boolean creaPromozione(Promozione p);
	public boolean modificaPromozione(Promozione p);
	public Promozione cercaPromozione(Promozione p);
	public boolean eliminaPromozione(Promozione p);
	public List<Promozione> cercaPromozioni();
	public List<Promozione> getPromozioniCliente(Tessera t);
}

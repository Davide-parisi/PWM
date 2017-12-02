package it.unirc.pwm.elettronica.Tessera.model.DAO;

import it.unirc.pwm.elettronica.Cliente.model.Cliente;
import it.unirc.pwm.elettronica.Tessera.model.Tessera;

public interface TesseraDAOInterface {
	public boolean creaTessera(Tessera t);
	public boolean modificaTessera(Tessera t);
	public Tessera cercaTessera(Tessera t);
	public boolean eliminaTessera(Tessera t);
	public Tessera getTesseraCliente(Cliente c);
	public boolean modificaPunti(Tessera t);
//	public List<Cliente> clientiMigliori();
}

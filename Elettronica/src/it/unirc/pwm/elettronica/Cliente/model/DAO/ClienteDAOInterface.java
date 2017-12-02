package it.unirc.pwm.elettronica.Cliente.model.DAO;

import java.util.List;

import it.unirc.pwm.elettronica.Cliente.model.Cliente;

public interface ClienteDAOInterface {
	public boolean creaCliente(Cliente c);
	public boolean modificaCliente(Cliente c);
	public Cliente cercaCliente(Cliente c);
	public boolean eliminaCliente(Cliente c);
	public List<Cliente> cercaClienti();
	public Cliente verificaLogin(Cliente c);
		
}

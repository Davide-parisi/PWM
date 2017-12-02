package it.unirc.pwm.elettronica.Account.model.DAO;

import it.unirc.pwm.elettronica.Account.model.Account;

public interface AccountDAOInterface {
	public boolean creaAccount(Account a);
	public boolean modificaAccount(Account a);
	public Account cercaAccount(Account a);
	public boolean eliminaAccount(Account a);
	public Account esisteAccount(Account a);
	public boolean esisteUsername(String username);
}

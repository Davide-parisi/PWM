package it.unirc.pwm.elettronica.Promozione.model;

import java.util.HashSet;
import java.util.Set;

import it.unirc.pwm.elettronica.Cliente.model.Cliente;

public class Promozione{

	private int idpromozione;
	private String descrizione;
	private int puntiTessera;
	private Set<Cliente> clienti = new HashSet<Cliente>(0);
	public Promozione() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Promozione(int idpromozione, String descrizione, int puntiTessera) {
		super();
		this.idpromozione = idpromozione;
		this.descrizione = descrizione;
		this.puntiTessera = puntiTessera;
	}


	public Promozione(int idpromozione, String descrizione, int puntiTessera, Set<Cliente> clienti) {
		super();
		this.idpromozione = idpromozione;
		this.descrizione = descrizione;
		this.puntiTessera = puntiTessera;
		this.clienti = clienti;
	}
	public int getIdpromozione() {
		return idpromozione;
	}
	public void setIdpromozione(int idpromozione) {
		this.idpromozione = idpromozione;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public int getPuntiTessera() {
		return puntiTessera;
	}
	public void setPuntiTessera(int puntiTessera) {
		this.puntiTessera = puntiTessera;
	}
	public Set<Cliente> getClienti() {
		return clienti;
	}
	public void setClienti(Set<Cliente> clienti) {
		this.clienti = clienti;
	}
	@Override
	public String toString() {
		return "Promozione [idpromozione=" + idpromozione + ", descrizione=" + descrizione + ", puntiTessera="
				+ puntiTessera + ", clienti=" + clienti + "]";
	}

}

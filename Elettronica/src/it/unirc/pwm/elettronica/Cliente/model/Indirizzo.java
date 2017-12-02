package it.unirc.pwm.elettronica.Cliente.model;

public class Indirizzo {
	private String via;
	private int civico;
	
	public Indirizzo() {
	}
	
	public Indirizzo(String via, int civico) {
		super();
		this.via = via;
		this.civico = civico;
	}

	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}

	public int getCivico() {
		return civico;
	}

	public void setCivico(int civico) {
		this.civico = civico;
	}

	@Override
	public String toString() {
		return "Indirizzo [via=" + via + ", civico=" + civico + "]";
	}

}

package it.unirc.pwm.elettronica.Acquisto.model;

import it.unirc.pwm.elettronica.Articolo.model.Articolo;
import it.unirc.pwm.elettronica.Cliente.model.Cliente;
import it.unirc.pwm.elettronica.Ricevuta.model.Ricevuta;

public class Acquisto{

	private AcquistoId ida;
	private Cliente cliente;
	private Articolo articolo;
	private Ricevuta ricevuta;
	private int quantita;
	public Acquisto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Acquisto(AcquistoId ida, Cliente cliente, Articolo articolo, Ricevuta ricevuta, int quantita) {
		super();
		this.ida = ida;
		this.cliente = cliente;
		this.articolo = articolo;
		this.ricevuta = ricevuta;
		this.quantita = quantita;
	}
	public AcquistoId getIda() {
		return ida;
	}
	public void setIda(AcquistoId ida) {
		this.ida = ida;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Articolo getArticolo() {
		return articolo;
	}
	public void setArticolo(Articolo articolo) {
		this.articolo = articolo;
	}
	public Ricevuta getRicevuta() {
		return ricevuta;
	}
	public void setRicevuta(Ricevuta ricevuta) {
		this.ricevuta = ricevuta;
	}
	public int getQuantita() {
		return quantita;
	}
	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}
	@Override
	public String toString() {
		return "Acquisto [ida=" + ida + ", cliente=" + cliente + ", articolo=" + articolo + ", ricevuta=" + ricevuta
				+ ", quantita=" + quantita + "]";
	}

}

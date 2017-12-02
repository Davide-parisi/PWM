package it.unirc.pwm.elettronica.Articolo.model;

import java.util.HashSet;
import java.util.Set;

import it.unirc.pwm.elettronica.Acquisto.model.Acquisto;

public class Articolo {
	private int idarticolo;
	private String nome, descrizione;
	private double prezzo;
	private int numeroPezzi;
	private Set<Acquisto> acquisti = new HashSet<Acquisto>(0);
	public Articolo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Articolo(int idarticolo, String nome, double prezzo, int numeroPezzi) {
		this.idarticolo = idarticolo;
		this.nome = nome;
		this.prezzo = prezzo;
		this.numeroPezzi = numeroPezzi;
	}
	
	public Articolo(int idarticolo, String nome, String descrizione, double prezzo, int numeroPezzi,
			Set<Acquisto> acquisti) {
		super();
		this.idarticolo = idarticolo;
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.numeroPezzi = numeroPezzi;
		this.acquisti = acquisti;
	}
	public int getIdarticolo() {
		return idarticolo;
	}
	public void setIdarticolo(int idarticolo) {
		this.idarticolo = idarticolo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public int getNumeroPezzi() {
		return numeroPezzi;
	}
	public void setNumeroPezzi(int numeroPezzi) {
		this.numeroPezzi = numeroPezzi;
	}
	public Set<Acquisto> getAcquisti() {
		return acquisti;
	}
	public void setAcquisti(Set<Acquisto> acquisti) {
		this.acquisti = acquisti;
	}
	@Override
	public String toString() {
		return "Articolo [idarticolo=" + idarticolo + ", nome=" + nome + ", descrizione=" + descrizione + ", prezzo="
				+ prezzo + ", numeroPezzi=" + numeroPezzi + ", acquisti=" + acquisti + "]";
	}


}

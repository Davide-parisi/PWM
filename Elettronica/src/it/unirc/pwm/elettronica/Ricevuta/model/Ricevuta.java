package it.unirc.pwm.elettronica.Ricevuta.model;

import java.util.HashSet;
import java.util.Set;

import it.unirc.pwm.elettronica.Acquisto.model.Acquisto;

public class Ricevuta {
	private RicevutaId idr;
	private double importo;
	private Set<Acquisto> acquisti = new HashSet<Acquisto>(0);
	public Ricevuta() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Ricevuta(RicevutaId idr, double importo) {
		super();
		this.idr = idr;
		this.importo = importo;
	}


	public Ricevuta(RicevutaId idr, double importo, Set<Acquisto> acquisti) {
		super();
		this.idr = idr;
		this.importo = importo;
		this.acquisti = acquisti;
	}
	public RicevutaId getIdr() {
		return idr;
	}
	public void setIdr(RicevutaId idr) {
		this.idr = idr;
	}
	public double getImporto() {
		return importo;
	}
	public void setImporto(double importo) {
		this.importo = importo;
	}
	public Set<Acquisto> getAcquisti() {
		return acquisti;
	}
	public void setAcquisti(Set<Acquisto> acquisti) {
		this.acquisti = acquisti;
	}
	@Override
	public String toString() {
		return "Ricevuta [idr=" + idr + ", importo=" + importo + "]";
	}

}

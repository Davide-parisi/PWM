package it.unirc.pwm.elettronica.Tessera.model;

import java.util.Date;

import it.unirc.pwm.elettronica.Cliente.model.Cliente;

public class Tessera{

	private int idtessera;
	private Date validita;
	private int totalePunti;
	private Cliente proprietario;
	public Tessera() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Tessera(int idtessera, Date validita, int totalePunti, Cliente proprietario) {
		super();
		this.idtessera = idtessera;
		this.validita = validita;
		this.totalePunti = totalePunti;
		this.proprietario = proprietario;
	}
	public int getIdtessera() {
		return idtessera;
	}
	public void setIdtessera(int idtessera) {
		this.idtessera = idtessera;
	}
	public Date getValidita() {
		return validita;
	}
	public void setValidita(Date validita) {
		this.validita = validita;
	}
	public int getTotalePunti() {
		return totalePunti;
	}
	public void setTotalePunti(int totalePunti) {
		this.totalePunti = totalePunti;
	}
	public Cliente getProprietario() {
		return proprietario;
	}
	public void setProprietario(Cliente proprietario) {
		this.proprietario = proprietario;
	}
	@Override
	public String toString() {
		return "Tessera [idtessera=" + idtessera + ", validita=" + validita + ", totalePunti=" + totalePunti + "]";
	}

}

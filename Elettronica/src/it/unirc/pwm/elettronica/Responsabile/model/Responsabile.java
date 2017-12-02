package it.unirc.pwm.elettronica.Responsabile.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import it.unirc.pwm.elettronica.Account.model.Account;
import it.unirc.pwm.elettronica.Articolo.model.Articolo;

public class Responsabile extends Account{

	private String codiceF, nome, cognome;
	private Date dataNascita;
	private int telefono;
	private String email;
	private Set<Articolo> ordini = new HashSet<Articolo>(0);
	public Responsabile() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Responsabile(int idaccount, String username, String password) {
		super(idaccount, username, password);
		// TODO Auto-generated constructor stub
	}
	public Responsabile(int idaccount, String username, String password, String nome) {
		super(idaccount, username, password);
		this.nome=nome;
	}

	public Responsabile(String codiceF, String nome, String cognome, Date dataNascita, int telefono, String email,
			Set<Articolo> ordini) {
		super();
		this.codiceF = codiceF;
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.telefono = telefono;
		this.email = email;
		this.ordini = ordini;
	}
	public String getCodiceF() {
		return codiceF;
	}
	public void setCodiceF(String codiceF) {
		this.codiceF = codiceF;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public Date getDataNascita() {
		return dataNascita;
	}
	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Set<Articolo> getOrdini() {
		return ordini;
	}
	public void setOrdini(Set<Articolo> ordini) {
		this.ordini = ordini;
	}
	@Override
	public String toString() {
		return "Responsabile [codiceF=" + codiceF + ", nome=" + nome + ", cognome=" + cognome + ", dataNascita="
				+ dataNascita + ", telefono=" + telefono + ", email=" + email + ", ordini=" + ordini + "]";
	}
	
}

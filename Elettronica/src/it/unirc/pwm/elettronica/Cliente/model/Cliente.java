package it.unirc.pwm.elettronica.Cliente.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import it.unirc.pwm.elettronica.Account.model.Account;
import it.unirc.pwm.elettronica.Acquisto.model.Acquisto;
import it.unirc.pwm.elettronica.Promozione.model.Promozione;

public class Cliente extends Account{

	private String codiceF, nome, cognome;
	private Date dataNascita;
	private int telefono;
	private String email;
	private Indirizzo indirizzo;
	private int abilitato;
	private Set<Promozione> promozioni = new HashSet<Promozione>(0);
	private Set<Acquisto> acquisti = new HashSet<Acquisto>(0);
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cliente(int idaccount, String username, String password) {
		super(idaccount, username, password);
		// TODO Auto-generated constructor stub
	}
	public Cliente(int idaccount, String username, String password, String nome) {
		super(idaccount, username, password);
		this.nome=nome;
	}
	public Cliente(String codiceF, String nome, String cognome, Date dataNascita, int telefono, String email,
			Indirizzo indirizzo, int abilitato, Set<Promozione> promozioni, Set<Acquisto> acquisti) {
		super();
		this.codiceF = codiceF;
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.telefono = telefono;
		this.email = email;
		this.indirizzo = indirizzo;
		this.abilitato = abilitato;
		this.promozioni = promozioni;
		this.acquisti = acquisti;
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
	public Indirizzo getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(Indirizzo indirizzo) {
		this.indirizzo = indirizzo;
	}
	public int getAbilitato() {
		return abilitato;
	}
	public void setAbilitato(int abilitato) {
		this.abilitato = abilitato;
	}
	public Set<Promozione> getPromozioni() {
		return promozioni;
	}
	public void setPromozioni(Set<Promozione> promozioni) {
		this.promozioni = promozioni;
	}
	public Set<Acquisto> getAcquisti() {
		return acquisti;
	}
	public void setAcquisti(Set<Acquisto> acquisti) {
		this.acquisti = acquisti;
	}
	@Override
	public String toString() {
		return "Cliente [codiceF=" + codiceF + ", nome=" + nome + ", cognome=" + cognome + ", dataNascita="
				+ dataNascita + ", telefono=" + telefono + ", email=" + email + ", indirizzo=" + indirizzo
				+ ", abilitato=" + abilitato + ", promozioni=" + promozioni + ", acquisti=" + acquisti + "]";
	}

}

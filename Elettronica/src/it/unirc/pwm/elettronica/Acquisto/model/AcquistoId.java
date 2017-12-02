package it.unirc.pwm.elettronica.Acquisto.model;

import java.util.Date;

public class AcquistoId implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private int idaccount;
	private int idarticolo;
	private int idricevuta;
	private Date data;
	public AcquistoId() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AcquistoId(int idaccount, int idarticolo, int idricevuta, Date data) {
		super();
		this.idaccount = idaccount;
		this.idarticolo = idarticolo;
		this.idricevuta = idricevuta;
		this.data = data;
	}
	public int getIdaccount() {
		return idaccount;
	}
	public void setIdaccount(int idaccount) {
		this.idaccount = idaccount;
	}
	public int getIdarticolo() {
		return idarticolo;
	}
	public void setIdarticolo(int idarticolo) {
		this.idarticolo = idarticolo;
	}
	public int getIdricevuta() {
		return idricevuta;
	}
	public void setIdricevuta(int idricevuta) {
		this.idricevuta = idricevuta;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "AcquistoId [idaccount=" + idaccount + ", idarticolo=" + idarticolo + ", idricevuta=" + idricevuta
				+ ", data=" + data + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + idaccount;
		result = prime * result + idarticolo;
		result = prime * result + idricevuta;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AcquistoId other = (AcquistoId) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (idaccount != other.idaccount)
			return false;
		if (idarticolo != other.idarticolo)
			return false;
		if (idricevuta != other.idricevuta)
			return false;
		return true;
	}
	
}

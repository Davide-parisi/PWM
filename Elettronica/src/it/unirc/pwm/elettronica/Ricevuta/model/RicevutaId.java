package it.unirc.pwm.elettronica.Ricevuta.model;

import java.util.Date;

public class RicevutaId implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private int idricevuta;
	private Date data;
	public RicevutaId() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RicevutaId(int idricevuta, Date data) {
		super();
		this.idricevuta = idricevuta;
		this.data = data;
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
	@Override
	public String toString() {
		return "RicevutaId [idricevuta=" + idricevuta + ", data=" + data + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
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
		RicevutaId other = (RicevutaId) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (idricevuta != other.idricevuta)
			return false;
		return true;
	}

}

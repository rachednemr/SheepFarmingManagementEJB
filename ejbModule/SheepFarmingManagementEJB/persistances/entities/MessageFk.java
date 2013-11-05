package SheepFarmingManagementEJB.persistances.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Embeddable
public class MessageFk implements Serializable{

	public MessageFk(Date date) {
		super();
		this.date = date;
	}
	public MessageFk() {
		super();
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Date date;
	private int idsender;
	private int idreceiver;

	@Temporal(TemporalType.TIMESTAMP)
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getIdsender() {
		return idsender;
	}
	public void setIdsender(int idsender) {
		this.idsender = idsender;
	}
	public int getIdreceiver() {
		return idreceiver;
	}
	public void setIdreceiver(int idreceiver) {
		this.idreceiver = idreceiver;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idreceiver;
		result = prime * result + idsender;
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
		MessageFk other = (MessageFk) obj;
		if (idreceiver != other.idreceiver)
			return false;
		if (idsender != other.idsender)
			return false;
		return true;
	}
	

}

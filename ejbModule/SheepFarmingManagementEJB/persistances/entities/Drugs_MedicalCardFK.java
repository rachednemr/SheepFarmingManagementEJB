package SheepFarmingManagementEJB.persistances.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;

@Embeddable
public class Drugs_MedicalCardFK implements Serializable{

	public Drugs_MedicalCardFK(int medicalid, Date date,
			int DrugsId) {
		super();
		this.medicalid = medicalid;
		this.date = date;
		DrugsId = DrugsId;
	}
	public Drugs_MedicalCardFK() {
		super();
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int medicalid;
	private Date date;
	public Date getdate() {
		return date;
	}
	public void setDate(Date stratDate) {
		date = stratDate;
	}
	private int DrugsId;
	public int getMedicalid() {
		return medicalid;
	}
	public void setMedicalid(int medicalid) {
		this.medicalid = medicalid;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + DrugsId;
		result = prime * result + medicalid;
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
		Drugs_MedicalCardFK other = (Drugs_MedicalCardFK) obj;
		if (DrugsId != other.DrugsId)
			return false;
		if (medicalid != other.medicalid)
			return false;
		return true;
	}
	public int getDrugsId() {
		return DrugsId;
	}
	public void setDrugsId(int drugsId) {
		DrugsId = drugsId;
	}

}

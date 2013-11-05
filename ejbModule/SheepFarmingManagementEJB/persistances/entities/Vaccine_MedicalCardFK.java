package SheepFarmingManagementEJB.persistances.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;

@Embeddable
public class Vaccine_MedicalCardFK implements Serializable{

	public Vaccine_MedicalCardFK(int medicalid, Date date,
			int vaccinereferentcialId) {
		super();
		this.medicalid = medicalid;
		this.date = date;
		VaccinereferentcialId = vaccinereferentcialId;
	}
	public Vaccine_MedicalCardFK() {
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
	private int VaccinereferentcialId;
	public int getMedicalid() {
		return medicalid;
	}
	public void setMedicalid(int medicalid) {
		this.medicalid = medicalid;
	}
	public int getVaccinereferentcialId() {
		return VaccinereferentcialId;
	}
	public void setVaccinereferentcialId(int vaccinereferentcialId) {
		VaccinereferentcialId = vaccinereferentcialId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + VaccinereferentcialId;
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
		Vaccine_MedicalCardFK other = (Vaccine_MedicalCardFK) obj;
		if (VaccinereferentcialId != other.VaccinereferentcialId)
			return false;
		if (medicalid != other.medicalid)
			return false;
		return true;
	}

}

package SheepFarmingManagementEJB.persistances.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Vaccine_MedicalCard implements Serializable{

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private int number;
private int periode;
private float Quotas;
private MedicalCard medicalcard;
private Vaccine_MedicalCardFK vaccinereferential_medicalCard;
private VaccineReferencial vaccine;
public Vaccine_MedicalCard() {
		super();
	}
public Vaccine_MedicalCard(int number, int periode, float quotas) {
		super();
		this.number = number;
		this.periode = periode;
		Quotas = quotas;
	}
public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}
public int getPeriode() {
	return periode;
}
public void setPeriode(int periode) {
	this.periode = periode;
}
public float getQuotas() {
	return Quotas;
}
public void setQuotas(float quotas) {
	Quotas = quotas;
}
@ManyToOne
@JoinColumn(name = "medicalid", referencedColumnName = "Id", insertable = false, updatable = false)
public MedicalCard getMedicalcard() {
	return medicalcard;
}
public void setMedicalcard(MedicalCard medicalcard) {
	this.medicalcard = medicalcard;
}
@ManyToOne
@JoinColumn(name = "VaccinereferentcialId", referencedColumnName = "Id", insertable = false, updatable = false)

public VaccineReferencial getVaccine() {
	return vaccine;
}
public void setVaccine(VaccineReferencial vaccine) {
	this.vaccine = vaccine;
}
@EmbeddedId
public Vaccine_MedicalCardFK getVaccinereferential_medicalCard() {
	return vaccinereferential_medicalCard;
}
public void setVaccinereferential_medicalCard(
		Vaccine_MedicalCardFK vaccinereferential_medicalCard) {
	this.vaccinereferential_medicalCard = vaccinereferential_medicalCard;
}

}

package SheepFarmingManagementEJB.persistances.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Drugs_MedicalCard implements Serializable{

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private int number;
private int periode;
private float Quotas;
private MedicalCard medicalcard;
private Drugs_MedicalCardFK drugs_medicalCard;
private DrugReferencial Drugs;
public Drugs_MedicalCard() {
		super();
	}
public Drugs_MedicalCard(int number, int periode, float quotas) {
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
@JoinColumn(name = "DrugsId", referencedColumnName = "Id", insertable = false, updatable = false)
public DrugReferencial getDrugs() {
	return Drugs;
}
public void setDrugs(DrugReferencial drugs) {
	Drugs = drugs;
}

@EmbeddedId
public Drugs_MedicalCardFK getVaccinereferential_medicalCard() {
	return drugs_medicalCard;
}
public void setVaccinereferential_medicalCard(
		Drugs_MedicalCardFK drugs_medicalCard) {
	this.drugs_medicalCard = drugs_medicalCard;
}


}

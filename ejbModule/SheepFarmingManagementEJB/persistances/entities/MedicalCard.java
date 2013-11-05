package SheepFarmingManagementEJB.persistances.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;
@Entity

public class MedicalCard implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int Id;
	private String Dose;
    private Veterinerian veterinerian;
	private List<DiseaseReferential>DiseaseReferentials; 
	private List<Vaccine_MedicalCard>vaccine_MedicalCards; 
	private List<Drugs_MedicalCard>drugs_MedicalCards; 
	private Sheep sheep;
	
public MedicalCard() {
		super();
	}
public MedicalCard( String dose) {
		super();
		
		Dose = dose;
	}
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)

public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}



public String getDose() {
	return Dose;
}
public void setDose(String dose) {
	Dose = dose;
}
@OneToMany(mappedBy="medicalcard")
public List<Vaccine_MedicalCard> getVaccine_MedicalCards() {
	return vaccine_MedicalCards;
}
public void setVaccine_MedicalCards(List<Vaccine_MedicalCard> vaccine_MedicalCards) {
	this.vaccine_MedicalCards = vaccine_MedicalCards;
}
@OneToMany(mappedBy="medicalcard")
public List<Drugs_MedicalCard> getDrugs_MedicalCards() {
	return drugs_MedicalCards;
}
public void setDrugs_MedicalCards(List<Drugs_MedicalCard> drugs_MedicalCards) {
	this.drugs_MedicalCards = drugs_MedicalCards;
}
@ManyToMany
public List<DiseaseReferential> getDiseaseReferentials() {
	return DiseaseReferentials;
}
public void setDiseaseReferentials(List<DiseaseReferential> diseaseReferentials) {
	DiseaseReferentials = diseaseReferentials;
}
@ManyToOne
public Sheep getSheep() {
	return sheep;
}
public void setSheep(Sheep sheep) {
	this.sheep = sheep;
}
@ManyToOne
public Veterinerian getVeterinerian() {
	return veterinerian;
}
public void setVeterinerian(Veterinerian veterinerian) {
	this.veterinerian = veterinerian;
}


}
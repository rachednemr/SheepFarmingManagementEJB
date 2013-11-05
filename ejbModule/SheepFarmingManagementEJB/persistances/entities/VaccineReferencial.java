package SheepFarmingManagementEJB.persistances.entities;
import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
@Entity

public class VaccineReferencial implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

private int Id;
private String vaccine_agenda;
private String name;
private String Type;
private List<Vaccine_MedicalCard>vaccine_MedicalCards; 
public VaccineReferencial() {
		super();
	}
public VaccineReferencial(String vaccine_agenda, String name, String type) {
		super();
		this.vaccine_agenda = vaccine_agenda;
		this.name = name;
		Type = type;
	}
@Id
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getType() {
	return Type;
}
public void setType(String type) {
	Type = type;
}
public String getVaccine_agenda() {
	return vaccine_agenda;
}
public void setVaccine_agenda(String vaccine_agenda) {
	this.vaccine_agenda = vaccine_agenda;
}
@OneToMany(mappedBy="vaccine")
public List<Vaccine_MedicalCard> getVaccine_MedicalCards() {
	return vaccine_MedicalCards;
}
public void setVaccine_MedicalCards(List<Vaccine_MedicalCard> vaccine_MedicalCards) {
	this.vaccine_MedicalCards = vaccine_MedicalCards;
}

}

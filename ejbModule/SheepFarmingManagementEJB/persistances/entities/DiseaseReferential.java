package SheepFarmingManagementEJB.persistances.entities;
import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
@Entity
public class DiseaseReferential  implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int Id;
	private String Name;
	private String Sympthome;
	private String Description;
	private List<MedicalCard> MedicalCards;
public DiseaseReferential() {
		super();
	}
public DiseaseReferential(String name, String sympthome, String description) {
		super();
		Name = name;
		Sympthome = sympthome;
		Description = description;
	}
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)

public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getSympthome() {
	return Sympthome;
}
public void setSympthome(String sympthome) {
	Sympthome = sympthome;
}
public String getDescription() {
	return Description;
}
public void setDescription(String description) {
	Description = description;
}
@ManyToMany(mappedBy="diseaseReferentials")
public List<MedicalCard> getMedicalCards() {
	return MedicalCards;
}
public void setMedicalCards(List<MedicalCard> medicalCards) {
	MedicalCards = medicalCards;
}
}

package SheepFarmingManagementEJB.persistances.entities;
import java.io.Serializable;

import javax.persistence.*;
@Entity

public class ProgrammedVaccine  implements Serializable {
/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	private int Id;
	private String naem;
	private int date;
	private Veterinerian veterinerian;
public ProgrammedVaccine() {
		super();
	}
public ProgrammedVaccine(String naem, int date) {
		super();
		this.naem = naem;
		this.date = date;
	}
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)

public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getNaem() {
	return naem;
}
public void setNaem(String naem) {
	this.naem = naem;
}
public int getDate() {
	return date;
}
public void setDate(int date) {
	this.date = date;
}
@ManyToOne
public Veterinerian getVeterinerian() {
	return veterinerian;
}
public void setVeterinerian(Veterinerian veterinerian) {
	this.veterinerian = veterinerian;
}
}

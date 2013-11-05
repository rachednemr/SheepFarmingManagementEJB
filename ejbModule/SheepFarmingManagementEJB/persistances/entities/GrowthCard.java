package SheepFarmingManagementEJB.persistances.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
@Entity

public class GrowthCard implements Serializable {

	private static final long serialVersionUID = 1L;
	private  int Id;
	private Float  Weight;	
	private String Observation;	
	private Float HelthState;	
	private Date opration_date;
	private Sheep sheep;
public GrowthCard() {
		super();
	}
public GrowthCard(Float weight, String observation,
			Float helthState, Date opration_date) {
		super();
		Weight = weight;
		Observation = observation;
		HelthState = helthState;
		this.opration_date = opration_date;
	}
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)

public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public Float getWeight() {
	return Weight;
}
public void setWeight(Float weight) {
	Weight = weight;
}
public String getObservation() {
	return Observation;
}
public void setObservation(String observation) {
	Observation = observation;
}
public Float getHelthState() {
	return HelthState;
}
public void setHelthState(Float helthState) {
	HelthState = helthState;
}
public Date getOpration_date() {
	return opration_date;
}
public void setOpration_date(Date opration_date) {
	this.opration_date = opration_date;
}
@ManyToOne
public Sheep getSheep() {
	return sheep;
}
public void setSheep(Sheep sheep) {
	this.sheep = sheep;
}	
}

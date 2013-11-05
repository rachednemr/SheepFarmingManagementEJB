package SheepFarmingManagementEJB.persistances.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity

public class Movement implements Serializable {
public Movement() {
		super();
	}
public Movement(Date date, String type) {
		super();
		this.date = date;
		this.type = type;
	}
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private int id ;
private Date date;
private String type;
private Sheep sheep;
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
@ManyToOne
public Sheep getSheep() {
	return sheep;
}
public void setSheep(Sheep sheep) {
	this.sheep = sheep;
}
}

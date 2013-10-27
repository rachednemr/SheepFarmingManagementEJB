package SheepFarmingManagementEJB.persistances.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class Herds implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
// identifiant
private int id_herds;
//nom du troupeau
private String lot;
@Id
@GeneratedValue
public int getId_herds() {
	return id_herds;
}
public void setId_herds(int id_herds) {
	this.id_herds = id_herds;
}
public String getLot() {
	return lot;
}
public void setLot(String lot) {
	this.lot = lot;
}
}

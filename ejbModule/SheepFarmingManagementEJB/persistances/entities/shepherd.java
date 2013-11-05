package SheepFarmingManagementEJB.persistances.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
@Entity
public class shepherd implements Serializable {

	private static final long serialVersionUID = 1L;
// identifant du berger
	public Farmer farmer;
	private int shepherd_id;

// nom et prenom du berger
private String FirstName;
// nom du bereger
private String LastName;
// etat du berger (active désactiver)
private String status;
//age du berger
private int age;
// constructeur par défaut
private List<Herds> herds;
public shepherd()
{
super();	
}
// getters et setters
public shepherd(int id_shepherd)
{
	this.shepherd_id=id_shepherd;	
}
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
public int getShepherd_id() {
	return shepherd_id;
}
public void setShepherd_id(int shepherd_id) 
{
	this.shepherd_id = shepherd_id;
}




@ManyToOne
public Farmer getFarmer() {
	return farmer;
}
public void setFarmer(Farmer farmer) {
	this.farmer = farmer;
}
public String getFirstName() {
	return FirstName;
}
public void setFirstName(String firstName) {
	FirstName = firstName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@ManyToMany
public List<Herds> getHerds() {
	return herds;
}
public void setHerds(List<Herds> herds) {
	this.herds = herds;
}
	
	

}

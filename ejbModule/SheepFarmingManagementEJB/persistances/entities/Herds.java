package SheepFarmingManagementEJB.persistances.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity

public class Herds implements Serializable {
	private static final long serialVersionUID = 1L;
// identifiant
private int id;
//nom du troupeau
private String lot;
private List<Sheep>sheeps;
private List<FeedCard> feedcards;
private List<shepherd> shephreds;
public Herds() {
	super();
}
public Herds(String lot) {
	super();
	this.lot = lot;
}
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
public int getId_herds() {
	return id;
}
public void setId_herds(int id_herds) {
	this.id = id_herds;
}
public String getLot() {
	return lot;
}
public void setLot(String lot) {
	this.lot = lot;
}
@OneToMany(mappedBy="herd")
public List<Sheep> getSheeps() {
	return sheeps;
}
public void setSheeps(List<Sheep> sheeps) {
	this.sheeps = sheeps;
}
@OneToMany(mappedBy="herd")
public List<FeedCard> getFeedcards() {
	return feedcards;
}
public void setFeedcards(List<FeedCard> feedcards) {
	this.feedcards = feedcards;
}
@ManyToMany(mappedBy="herds")
public List<shepherd> getShephreds() {
	return shephreds;
}
public void setShephreds(List<shepherd> shephreds) {
	this.shephreds = shephreds;
}
}

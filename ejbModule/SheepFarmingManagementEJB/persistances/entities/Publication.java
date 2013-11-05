package SheepFarmingManagementEJB.persistances.entities;
import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;
@Entity
public class Publication implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

private int  id;
private Date date;
private String Text;
private User user;
public Publication() {
		super();
	}
public Publication(Date date, String text) {
		super();
		this.date = date;
		Text = text;
	}
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
public String getText() {
	return Text;
}
public void setText(String text) {
	Text = text;
}
@ManyToOne
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
}

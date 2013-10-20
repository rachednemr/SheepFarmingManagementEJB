package SheepFarmingManagementEJB.persistances.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class shepherd implements Serializable {

	private static final long serialVersionUID = 1L;

	private int shepherd_id;
private String login;
private String password;
private String full_name;
private String state;

public shepherd()
{
super();	
}

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
public String getLogin() {
	return login;
}
public void setLogin(String login) {
	this.login = login;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getFull_name() {
	return full_name;
}
public void setFull_name(String full_name) {
	this.full_name = full_name;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}
	
	

}

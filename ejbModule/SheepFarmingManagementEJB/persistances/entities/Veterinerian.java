
package SheepFarmingManagementEJB.persistances.entities;

import  SheepFarmingManagementEJB.persistances.entities.User;
import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Veterinerian
 *
 */
@Entity

public class Veterinerian extends User implements Serializable {

	
	private String adress;
	private String state;
	private static final long serialVersionUID = 1L;

	public Veterinerian() {
		super();
	}   
	
	


	public Veterinerian(String firstName, String lastName, String email,
			Integer phone, String login, String password, Integer cin,
			String stateRequest, Admin admin, String adress, String state) {
		super(firstName, lastName, email, phone, login, password, cin,
				stateRequest, admin);
		this.adress = adress;
		this.state = state;
	}




	public String getAdress() {
		return this.adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}   
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}
   
}

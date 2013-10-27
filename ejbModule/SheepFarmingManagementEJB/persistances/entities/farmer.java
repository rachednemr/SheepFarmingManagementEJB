package SheepFarmingManagementEJB.persistances.entities;
import SheepFarmingManagementEJB.persistances.entities.User;
import java.io.Serializable;
import java.lang.String;
import java.util.List;
import javax.persistence.*;
@Entity
public class Farmer extends User implements Serializable {
	private int id_farmer;
	private String state;
	private String farmLocation;
	private String adress;
	// liste des bergers
	private List<shepherd> shepherds;
	private static final long serialVersionUID = 1L;

	public Farmer() {
		super();
	}   
	
	public Farmer(int id) {
		super();
		this.setIdUser(id);
	}   
	
	
	
	
	

	public Farmer(String firstName, String lastName, String email,
			Integer phone, String login, String password, Integer cin,
			String stateRequest, Admin admin, String state,
			String farmLocation, String adress) {
		super(firstName, lastName, email, phone, login, password, cin,
				stateRequest, admin);
		this.state = state;
		this.farmLocation = farmLocation;
		this.adress = adress;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}   
	public String getFarmLocation() {
		return this.farmLocation;
	}

	public void setFarmLocation(String farmLocation) {
		this.farmLocation = farmLocation;
	}   
	public String getAdress() {
		return this.adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}
	public void affectFarmerShepherds(List<shepherd> shepherds)
	{
		for(shepherd s:shepherds)
		{
			s.setFarmer(this);
			this.getShepherds().add(s);
			
		}
		
		
	}
// relation de un à plusiers
//strategie de generation des classes des classes filles 
@OneToMany(mappedBy="farmer",cascade=CascadeType.ALL,fetch=FetchType.EAGER)

	public List<shepherd> getShepherds() {
		return shepherds;
	}

	public void setShepherds(List<shepherd> shepherds) {
		this.shepherds = shepherds;
	}
@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId_farmer() {
		return id_farmer;
	}

	public void setId_farmer(int id_farmer) {
		this.id_farmer = id_farmer;
	}
   
}

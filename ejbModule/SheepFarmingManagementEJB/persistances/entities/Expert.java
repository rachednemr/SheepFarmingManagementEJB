package SheepFarmingManagementEJB.persistances.entities;
import SheepFarmingManagementEJB.persistances.entities.User;
import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;
@Entity
public class Expert extends User implements Serializable {
	private String post;
	private String formation;
	private String speciality;
	private static final long serialVersionUID = 1L;

	public Expert() {
		super();
	}   
	
	private List<FeedReferencial> listFeedReferencials;
	@OneToMany(mappedBy="expert")
	public List<FeedReferencial> getListFeedReferencials() {
		return listFeedReferencials;
	}
	public void setListFeedReferencials(List<FeedReferencial> listFeedReferencials) {
		this.listFeedReferencials = listFeedReferencials;
	}

	


	public Expert(String firstName, String lastName, String email,
			Integer phone, String login, String password, Integer cin,
			String stateRequest, Admin admin, String post, String formation,
			String speciality) {
		super(firstName, lastName, email, phone, login, password, cin,
				stateRequest, admin);
		this.post = post;
		this.formation = formation;
		this.speciality = speciality;
	}





	public String getPost() {
		return this.post;
	}

	public void setPost(String post) {
		this.post = post;
	}   
	public String getFormation() {
		return this.formation;
	}

	public void setFormation(String formation) {
		this.formation = formation;
	}   
	public String getSpeciality() {
		return this.speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
   
}

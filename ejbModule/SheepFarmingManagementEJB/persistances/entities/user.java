package SheepFarmingManagementEJB.persistances.entities;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.sql.Blob;
import java.util.List;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
@Entity
@XmlRootElement
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class User implements Serializable {

	private Integer idUser;
	private String firstName;
	private String lastName;
	private String email;
	private Integer phone;
	private String login;
	private String password;
	private Integer cin; 
	private String stateRequest;
	private Admin admin; 
	private List<Message> messages;
	private List<Publication> Publications;
	
	private static final long serialVersionUID = 1L;

	public User() {
		super();
	}   

	public User(String firstName, String lastName, String email, Integer phone,
			String login, String password, Integer cin, String stateRequest,
			Admin admin) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.login = login;
		this.password = password;
		this.cin = cin;
		this.stateRequest = stateRequest;
		this.admin = admin;
	}









	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getIdUser() {
		return this.idUser;
	}

	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}   
	public String getFirstName() {
		return this.firstName;
	}
	public Integer getCin() {
		return this.cin;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}   
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}   
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}   
	public Integer getPhone() {
		return this.phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}   
	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}   
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setCin(Integer cin) {
		this.cin = cin;
	}
	@ManyToOne
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}




	public String getStateRequest() {
		return stateRequest;
	}




	public void setStateRequest(String stateRequest) {
		this.stateRequest = stateRequest;
	}
@OneToMany(mappedBy="sender")
	public List<Message> getMessages() {
		return messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}
@OneToMany(mappedBy="user")
	public List<Publication> getPublications() {
		return Publications;
	}

	public void setPublications(List<Publication> publications) {
		Publications = publications;
	}
   
	
	
}

package SheepFarmingManagementEJB.persistances.entities;
import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.persistence.*;
@Entity
public class Admin implements Serializable {

	   
	
	private Integer idAdmin;
	private String login;
	private String password;
	private List<User> listUsers;
	private String name;
	private String Email;
	
	
	private static final long serialVersionUID = 1L;

	public Admin() {
		super();
	}   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getIdAdmin() {
		return this.idAdmin;
	}

	public void setIdAdmin(Integer idAdmin) {
		this.idAdmin = idAdmin;
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
	
	@OneToMany(mappedBy="admin")
	public List<User> getListUsers() {
		return listUsers;
	}
	public void setListUsers(List<User> listUsers) {
		this.listUsers = listUsers;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	public Admin(Integer id,String login, String password, List<User> listUsers,
			String name, String email) {
		super();
		this.idAdmin = id;
		this.login = login;
		this.password = password;
		this.listUsers = listUsers;
		this.name = name;
		Email = email;
	}
	public Admin(String login, String password, List<User> listUsers,
			String name, String email) {
		super();
		this.login = login;
		this.password = password;
		this.listUsers = listUsers;
		this.name = name;
		Email = email;
	}
   
}

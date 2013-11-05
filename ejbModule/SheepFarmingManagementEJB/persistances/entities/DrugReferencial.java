package SheepFarmingManagementEJB.persistances.entities;
import java.io.Serializable;
import javax.persistence.*;
@Entity
public class DrugReferencial implements Serializable {

	private static final long serialVersionUID = 1L;
	private int Id;
	private String name;

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public DrugReferencial() {
	super();
	
}
public DrugReferencial( String name) {
	super();
	
	this.name = name;
}
}

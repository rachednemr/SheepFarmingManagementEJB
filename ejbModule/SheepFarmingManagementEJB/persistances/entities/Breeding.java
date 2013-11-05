package SheepFarmingManagementEJB.persistances.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
@Entity
public class Breeding implements Serializable {

	private String BreedingType;
	private Sheep sheep1;
	private Sheep sheep2;
	private BreedingFK breedingfp;
	
	private static final long serialVersionUID = 1L;
	public Breeding() {
		super();
	}
	public Breeding( String breedingType ) {
		super();
		
		BreedingType = breedingType;
	
	}

	public String getBreedingType() {
		return BreedingType;
	}
	public void setBreedingType(String breedingType) {
		BreedingType = breedingType;
	}

	@ManyToOne
	@JoinColumn(name = "idsheep1", referencedColumnName = "Id", insertable = false, updatable = false)
	public Sheep getSheep1() {
		return sheep1;
	}
	public void setSheep1(Sheep sheep1) {
		this.sheep1 = sheep1;
	}

	@ManyToOne
	@JoinColumn(name = "idsheep2", referencedColumnName = "Id", insertable = false, updatable = false)
	public Sheep getSheep2() {
		return sheep2;
	}
	public void setSheep2(Sheep sheep2) {
		this.sheep2 = sheep2;
	}
	@EmbeddedId
	public BreedingFK getBreedingfp() {
		return breedingfp;
	}
	public void setBreedingfp(BreedingFK breedingfp) {
		this.breedingfp = breedingfp;
	}
    
}

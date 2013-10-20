package SheepFarmingManagementEJB.services;

import java.util.List;

import javax.ejb.Remote;
import SheepFarmingManagementEJB.persistances.entities.Farmer;
import SheepFarmingManagementEJB.persistances.entities.Veterinerian;


@Remote
public interface VeterinarianServiceRemote {
	
	public void addVet(Veterinerian veterinerian);
	public void updateVet(Veterinerian veterinerian);
	public void removeVet(Veterinerian veterinerian);
	public Veterinerian getVet(int id);
	public List<Veterinerian> getAllVets();
	public List<Veterinerian> getVetRequests();

}

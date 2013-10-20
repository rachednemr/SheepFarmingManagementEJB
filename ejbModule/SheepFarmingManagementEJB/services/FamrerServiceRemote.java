package SheepFarmingManagementEJB.services;

import java.util.List;

import javax.ejb.Remote;



import SheepFarmingManagementEJB.persistances.entities.Farmer;

import SheepFarmingManagementEJB.persistances.entities.Expert;


@Remote
public interface FamrerServiceRemote {

	public void addFarmer(Farmer farmer);
	public void updateFarmer(Farmer farmer);
	public void removeFarmer(Farmer farmer);
	public Farmer getFarmer(int id);
	public List<Farmer> getAllFarmers();
	public List<Farmer> getFarmerRequests();
	public void AffectFarmerUser(Farmer farmer);
	
}

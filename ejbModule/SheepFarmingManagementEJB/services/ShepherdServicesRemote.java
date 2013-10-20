package SheepFarmingManagementEJB.services;

import java.util.List;

import javax.ejb.Remote;

import SheepFarmingManagementEJB.persistances.entities.shepherd;

@Remote
public interface ShepherdServicesRemote {
	public void addShepherd(shepherd Shepherd);
	public void updateShepherd(shepherd Shepherd);
	public void removeShepherd(shepherd Shepherd);
	public shepherd getShepherd(int id);
	public List<shepherd> getAllShepherds();
	
	
}

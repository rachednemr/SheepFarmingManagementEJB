package SheepFarmingManagementEJB.services;

import java.util.List;

import javax.ejb.Remote;

import SheepFarmingManagementEJB.persistances.entities.Expert;
import SheepFarmingManagementEJB.persistances.entities.Farmer;
import SheepFarmingManagementEJB.persistances.entities.User;


@Remote
public interface ExpertServiceRemote {
	
	public void addExpert(Expert expert);
	public void updateExpert(Expert expert);
	public void removeExpert(Expert fexpert);
	public Expert getExpert(int id);
	public List<Expert> getAllExperts();
	public List<Expert> getExpertRequests();
}

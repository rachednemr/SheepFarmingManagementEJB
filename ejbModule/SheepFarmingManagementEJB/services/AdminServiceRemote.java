package SheepFarmingManagementEJB.services;

import java.util.List;

import javax.ejb.Remote;

import SheepFarmingManagementEJB.persistances.entities.Admin;
import SheepFarmingManagementEJB.persistances.entities.User;


@Remote
public interface AdminServiceRemote {

	public void addAdmin(Admin admin);
	public void updateAdmin(Admin admin);
	public Admin getAdmin(int id);
	public List<Admin> getAllAdmins();
	public List<User> getRequests();
	
}

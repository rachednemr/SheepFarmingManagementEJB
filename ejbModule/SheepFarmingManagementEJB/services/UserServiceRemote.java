package SheepFarmingManagementEJB.services;

import java.util.List;

import javax.ejb.Remote;

import SheepFarmingManagementEJB.persistances.entities.User;


@Remote
public interface UserServiceRemote {
	public List<User> getRequests();
	public User getUser(int id);
	public void updateUser(User user);

}

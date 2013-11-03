package SheepFarmingManagementEJB.services;

import java.util.List;

import javax.ejb.Remote;

import SheepFarmingManagementEJB.persistances.entities.User;


@Remote
public interface UserServiceRemote {
	public List<User> getUsers();
	public User getUser(int id);
	public List<User> SearchUsersByFirstName(String firstName);
	public List<User> SearchUsersByLastName(String lastName);
	 public List<User> AuthentificateUser(String login, String password);
	 public List<User> searchByLogin(String login);


}

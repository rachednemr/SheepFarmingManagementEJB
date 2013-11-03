package SheepFarmingManagementEJB.services;

import SheepFarmingManagementEJB.persistances.entities.User;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;



/**
 * Session Bean implementation class UserService
 */
@Stateless
@LocalBean
public class UserService implements UserServiceRemote {

    /**
     * Default constructor. 
     */
	@PersistenceContext
	EntityManager em;
    public UserService() {
        // TODO Auto-generated constructor stub
    }

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getUsers() {
		String queryt="select u from User u  ";
		Query query=em.createQuery(queryt);
	return	query.getResultList();
	}

	@Override
	public User getUser(int id) {
		return em.find(User.class, id);
	}

	

	@Override
	public List<User> AuthentificateUser(String login, String password) {
		String par="Accepted";
		String query="select u from User u where u.login=:login and u.password=:password and u.stateRequest=:par";
	      Query queryU=em.createQuery(query).setParameter("login", login).setParameter("password", password).setParameter("par",par);
			return queryU.getResultList();
	}

	@Override
	public List<User> SearchUsersByFirstName(String firstName) {
		firstName = firstName+"%";
		String query="select u from User u where u.firstName LIKE :firstName ";
	      Query queryU=em.createQuery(query).setParameter("firstName", firstName);
			return queryU.getResultList();
	}

	@Override
	public List<User> SearchUsersByLastName(String lastName) {
		lastName = lastName+"%";
		String query="select u from User u where u.lastName LIKE :lastName ";
	      Query queryU=em.createQuery(query).setParameter("lastName", lastName);
			return queryU.getResultList();
	}

	@Override
	public List<User> searchByLogin(String login) {
		List<User> l = null;
		String query="select u from User u where u.login=:login";
	      Query queryU=em.createQuery(query).setParameter("login", login);
	      l = queryU.getResultList();
			return l;
	}

	
}

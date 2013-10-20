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
	public List<User> getRequests() {
		String queryt="select u from User u where u.stateRequest = Waiting ";
		Query query=em.createQuery(queryt);
	return	query.getResultList();
	}

	@Override
	public User getUser(int id) {
		return em.find(User.class, id);
	}

	@Override
	public void updateUser(User user) {
		em.merge(user);
		
	}

}

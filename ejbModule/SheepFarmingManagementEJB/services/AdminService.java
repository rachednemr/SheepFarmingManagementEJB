package SheepFarmingManagementEJB.services;
import java.util.List;

import SheepFarmingManagementEJB.persistances.entities.Admin;
import SheepFarmingManagementEJB.persistances.entities.User;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
/**
 * Session Bean implementation class AdminService
 */
@Stateless
public class AdminService implements AdminServiceRemote {

    /**
     * Default constructor. 
     */
	
	@PersistenceContext
	EntityManager em;
    public AdminService() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void addAdmin(Admin admin) {
		em.persist(admin);
		
	}

	@Override
	public void updateAdmin(Admin admin) {
		em.merge(admin);
		
	}

	@Override
	public Admin getAdmin(int id) {
		
		return em.find(Admin.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Admin> getAllAdmins() {
		String queryt="select a from Admin a ";
		Query query=em.createQuery(queryt);
	return	query.getResultList();
	
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getRequests() {
		String par="Waiting ";
		List<User> user = null;
	
	
	Query query = em.createQuery("select u from User u where u.stateRequest=:par").setParameter("par",par);
	try {
		user = query.getResultList();
	} catch (Exception e) {
		// TODO: handle exception
	}
	return user;
	
	}

}

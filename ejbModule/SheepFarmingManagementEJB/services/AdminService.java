package SheepFarmingManagementEJB.services;
import java.util.List;
import SheepFarmingManagementEJB.persistances.entities.Admin;
import SheepFarmingManagementEJB.persistances.entities.User;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class AdminService implements AdminServiceRemote {
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
	@Override
	public List<Admin> AuthentificateAdmin(String login, String password) {
		String query="select u from Admin u where u.login=:login and u.password=:password";
	      Query queryU=em.createQuery(query).setParameter("login", login).setParameter("password", password);
			return queryU.getResultList();
	}

	@Override
	public List<Admin> searchByLogin(String login) {
		List<Admin> l = null;
		String query="select u from Admin u where u.login=:login";
	      Query queryU=em.createQuery(query).setParameter("login", login);
	      l = queryU.getResultList();
			return l;
	}

}

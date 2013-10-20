package SheepFarmingManagementEJB.services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

import SheepFarmingManagementEJB.persistances.entities.Expert;
import SheepFarmingManagementEJB.persistances.entities.Farmer;


/**
 * Session Bean implementation class ExpertService
 */
@Stateless
@LocalBean
public class ExpertService implements ExpertServiceRemote {

    /**
     * Default constructor. 
     */
	@PersistenceContext
 	EntityManager em;
    public ExpertService() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void addExpert(Expert expert) {
		em.persist(expert);
		
	}

	@Override
	public void updateExpert(Expert expert) {
		em.merge(expert);
		
	}

	@Override
	public void removeExpert(Expert fexpert) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Expert getExpert(int id) {
		return em.find(Expert.class, id);
	}

	@Override
	public List<Expert> getAllExperts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Expert> getExpertRequests() {
		String queryt="select u from User u where DTYPE = Expert and stateRequest = Waiting";
		Query query=em.createQuery(queryt);
	return	query.getResultList();
	}

}

package SheepFarmingManagementEJB.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import SheepFarmingManagementEJB.persistances.entities.Farmer;


/**
 * Session Bean implementation class FamrerService
 */
@Stateless
public class FamrerService implements FamrerServiceRemote {

    /*7*
     * Default constructor. 
     */
	
	@PersistenceContext
	EntityManager em;
    public FamrerService() {
        // TODO Auto-generated constructor stub
    }
    
    public void addFarmer(Farmer farmer)
    {
    	em.persist(farmer);
    }

	@Override
	public void updateFarmer(Farmer farmer) {
	em.merge(farmer);
		
	}

	@Override
	public void removeFarmer(Farmer farmer) {
		em.remove(farmer);
		
	}

	@Override
	public Farmer getFarmer(int id) {
		return em.find(Farmer.class, id);
		 
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Farmer> getAllFarmers() {
		String queryt="select u from User u where DTYPE = Farmer";
		Query query=em.createQuery(queryt);
	return	query.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Farmer> getFarmerRequests() {
		String queryt="select u from Farmer u where u.stateRequest = Waiting ";
		Query query=em.createQuery(queryt);
	return	query.getResultList();
	}

	@Override
	public void AffectFarmerUser(Farmer farmer) {
		// TODO Auto-generated method stub
		updateFarmer(farmer);
	}

}

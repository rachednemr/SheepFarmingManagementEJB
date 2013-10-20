package SheepFarmingManagementEJB.services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import SheepFarmingManagementEJB.persistances.entities.Farmer;
import SheepFarmingManagementEJB.persistances.entities.Veterinerian;


/**
 * Session Bean implementation class VeterinarianService
 */
@Stateless
public class VeterinarianService implements VeterinarianServiceRemote {

    /**
     * Default constructor. 
     */
	
	@PersistenceContext
	EntityManager em;
    public VeterinarianService() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void addVet(Veterinerian veterinerian) {
		em.persist(veterinerian);
		
	}

	@Override
	public void updateVet(Veterinerian veterinerian) {
		em.merge(veterinerian);
		
	}

	@Override
	public void removeVet(Veterinerian veterinerian) {
		em.remove(veterinerian);
		
	}

	@Override
	public Veterinerian getVet(int id) {
		return em.find(Veterinerian.class, id);
	}

	@Override
	public List<Veterinerian> getAllVets() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Veterinerian> getVetRequests() {
		String queryt="select u from User u where DTYPE = Veterinerian and stateRequest = Waiting";
		Query query=em.createQuery(queryt);
	return	query.getResultList();
	}

}

package SheepFarmingManagementEJB.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import SheepFarmingManagementEJB.persistances.entities.Farmer;
import SheepFarmingManagementEJB.persistances.entities.shepherd;


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
	@Override
	public shepherd getShepherd(int id) 
	{
		shepherd shepherd1=em.find(shepherd.class, id);// TODO Auto-generated method stub
		return shepherd1;
	}
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
	em.refresh(farmer);
		
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
// implemetation de la methode qui affecte les bergers de chaque eleveur
	/*@Override
	public void AffectFarmershepherd(Farmer farmer) {
		// TODO Auto-generated method stub
		updateFarmer(farmer);
	}

	
	// joiture pour recuperer les berger de chaque eleveur
	@Override
	public List<shepherd> getFarmerJoinShepherd(int iduser) {
		String queryt="select s from user u join u.shepherd s where u.idUser=:iduser ";
		Query query=em.createQuery(queryt).setParameter("iduser", iduser);
	return	query.getResultList();		
	}
*/
}

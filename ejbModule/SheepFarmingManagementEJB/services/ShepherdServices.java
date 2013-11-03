package SheepFarmingManagementEJB.services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.ws.rs.Consumes;


import SheepFarmingManagementEJB.persistances.entities.Farmer;
import SheepFarmingManagementEJB.persistances.entities.shepherd;

/**
 * Session Bean implementation class ShepherdServices
 */

public class ShepherdServices implements ShepherdServicesRemote {
	@PersistenceContext
	EntityManager em; 
    /**
     * Default constructor. 
     */
    public ShepherdServices() {
      
    }

	@Override
	public void addShepherd(shepherd Shepherd) {
		// TODO Auto-generated method stub
		  em.persist(Shepherd);
	}

	@Override
	public void updateShepherd(shepherd Shepherd) {
		// TODO Auto-generated method stub
		em.merge(Shepherd);
	}

	@Override
	public void removeShepherd(shepherd Shepherd) {
		// TODO Auto-generated method stub
		em.remove(Shepherd);
	}

	@Override
	public shepherd getShepherd(int id_Shepherd) {
		// TODO Auto-generated method stub
		shepherd Shepherd=em.find(shepherd.class, id_Shepherd);
		// TODO Auto-generated method stub
		return Shepherd;
		
	}

	@Override
	public List<shepherd> getAllShepherds() {
		// TODO Auto-generated method stub
		String stQuery = "select s from shepherd s";
		Query query = em.createQuery(stQuery);
			return query.getResultList();
		
	}

	@Override
	public List<shepherd> getFarmerJoinShepherd(int iduser) {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public Farmer searchFarmerById(int Id_Farmer) {
		// TODO Auto-generated method stub
		
			return em.find(Farmer.class, Id_Farmer);
			 
		
	}

	@Override
	public void AffectFarmer_shepherd(Farmer farmer) {
		// TODO Auto-generated method stub
		em.persist(farmer);
	}

	@Override
	public void AffecterShepherd_Farmer(shepherd Shepherds) {
		// TODO Auto-generated method stub
		updateShepherd(Shepherds);
	}
// chercher berger par nom et prenom implementation des methodes
	@Override
	public List<shepherd> searchByFirstName(String firstName) {
		firstName = firstName+"%";
		String query="select u from shepHerds u where u.firstName LIKE :firstName ";
	      Query queryU=em.createQuery(query).setParameter("firstName", firstName);
			return queryU.getResultList();
	}
	
	@Override
	public List<shepherd> searchByLastName(String lastName) {
		lastName = lastName+"%";
		String query="select u from shepHerds u where u.lastName LIKE :lastName ";
	      Query queryU=em.createQuery(query).setParameter("lastName", lastName);
			return queryU.getResultList();
	}
}

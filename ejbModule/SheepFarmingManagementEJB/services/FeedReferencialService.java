package SheepFarmingManagementEJB.services;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import SheepFarmingManagementEJB.persistances.entities.Expert;
import SheepFarmingManagementEJB.persistances.entities.FeedReferencial;
/**
 * Session Bean implementation class FeedReferencialService
 */
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


/**
 * Session Bean implementation class FeedReferencialService
 */
@Stateless
@LocalBean
public class FeedReferencialService implements FeedReferencialServiceRemote {

    /**
     * Default constructor. 
     */
	
	@PersistenceContext
	EntityManager em;
    public FeedReferencialService() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void addFeedReferencial(FeedReferencial feedReferencial) {
		em.persist(feedReferencial);
		
	}

	@Override
	public void updateFeedReferencial(FeedReferencial feedReferencial) {
		em.merge(feedReferencial);
		
	}

	@Override
	public void removeFeedReferencial(FeedReferencial feedReferencial) {
		em.remove(feedReferencial);
	}

	@Override
	public FeedReferencial getFeedReferencial(int id) {
		
		return em.find(FeedReferencial.class, id);
	}

	@Override
	public List<FeedReferencial> getAllFeedReferencials() {
		String stQuery = "select u from FeedReferencial u";
		Query query = em.createQuery(stQuery);
			return query.getResultList();
	}

}



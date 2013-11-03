package SheepFarmingManagementEJB.services;

import java.util.List;

import javax.ejb.Remote;
import SheepFarmingManagementEJB.persistances.entities.Expert;
import SheepFarmingManagementEJB.persistances.entities.Expert;
import SheepFarmingManagementEJB.persistances.entities.FeedReferencial;
@Remote
public interface FeedReferencialServiceRemote {

	public void addFeedReferencial(FeedReferencial feedReferencial);
	public void updateFeedReferencial(FeedReferencial feedReferencial);
	public void removeFeedReferencial(FeedReferencial feedReferencial);
	public FeedReferencial getFeedReferencial(int id);
	public List<FeedReferencial> getAllFeedReferencials();
}

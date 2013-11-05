package SheepFarmingManagementEJB.persistances.entities;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: FeedReferencial
 *
 */
@Entity

public class FeedReferencial implements Serializable {
	private Integer id;
	private String type;
	private String composition;
	private Expert expert;
	private FeedCard feedcard;
	private static final long serialVersionUID = 1L;

	public FeedReferencial() {
		super();
	}   
	
	@Id
	@GeneratedValue
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}   
	public String getComposition() {
		return this.composition;
	}

	public void setComposition(String composition) {
		this.composition = composition;
	}

	@ManyToOne
	public Expert getExpert() {
		return expert;
	}

	public void setExpert(Expert expert) {
		this.expert = expert;
	}

	public FeedReferencial(String type, String composition,
			Expert expert) {
		super();
		this.type = type;
		this.composition = composition;
		this.expert = expert;
	}
@ManyToOne
	public FeedCard getFeedcard() {
		return feedcard;
	}

	public void setFeedcard(FeedCard feedcard) {
		this.feedcard = feedcard;
	}
   
	
	
}

package SheepFarmingManagementEJB.persistances.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;
@Entity

public class FeedCard implements Serializable {
	private static final long serialVersionUID = 1L;

	private int Id;
	private String Quantity;
	private Date date ;
	private Expert expert;
	private Herds herd;
	private List<FeedReferencial>feedreferentcials;
	public FeedCard() {
		super();
	}
	public FeedCard(String quantity, Date date) {
		super();
		Quantity = quantity;
		this.date = date;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getQuantity() {
		return Quantity;
	}
	public void setQuantity(String quantity) {
		Quantity = quantity;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@ManyToOne
	public Expert getExpert() {
		return expert;
	}
	public void setExpert(Expert expert) {
		this.expert = expert;
	}
	@ManyToOne
	public Herds getHerd() {
		return herd;
	}
	public void setHerd(Herds herd) {
		this.herd = herd;
	}
	@OneToMany(mappedBy="feedcard")
	public List<FeedReferencial> getFeedreferentcials() {
		return feedreferentcials;
	}
	public void setFeedreferentcials(List<FeedReferencial> feedreferentcials) {
		this.feedreferentcials = feedreferentcials;
	}
	
	

}

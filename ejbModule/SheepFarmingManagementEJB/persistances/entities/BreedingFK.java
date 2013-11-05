package SheepFarmingManagementEJB.persistances.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Embeddable
public class BreedingFK implements Serializable{

	public BreedingFK() {
		super();
	}
	public BreedingFK(Date startdate, Date enddate) {
		super();
		this.startdate = startdate;
		this.enddate = enddate;
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idsheep1;
	private int idsheep2;
	private Date startdate;
	private Date enddate;
	public int getIdsheep1() {
		return idsheep1;
	}
	public void setIdsheep1(int idsheep1) {
		this.idsheep1 = idsheep1;
	}
	public int getIdsheep2() {
		return idsheep2;
	}
	public void setIdsheep2(int idsheep2) {
		this.idsheep2 = idsheep2;
	}
	@Temporal(TemporalType.TIMESTAMP)
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	@Temporal(TemporalType.TIMESTAMP)
	public Date getEnddate() {
		return enddate;
	}
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idsheep1;
		result = prime * result + idsheep2;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BreedingFK other = (BreedingFK) obj;
		if (idsheep1 != other.idsheep1)
			return false;
		if (idsheep2 != other.idsheep2)
			return false;
		return true;
	}

}

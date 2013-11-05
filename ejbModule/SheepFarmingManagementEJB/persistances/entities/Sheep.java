package SheepFarmingManagementEJB.persistances.entities;
import javax.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.OneToMany;
@Entity
public class Sheep implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int Id;
	private String Code;
	private String Id_device;
	private String Status;
	private String Race;
	private String Sexe;
	private String Mather_code;
	private String Father_code;
	private String Inputprice;
	private String Outputprice;
	private Date Inputdate;
	private Date Outputdate;
	private String StatusReason;
	private List<Movement> movements;
	private String StatusReasonDescription;
	private float Iputwaight;
	private float Oputwaight;
	private List<MedicalCard> medicalcards;
	private List<GrowthCard> growthcards;
	private Herds herd;
	public Sheep() {
		super();
	}
	public Sheep(String code, String id_device, String status, String race,
			String sexe, String mather_code, String father_code,
			String inputprice, String outputprice, Date inputdate,
			Date outputdate, String statusReason,
			String statusReasonDescription, float iputwaight, float oputwaight) {
		super();
		Code = code;
		Id_device = id_device;
		Status = status;
		Race = race;
		Sexe = sexe;
		Mather_code = mather_code;
		Father_code = father_code;
		Inputprice = inputprice;
		Outputprice = outputprice;
		Inputdate = inputdate;
		Outputdate = outputdate;
		StatusReason = statusReason;
		StatusReasonDescription = statusReasonDescription;
		Iputwaight = iputwaight;
		Oputwaight = oputwaight;
	}
	//who breed who
	
	private List<Breeding> breedings = new ArrayList<Breeding>();
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getCode() {
		return Code;
	}
	public void setCode(String code) {
		Code = code;
	}
	public String getId_device() {
		return Id_device;
	}
	public void setId_device(String id_device) {
		Id_device = id_device;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getRace() {
		return Race;
	}
	public void setRace(String race) {
		Race = race;
	}
	public String getSexe() {
		return Sexe;
	}
	public void setSexe(String sexe) {
		Sexe = sexe;
	}
	public String getMather_code() {
		return Mather_code;
	}
	public void setMather_code(String mather_code) {
		Mather_code = mather_code;
	}
	public String getFather_code() {
		return Father_code;
	}
	public void setFather_code(String father_code) {
		Father_code = father_code;
	}
	public String getInputprice() {
		return Inputprice;
	}
	public void setInputprice(String inputprice) {
		Inputprice = inputprice;
	}
	public String getOutputprice() {
		return Outputprice;
	}
	public void setOutputprice(String outputprice) {
		Outputprice = outputprice;
	}
	public Date getInputdate() {
		return Inputdate;
	}
	public void setInputdate(Date inputdate) {
		Inputdate = inputdate;
	}
	public Date getOutputdate() {
		return Outputdate;
	}
	public void setOutputdate(Date outputdate) {
		Outputdate = outputdate;
	}
	public String getStatusReason() {
		return StatusReason;
	}
	public void setStatusReason(String statusReason) {
		StatusReason = statusReason;
	}
	public String getStatusReasonDescription() {
		return StatusReasonDescription;
	}
	public void setStatusReasonDescription(String statusReasonDescription) {
		StatusReasonDescription = statusReasonDescription;
	}
	public float getIputwaight() {
		return Iputwaight;
	}
	public void setIputwaight(float iputwaight) {
		Iputwaight = iputwaight;
	}
	public float getOputwaight() {
		return Oputwaight;
	}
	public void setOputwaight(float oputwaight) {
		Oputwaight = oputwaight;
	}
	@OneToMany(mappedBy="sheep1")
	public List<Breeding> getBreedings() {
		return breedings;
	}
	public void setBreedings(List<Breeding> breedings) {
		this.breedings = breedings;
	}
	@OneToMany(mappedBy="sheep")
	public List<GrowthCard> getGrowthcards() {
		return growthcards;
	}
	public void setGrowthcards(List<GrowthCard> growthcards) {
		this.growthcards = growthcards;
	}
	@ManyToOne
	public Herds getHerd() {
		return herd;
	}
	public void setHerd(Herds herd) {
		this.herd = herd;
	}
	@OneToMany(mappedBy="sheep")
	public List<MedicalCard> getMedicalcards() {
		return medicalcards;
	}
	public void setMedicalcards(List<MedicalCard> medicalcards) {
		this.medicalcards = medicalcards;
	}
	@OneToMany(mappedBy="sheep")
	public List<Movement> getMovements() {
		return movements;
	}
	public void setMovements(List<Movement> movements) {
		this.movements = movements;
	}
	
	
	

}

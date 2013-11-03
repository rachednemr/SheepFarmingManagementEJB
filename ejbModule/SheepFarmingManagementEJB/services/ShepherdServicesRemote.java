package SheepFarmingManagementEJB.services;

import java.util.List;

import javax.ejb.Remote;

import SheepFarmingManagementEJB.persistances.entities.Farmer;
import SheepFarmingManagementEJB.persistances.entities.shepherd;
// interface distante contient les crudes
@Remote
public interface ShepherdServicesRemote {
	// ajouter un berger
	
	
	public void addShepherd(shepherd Shepherd);
	// manipuler les information d'un berger
	public void updateShepherd(shepherd Shepherd);
	// supprimer un berger
	public void removeShepherd(shepherd Shepherd);
	// recherche des berger par identifiant
	public shepherd getShepherd(int id);
	// recuperer la liste des bergers

	public List<shepherd> getAllShepherds();
	public List<shepherd> getFarmerJoinShepherd(int iduser);
	//affecter les berger pour chaque eleveur
	public void AffectFarmer_shepherd(Farmer farmer);
    public void AffecterShepherd_Farmer(shepherd Shepherds);
    public Farmer searchFarmerById(int Id_Farmer);
    //chercher berger  par nom et par prenom  

    public List<shepherd> searchByFirstName(String firstName);
    public List<shepherd> searchByLastName(String lastName);
	
}

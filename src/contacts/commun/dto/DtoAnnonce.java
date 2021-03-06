package contacts.commun.dto;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

import contacts.commun.util.Statute;

public class DtoAnnonce implements Serializable {

	private int          	idAnnonce;
	private String 			titre;
	private String 			description;
	private Statute         statute;
	private Date       dateDebut;
	private Date       dateFin;
	private Time       heureDebut;
	private Time       heureFin;
	private String 			lieuNom;
	private String  		lieuAdresse;
	private String 			lieuCp;
	private String 			lieuVille;
	private String 			animateurNom;
	private String 			animateurQualification;
	private String 			organisateurNom;
	private String 			organisateurSiteWeb;
	private String 			organisateurEmail;
	private String			organisateurTelephone;

	private DtoAnnonceur	annonceur = new DtoAnnonceur();
	private DtoRubrique    rubrique  = new DtoRubrique();
	private DtoZone		zone      = new DtoZone();
	private DtoCategorie   categorie = new DtoCategorie();

	public DtoAnnonce(){

	}

	public DtoAnnonce(int idAnnonce,String titre,String description,String statute,Date dateDebut,Date dateFin,Time heureDebut,Time heureFin,
			String lieuNom,String lieuAdresse,String lieuCp,String lieuVille,String animateurNom,String animateurQualification,String organisateurNom,
			String organisateurSiteWeb,String organisateurEmail,String organisateurTelephone)
	{
		this.setIdAnnonce(idAnnonce);
		this.setTitre(titre);
		this.setDescription(description);
		this.setStatute(statute);
		this.setDateDebut(dateDebut);
		this.setDateFin(dateFin);
		this.setHeureDebut(heureDebut);
		this.setHeureFin(heureFin);
		this.setLieuNom(lieuNom);
		this.setLieuAdresse(lieuAdresse);
		this.setLieuCp(lieuCp);
		this.setLieuVille(lieuVille);
		this.setAnimateurNom(animateurNom);
		this.setAnimateurQualification(animateurQualification);
		this.setOrganisateurNom(organisateurNom);
		this.setOrganisateurSiteWeb(organisateurSiteWeb);
		this.setOrganisateurEmail(organisateurEmail);
		this.setOrganisateurTelephone(organisateurTelephone);


	}

	public int getIdAnnonce() {
		return idAnnonce;
	}
	public void setIdAnnonce(int idAnnonce) {
		this.idAnnonce = idAnnonce;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Statute getStatute() {
		return statute;
	}
	public void setStatute(String statute) {
		this.statute=Statute.valueOf(statute);
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public Time getHeureDebut() {
		return heureDebut;
	}
	public void setHeureDebut(Time heureDebut) {
		this.heureDebut = heureDebut;
	}
	public Time getHeureFin() {
		return heureFin;
	}
	public void setHeureFin(Time heureFin) {
		this.heureFin = heureFin;
	}
	public String getLieuNom() {
		return lieuNom;
	}
	public void setLieuNom(String lieuNom) {
		this.lieuNom = lieuNom;
	}
	public String getLieuAdresse() {
		return lieuAdresse;
	}
	public void setLieuAdresse(String lieuAdresse) {
		this.lieuAdresse = lieuAdresse;
	}
	public String getLieuCp() {
		return lieuCp;
	}
	public void setLieuCp(String lieuCp) {
		this.lieuCp = lieuCp;
	}
	public String getLieuVille() {
		return lieuVille;
	}
	public void setLieuVille(String lieuVille) {
		this.lieuVille = lieuVille;
	}
	public String getAnimateurNom() {
		return animateurNom;
	}
	public void setAnimateurNom(String animateurNom) {
		this.animateurNom = animateurNom;
	}
	public String getAnimateurQualification() {
		return animateurQualification;
	}
	public void setAnimateurQualification(String animateurQualification) {
		this.animateurQualification = animateurQualification;
	}
	public String getOrganisateurNom() {
		return organisateurNom;
	}
	public void setOrganisateurNom(String organisateurNom) {
		this.organisateurNom = organisateurNom;
	}
	public String getOrganisateurSiteWeb() {
		return organisateurSiteWeb;
	}
	public void setOrganisateurSiteWeb(String organisateurSiteWeb) {
		this.organisateurSiteWeb = organisateurSiteWeb;
	}
	public String getOrganisateurEmail() {
		return organisateurEmail;
	}
	public void setOrganisateurEmail(String organisateurEmail) {
		this.organisateurEmail = organisateurEmail;
	}
	public String getOrganisateurTelephone() {
		return organisateurTelephone;
	}
	public void setOrganisateurTelephone(String organisateurTelephone) {
		this.organisateurTelephone = organisateurTelephone;
	}
	public DtoAnnonceur getAnnonceur() {
		return annonceur;
	}
	public void setAnnonceur(DtoAnnonceur annonceur) {
		this.annonceur = annonceur;
	}
	public DtoRubrique getRubrique() {
		return rubrique;
	}
	public void setRubrique(DtoRubrique rubrique) {
		this.rubrique = rubrique;
	}
	public DtoZone getZone() {
		return zone;
	}
	public void setZone(DtoZone zone) {
		this.zone = zone;
	}

	public DtoCategorie getCategorie() {
		return categorie;
	}

	public void setCategorie(DtoCategorie categorie) {
		this.categorie = categorie;
	}


}

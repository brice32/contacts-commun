package contacts.commun.service;

import java.util.List;

import contacts.commun.dto.DtoAnnonceur;
import contacts.commun.dto.DtoMouvement;
import contacts.commun.util.ExceptionAppli;


public interface IServiceMouvement {

	int				inserer( DtoMouvement dtoMouvement ) throws ExceptionAppli;

	void			modifier( DtoMouvement dtoMouvement ) throws ExceptionAppli;

	void			supprimer( int idMouvement ) throws ExceptionAppli;

	DtoAnnonceur 	retrouver( int idMouvement ) throws ExceptionAppli;

	List<DtoMouvement> listerTout() throws ExceptionAppli;

	DtoMouvement retrouverIdannonceur(int idAnnonceur) throws ExceptionAppli;

	List<DtoMouvement> retouverListe(int idAnnonceur) throws ExceptionAppli;

}

package contacts.commun.service;

import java.util.List;

import contacts.commun.dto.DtoAnnonce;
import contacts.commun.util.ExceptionAppli;


public interface IServiceAnnonce {

	List<DtoAnnonce> listerTout() throws ExceptionAppli;

	DtoAnnonce retrouver(int idAnnonce) throws ExceptionAppli;

	int inserer(DtoAnnonce dtoAnnonce) throws ExceptionAppli;

	void supprimer(int idAnnonce) throws ExceptionAppli;

	void modifier(DtoAnnonce dtoannonce) throws ExceptionAppli;

}

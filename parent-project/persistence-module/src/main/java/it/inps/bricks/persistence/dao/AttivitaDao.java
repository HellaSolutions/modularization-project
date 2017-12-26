package it.inps.bricks.persistence.dao;
// Generated 24-gen-2017 15.12.26 by Hibernate Tools 4.3.2-SNAPSHOT

/**
 * Hibernate Dao object for domain model class Attivita.
 * @see it.inps.bricks.model.Attivita
 * @author Paola Greco
 */
import it.inps.bricks.model.Attivita;
import  it.inps.bricks.model.dao.GenericDao;

public interface AttivitaDao extends GenericDao<Attivita, java.lang.Integer>{

	void updateEffort(Attivita attivita, int i);
	int getResidualEffort(Attivita attivita);

}

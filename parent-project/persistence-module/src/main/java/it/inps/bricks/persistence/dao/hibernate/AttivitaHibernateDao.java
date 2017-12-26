package it.inps.bricks.persistence.dao.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.hibernate.transform.Transformers;
/**
 * Hibernate Dao object for domain model class Attivita.
 * @see it.inps.bricks.model.Attivita
 * @author Paola Greco
*/
import org.springframework.stereotype.Repository;

import it.inps.bricks.model.Attivita;
import it.inps.bricks.model.dao.hibernate.HibernateDao;
import it.inps.bricks.persistence.aspect.EnableTraceTime;
import it.inps.bricks.persistence.dao.AttivitaDao;

@Repository("attivitaDao")
@EnableTraceTime 
@SuppressWarnings("unchecked")
public class AttivitaHibernateDao extends HibernateDao<Attivita, java.lang.Integer> 
	implements AttivitaDao {

	public List<Attivita> getAttivita() {

		Criteria cr = currentSession().createCriteria(Attivita.class)
				.setProjection(Projections.projectionList().add(Projections.property("id"), "id")
						.add(Projections.property("nomeScheda"), "nomeScheda"))
				.setResultTransformer(Transformers.aliasToBean(Attivita.class));
		return cr.list();

	}

	@Override
	public void updateEffort(Attivita attivita, int i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getResidualEffort(Attivita attivita) {
		// TODO Auto-generated method stub
		return 0;
	}
}
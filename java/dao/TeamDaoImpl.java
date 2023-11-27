package dao;

import static utils.HibernateUtils.getFactory;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojos.Team;

public class TeamDaoImpl implements TeamDao{

	@Override
	public List<String> getAllTeamAbbreviation() {
		List<String> abbreviation=null;
		String jpql="select t. abbreviation from Team t";
		Session session =getFactory().getCurrentSession();
		Transaction tx=session.beginTransaction();
		try {
			abbreviation=session.createQuery(jpql,String.class).getResultList();
			tx.commit();
		}
		catch(RuntimeException r) {
		if(tx!=null) {
			throw r;
		}
		}
		return abbreviation;
	}

	
		
	

}

package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import  static utils.HibernateUtils.getFactory;
import pojos.Team;

public interface TeamDao {
	//Add abbreviation of all team
	List<String> getAllTeamAbbreviation();

}

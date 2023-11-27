package beans;

import java.sql.SQLException;
import java.util.List;

import dao.TeamDaoImpl;
import pojos.Team;

public class TeamBean {
//state : dep : dao
	private TeamDaoImpl teamDao;
	public TeamBean() {
		//dao instace
		teamDao=new TeamDaoImpl();
		System.out.println("IPL bean created...");
		
	}
//	//getters n setters
//	public TeamDaoImpl getTeamDao() {
//		return teamDao;
//	}
//	public void setTeamDao(TeamDaoImpl teamDao) {
//		this.teamDao = teamDao;
//	}
//	//add B.L method to ret list of all teams to the caller(JSP)
public List<String> getTeamAbbreviation(){
	return teamDao.getAllTeamAbbreviation();
}
//process_form	
	
}

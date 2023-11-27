package pojos;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
/*
 * id , name, abbreviation,owner,max_age,batting_avg,wickets_taken	
 */
@Entity
@Table(name="teams")
public class Team extends BaseEntity{
//	private int teamId;//PK
	//// abbreviation
	private String name;
	private String  abbreviation;
	private String owner;
	private int maxAge;
	private double minBattingAvg;
	private int minWicketsTaken;
	//Add Association property
	//team1-->*player
	@OneToMany(mappedBy="myTeam")
	private List<Player> players=new ArrayList();
	
	public Team() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Team( String name, String abbreviation, String owner, int maxAge, double minBattingAvg,
			int minWicketsTaken) {
		super();
//		this.teamId = teamId;
		this.name = name;
		this.abbreviation = abbreviation;
		this.owner = owner;
		this.maxAge = maxAge;
		this.minBattingAvg = minBattingAvg;
		this.minWicketsTaken = minWicketsTaken;
	}
public void addPalyer(Player p) {
	players.add(p);
	p.setMyTeam(this);
}

//	public int getTeamId() {
//		return teamId;
//	}
//	public void setTeamId(int teamId) {
//		this.teamId = teamId;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAbbreviation() {
		return abbreviation;
	}
	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getMaxAge() {
		return maxAge;
	}
	public void setMaxAge(int maxAge) {
		this.maxAge = maxAge;
	}
	public double getMinBattingAvg() {
		return minBattingAvg;
	}
	public void setMinBattingAvg(double minBattingAvg) {
		this.minBattingAvg = minBattingAvg;
	}
	public int getMinWicketsTaken() {
		return minWicketsTaken;
	}
	public void setMinWicketsTaken(int minWicketsTaken) {
		this.minWicketsTaken = minWicketsTaken;
	}
	@Override
	public String toString() {
		return "Team [teamId=" +  ", name=" + name + ", abbreviation=" + abbreviation + ", owner=" + owner
				+ ", maxAge=" + maxAge + ", minBattingAvg=" + minBattingAvg + ", minWicketsTaken=" + minWicketsTaken
				+ "]";
	}
	
}

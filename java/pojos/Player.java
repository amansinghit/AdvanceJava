package pojos;
/*
 * id , first_name,last_name, dob,batting_avg,wickets_taken....
+team_id 
 */

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="players")
public class Player extends BaseEntity{
	
	private int playerId;//PK
	@Column(length = 20, name = "first_name")
	private String firstName;
	@Column(length = 20, name = "last_name")
	private String lastName;
	private Date dob;
	@Column(name = "batting_avg")
	private double battingAvg;
	@Column(name = "wickets_taken")
	private int wicketsTaken;
//player-->team
	@ManyToOne
	@JoinColumn(name="team_id",nullable=false)
	private Team myTeam;
	public Player() {
		
	}
	public Player(String firstName, String lastName, Date dob, double battingAvg, int wicketsTaken, int teamId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.battingAvg = battingAvg;
		this.wicketsTaken = wicketsTaken;
		
	}
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public double getBattingAvg() {
		return battingAvg;
	}
	public void setBattingAvg(double battingAvg) {
		this.battingAvg = battingAvg;
	}
	public int getWicketsTaken() {
		return wicketsTaken;
	}
	public void setWicketsTaken(int wicketsTaken) {
		this.wicketsTaken = wicketsTaken;
	}
	
	public void setMyTeam(Team myTeam) {
		this.myTeam = myTeam;
	}
	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob
				+ ", battingAvg=" + battingAvg + ", wicketsTaken=" + wicketsTaken + ", teamId  ]";
	}
	
	
}

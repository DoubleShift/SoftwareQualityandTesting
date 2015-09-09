/**
 * 
 */
package wiiTennis;

import java.util.List;

/**
 * @author double
 *
 */
public class Player {

	/**
	 * 
	 */
	
	public String playerName;
	public int score;
	private static final String[] expression = { "love","15", "30", "40"};  

	public Player(String name) {
		this.playerName = name;
		this.score = 0;
		
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getExpression() {
		return this.expression[this.score];
	}

	public int getScore(){
		return this.score;
	}
	// won a point
	public void addScore() {
		this.score += 1;
	}
	
	

}

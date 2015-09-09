package wiiTennis;

import java.util.ArrayList;

public class Operator {

	private ArrayList<Player> players;
	
	public Operator() {
		this.players = new ArrayList();
	}
	
	public boolean addPlayer(String name){
		
		if(this.players.size() > 2){
			return false;
		}
		
		Player player = new Player(name);
		this.players.add(player);
		return true;

	}
	
	public void winPoint(int i){
		this.players.get(i).addScore();
	}
	
	public String getResult(){
		if(this.players.size() < 2){
			return "Please add players.";
		}
		
		//compare result
		Player playerA = this.players.get(0);
		Player playerB = this.players.get(1);
		
		// Deuce
		if(playerA.getScore() == 3 &&playerB.getScore() == 3){
			return "Deuce";
			
		}
		
		//playerA win or advantage
		if(playerA.getScore() == 4){
			
			if(playerB.getScore() < 3 ){
				return "PlayerA win";
			}else{
				return "PlayerA advantage";
			}
		}
		
		//playerB win or advantage
		if(playerB.getScore() == 4){
			if(playerA.getScore() < 3){
				return "PlayerB win";
			}else{
				return "PlayerB advantage";
			}
		}
		
		return "PlayerA:"+playerA.getExpression() +"    PlayerB:"+playerB.getExpression() ;
	}
}

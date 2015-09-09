package wiiTennis;

import static org.junit.Assert.*;

import org.junit.Test;

public class testOperator {

	@Test
	public void test_playerA_win() {
		Operator game = new Operator();
		game.addPlayer("A");
		game.addPlayer("B");
		
		game.winPoint(0);
		assertEquals("PlayerA:15    PlayerB:love",game.getResult());
		
		game.winPoint(1);
		assertEquals("PlayerA:15    PlayerB:15",game.getResult());
		
		game.winPoint(0);
		assertEquals("PlayerA:30    PlayerB:15",game.getResult());
		
		game.winPoint(0);
		assertEquals("PlayerA:40    PlayerB:15",game.getResult());
		
		game.winPoint(0);
		assertEquals("PlayerA win",game.getResult());
	}
	
	@Test
	public void test_playerA_advantage() {
		Operator game = new Operator();
		game.addPlayer("A");
		game.addPlayer("B");
		
		game.winPoint(0);		
		game.winPoint(0);		
		game.winPoint(0);		
		game.winPoint(0);
		game.winPoint(1);		
		game.winPoint(1);		
		game.winPoint(1);
		assertEquals("PlayerA advantage",game.getResult());
	}
	
	@Test
	public void test_deuce() {
		Operator game = new Operator();
		game.addPlayer("A");
		game.addPlayer("B");
		
		game.winPoint(0);		
		game.winPoint(0);		
		game.winPoint(0);		
		game.winPoint(1);		
		game.winPoint(1);		
		game.winPoint(1);
		assertEquals("Deuce",game.getResult());
	}

}

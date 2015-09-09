package wiiTennis;

import static org.junit.Assert.*;

import org.junit.Test;

public class testPlayer {

	@Test
	public void test_get_name() {
		Player playerA = new Player("A");
		assertEquals("A",playerA.getPlayerName());
	}

	@Test
	public void test_get_score() {
		Player playerA = new Player("A");
		playerA.addScore();
		assertEquals(1,playerA.getScore());
	}
	
	@Test
	public void test_get_expression() {
		Player playerA = new Player("A");
		assertEquals("love",playerA.getExpression());
		playerA.addScore();
		assertEquals("15",playerA.getExpression());
	}
}

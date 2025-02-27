package conway;

import org.junit.BeforeClass;
import org.junit.Test;

public class Conway25JavaTest {

	private static Life life;
	private static LifeController cc;
	
	@BeforeClass
	public static void setup() {
		System.out.println("inizio setup");
		
		life           = new Life( 3,3 );
        cc   = new LifeController(life);
	}
	
	@Test
	public void test1() {
		System.out.println("inizio test 1");
		cc.displayGrid();
		
		life.switchCellState(1, 0);
		life.switchCellState(1, 1);
		life.switchCellState(1, 2);
		
		life.computeNextGen();
		
		cc.displayGrid();
	}

}

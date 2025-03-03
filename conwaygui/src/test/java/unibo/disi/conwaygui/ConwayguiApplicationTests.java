package unibo.disi.conwaygui;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConwayguiApplicationTests {

	private static Life life, life2;
	private static LifeController cc;
	
	@BeforeClass
	public static void setup() {
		System.out.println("inizio setup");
		
		life           = new Life( 3,3 );
        cc   = new LifeController(life);

		life2           = new Life( 3,3 );
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
		
		life2.switchCellState(0, 1);
		life2.switchCellState(1, 1);
		life2.switchCellState(2, 1);
		assertEquals(life2, life);
	}
	
	@Test
	public void test2() {
		System.out.println("inizio test 1");
		cc.displayGrid();
		
		life.computeNextGen();
		
		cc.displayGrid();
		
		assertEquals(life2, life);
	}
	
	@Test
	public void test3() {
		System.out.println("inizio test 1");
		
		life.switchCellState(0, 0);
		life.switchCellState(0, 1);
		life.switchCellState(0, 2);
		life.switchCellState(1, 0);
		life.switchCellState(1, 1);
		life.switchCellState(1, 2);
		life.switchCellState(2, 0);
		life.switchCellState(2, 1);
		life.switchCellState(2, 2);
		cc.displayGrid();
		
		life.computeNextGen();
		System.out.println("---------------------------------------------");
		
		cc.displayGrid();
		
		life2.switchCellState(0, 1);
		life2.switchCellState(0, 2);
		life2.switchCellState(2, 0);
		life2.switchCellState(2, 2);
		assertEquals(life2, life);
	}


}

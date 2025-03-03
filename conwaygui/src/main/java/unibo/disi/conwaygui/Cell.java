package unibo.disi.conwaygui;

public class Cell {
	private boolean alive;

	public Cell(boolean alive) {
		this.alive = alive;
	}

	protected boolean isAlive() {
		return alive;
	}

	protected void setAlive(boolean alive) {
		this.alive = alive;
	} 
	
	protected void switchState() {
		this.alive = !this.alive;
	}
	
}

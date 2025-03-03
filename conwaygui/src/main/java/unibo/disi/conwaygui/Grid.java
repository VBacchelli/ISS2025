package unibo.disi.conwaygui;

public class Grid {

	private int rows=0;
    private int cols=0;
    private Cell[][] cells;
    
    public Grid( int rowsNum, int colsNum ) {
        this.rows   = rowsNum;
        this.cols   = colsNum;
        this.cells = new Cell[rows][cols];
        for(int i=0; i<rows; i++) {
        	for(int j=0; j<cols; j++) {
        		cells[i][j]=new Cell(false);
        	}
        }
    }

    public int getRowsNum(){
        return rows;
    }
    
    public int getColsNum(){
        return cols;
    }
    
    public boolean isCellAlive(int row, int col) {
    	return cells[row][col].isAlive();
    }
    
    protected void setCellState(int row, int col, boolean state) {
    	this.cells[row][col].setAlive(state);
    }
    
    protected void resetGrid() {
        for (int i = 0; i < rows; i++) {
           for (int j = 0; j < cols; j++) {
               this.cells[i][j].setAlive(false);
           }
        }
    }
    
    protected int countNeighborsLive(int row, int col) {
        int count = 0;
        if (row-1 >= 0) {
            if (cells[row-1][col].isAlive()) count++;
        }
        if (row-1 >= 0 && col-1 >= 0) {
            if (cells[row-1][col-1].isAlive()) count++;
        }
        if (row-1 >= 0 && col+1 < cols) {
            if (cells[row-1][col+1].isAlive()) count++;
        }
        if (col-1 >= 0) {
            if (cells[row][col-1].isAlive()) count++;
        }
        if (col+1 < cols) {
            if (cells[row][col+1].isAlive()) count++;
        }
        if (row+1 < rows) {
            if (cells[row+1][col].isAlive()) count++;
        }
        if (row+1 < rows && col-1 >= 0) {
            if (cells[row+1][col-1].isAlive()) count++;
        }
        if (row+1 < rows && col+1 < cols) {
            if (cells[row+1][col+1].isAlive()) count++;
        }
        return count;
    }
    
    protected void switchCellState(int i, int j) {
    	this.cells[i][j].switchState();
    }
    
}

package conway;

import java.util.Objects;

/*
 * Il core di game of life
 * Non ha dipendenze da dispositivi di input/output
 * Non ha regole di controllo del gioco 
 */

public class Life {
    //La struttura
    private int rows=0;
    private int cols=0;
    private static Grid grid;
    private static Grid nextGrid;
 
    public Life( int rowsNum, int colsNum ) {
        this.rows   = rowsNum;
        this.cols   = colsNum;
    }

    public int getRowsNum(){
        return rows;
    }
    public int getColsNum(){
        return cols;
    }

    protected void  createGrids() {
        grid     = new Grid(rows, cols);
        nextGrid = new Grid(rows, cols); 
    }

    protected void resetGrids() {
         grid.resetGrid();
         nextGrid.resetGrid();
    }

    protected void computeNextGen() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int n = grid.countNeighborsLive(i,j);
                applyRules(i, j, n); 
            }
        }
        copyAndResetGrid();
    }

    protected void copyAndResetGrid() {
    	for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid.setCellState(i, j, nextGrid.isCellAlive(i, j));
                //outdev.displayCell( ""+grid[i][j] );
            }
        }
        nextGrid.resetGrid();
    }

    protected void applyRules(int row, int col, int numNeighbors) {
        //int numNeighbors = countNeighborsLive(row, col);
        //CELLA VIVA
        if (grid.isCellAlive(row, col)) {
            if (numNeighbors < 2) { //muore per isolamento
                nextGrid.setCellState(row, col, false);
            } else if (numNeighbors == 2 || numNeighbors == 3) { //sopravvive
                nextGrid.setCellState(row, col, true);
            } else if (numNeighbors > 3) { //muore per sovrappopolazione
                nextGrid.setCellState(row, col, false);
            }
        }
        //CELLA MORTA
        else if (!grid.isCellAlive(row, col)) {
            if (numNeighbors == 3) { //riproduzione
                nextGrid.setCellState(row, col, true);;
            }
        }
        //CommUtils.outgreen("Life applyRules " + nextGrid   );
    }

    public void switchCellState(int i, int j){
        grid.switchCellState(i,j);  
    }

    public  boolean isCellAlive( int i, int j  ) {
        return   grid.isCellAlive(i, j);
    }

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Life other = (Life) obj;
		return cols == other.cols && rows == other.rows;
	}
 
    


}

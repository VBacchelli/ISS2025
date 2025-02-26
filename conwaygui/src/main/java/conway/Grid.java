package conway;

public class Grid {

	private int rows=0;
    private int cols=0;
    private Cell[][] cells;
    
    public Grid( int rowsNum, int colsNum ) {
        this.rows   = rowsNum;
        this.cols   = colsNum;
        cells = new Cell[rows][cols];
    }

    public int getRowsNum(){
        return rows;
    }
    
    public int getColsNum(){
        return cols;
    }

}

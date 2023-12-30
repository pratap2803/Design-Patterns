package UseCasesOfLLD.ChessGame;

public class Board {

    Cell[][] cells;

    public Board(){
        this.resetBoard();
    }
    public Cell getCell(int x, int y){
        if(x<0 || x > 7 || y<0 || y>7){
            //throw new Exception("index out of bound");
        }
        return cells[x][y];
    }

    private void resetBoard() {
        cells[0][0] = new Cell(0, 0, new Rook(true));
        cells[0][1] = new Cell(0, 1, new Knight(true));
        cells[0][2] = new Cell(0, 2, new Bishop(true));
        //...
        cells[1][0] = new Cell(1, 0, new Pawn(true));
        cells[1][1] = new Cell(1, 1, new Pawn(true));
        //...

        // initialize black pieces
        cells[7][0] = new Cell(7, 0, new Rook(false));
        cells[7][1] = new Cell(7, 1, new Knight(false));
        cells[7][2] = new Cell(7, 2, new Bishop(false));
        //...
        cells[6][0] = new Cell(6, 0, new Pawn(false));
        cells[6][1] = new Cell(6, 1, new Pawn(false));
        //...

        // initialize remaining cells without any piece
        for (int i = 2; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                cells[i][j] = new Cell(i, j, null);
            }
        }
    }
}

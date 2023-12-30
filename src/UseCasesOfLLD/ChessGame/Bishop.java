package UseCasesOfLLD.ChessGame;
public class Bishop extends Piece{
    public Bishop(boolean white) {
        super(white);
    }

    @Override
    public boolean canMove(Board board, Cell start, Cell end) {
        return false;
    }
}

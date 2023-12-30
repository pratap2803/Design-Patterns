package UseCasesOfLLD.ChessGame;
public class Pawn extends Piece {
    public Pawn(boolean white) {
        super(white);
    }

    @Override
    public boolean canMove(Board board, Cell start, Cell end) {
        return false;
    }
}

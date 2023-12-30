package UseCasesOfLLD.ChessGame;
public class Rook extends Piece {
    public Rook(boolean white) {
        super(white);
    }

    @Override
    public boolean canMove(Board board, Cell start, Cell end) {
        return false;
    }
}

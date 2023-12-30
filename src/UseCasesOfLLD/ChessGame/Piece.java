package UseCasesOfLLD.ChessGame;

public abstract class Piece {
    private boolean killed = false;
    private boolean white = false;

    public Piece(boolean white) {
        this.white = white;
    }
    public boolean isWhite() {
        return this.white == true;
    }

    public boolean isKilled() {
        return killed;
    }

    public void setKilled(boolean killed) {
        this.killed = killed;
    }

    public void setWhite(boolean white) {
        this.white = white;
    }

    public abstract boolean canMove(Board board, Cell start, Cell end);
}

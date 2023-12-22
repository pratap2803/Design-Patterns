package UseCasesOfLLD.TicTacToe;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {
    Deque<Player> players;
    Board gameBoard;
    public  TicTacToeGame(){
        initializeGame();
    }

    private void initializeGame() {
        // creating for 2 players
        players = new LinkedList<>();
        PlayingPieceX crossPiece = new PlayingPieceX();
        Player player1 = new Player("Player1", crossPiece);

        PlayingPieceO noughtsPiece = new PlayingPieceO();
        Player player2= new Player("Player2", noughtsPiece);

        players.add(player1);
        players.add(player2);

        //intializeBoard
        gameBoard = new Board(3);
    }

    public String startGame(){
        boolean noWinner = true;
        while(noWinner){

            // take out the player whose turn is and also put it back in the list again
            Player playerturn = players.removeFirst();

            //get free space from the board
            gameBoard.printBoard();
            List<Pair> freeSpaces = gameBoard.getFreeCells();
            if(freeSpaces.isEmpty()){
                noWinner = false;
                continue;
            }

            // read the input
            System.out.println("Player:" + playerturn.name + " Enter row, column->  ");
            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputColumn = Integer.valueOf(values[1]);

            // place the piece
            boolean pieceAddedSuccessfully = gameBoard.adPiece(inputRow, inputColumn, playerturn.playingPiece);
            if(!pieceAddedSuccessfully){
                // player can not insert the piece into this cell, player has to choose another cell
                System.out.println("Incorrect position chose, try again");
                players.addFirst(playerturn);
                continue;
            }
            players.addLast(playerturn);

            boolean winner = isThereWinner(inputRow, inputColumn, playerturn.playingPiece.pieceType);
            if(winner){
                return playerturn.name;
            }
        }
        return "tie";
    }

    private boolean isThereWinner(int row, int column, PieceType pieceType) {
        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        // need to check in row
        for(int i=0; i< gameBoard.size; i++){
            if(gameBoard.board[row][i] == null || gameBoard.board[row][i].pieceType!=pieceType){
                rowMatch = false;
            }
        }

        // need to check in column
        for(int i=0; i<gameBoard.size; i++){
            if(gameBoard.board[i][column] ==null || gameBoard.board[i][column].pieceType!=pieceType){
                columnMatch = false;
            }
        }

        // need to check diagonals
        for(int i = 0, j=0; i<gameBoard.size; i++, j++){
            if(gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType!=pieceType){
                diagonalMatch = false;
            }
        }
        // need to check anti-diagonals
        for(int i = 0, j= gameBoard.size-1; i<gameBoard.size; i++, j--){
            if(gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType!=pieceType){
                antiDiagonalMatch = false;
            }
        }
        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }
}

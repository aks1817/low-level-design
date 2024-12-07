import Model.*;
import com.sun.tools.javac.util.Pair;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {
    Deque<Player> players;
    Board gameBoard;

    public void initializeGame() {
        players = new ArrayDeque<>();
        PlayingPieceX crossPiece = new PlayingPieceX();
        PlayingPieceO noughtPiece = new PlayingPieceO();

        Player player1=new Player("Alice",crossPiece);
        Player player2=new Player("Bob",noughtPiece);

        players.add(player1);
        players.add(player2);

        gameBoard=new Board(3);
    }

    public String startGame() {
        boolean noWinner=true;
        while(noWinner) {
            Player playerTurn=players.remove();
            gameBoard.printBoard();

            List<Pair<Integer,Integer>> freeSpaces=gameBoard.getFreeCells();
            if(freeSpaces.isEmpty()){
                noWinner=false;
                continue;
            }

            System.out.println("Player: "+playerTurn.getName() + "Enter row, column: ");
            Scanner scanner=new Scanner(System.in);
            String s=scanner.nextLine();
            String [] values=s.split(",");
            int inputRow=Integer.parseInt(values[0]);
            int inputCol=Integer.parseInt(values[1]);

            boolean pieceAddedSuccessfully= gameBoard.addPiece(inputRow,inputCol,playerTurn.getPlayingPiece());
            if(!pieceAddedSuccessfully){
                System.out.println("Incorrect position chosen, try again");
                players.add(playerTurn);
                continue;
            }

            players.add(playerTurn);
            boolean winner=isThereWinner(inputRow,inputCol,playerTurn.getPlayingPiece().pieceType);
            if(winner){
                return playerTurn.getName();
            }

        }
        return "tie";
    }

    public boolean isThereWinner(int row, int column, PieceType pieceType) {

        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        //need to check in row
        for(int i=0;i<gameBoard.size;i++) {

            if(gameBoard.board[row][i] == null || gameBoard.board[row][i].pieceType != pieceType) {
                rowMatch = false;
            }
        }

        //need to check in column
        for(int i=0;i<gameBoard.size;i++) {

            if(gameBoard.board[i][column] == null || gameBoard.board[i][column].pieceType != pieceType) {
                columnMatch = false;
            }
        }

        //need to check diagonals
        for(int i=0, j=0; i<gameBoard.size;i++,j++) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) {
                diagonalMatch = false;
            }
        }

        //need to check anti-diagonals
        for(int i=0, j=gameBoard.size-1; i<gameBoard.size;i++,j--) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) {
                antiDiagonalMatch = false;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }

}

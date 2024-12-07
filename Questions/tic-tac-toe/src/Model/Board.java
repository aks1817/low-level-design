package Model;

import java.util.ArrayList;
import java.util.List;
import com.sun.tools.javac.util.Pair;

public class Board {
    public int size;
    public PlayingPiece[][] board;
    public Board(int size) {
        this.size = size;
        this.board = new PlayingPiece[size][size];
    }

    public boolean addPiece(int row, int col, PlayingPiece playingPiece) {
        if(board[row][col] != null) {
            return false;
        }
        board[row][col] = playingPiece;
        return true;
    }
    public List<Pair<Integer,Integer>> getFreeCells() {
        List<Pair<Integer,Integer>> freeCells = new ArrayList<>();

        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                if(board[i][j] == null) {
                    freeCells.add(new Pair<Integer,Integer>(i, j));
                }
            }
        }

        return freeCells;
    }

    public void printBoard() {
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                if(board[i][j] != null) {
                    System.out.print(board[i][j].toString() + " ");
                }else {
                    System.out.print("NULL");
                }
            }
            System.out.println(" | ");
        }
        System.out.println();
    }


}

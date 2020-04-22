package main;

import static main.BoardFields.*;

public class Board {

    public void draw(){
        char[][] gameBoard = createGameboard();
        printGameBoard(gameBoard);
    }

    public void makeAMove(Field field, char sign){
        field.setValue(sign);
    }

    private char[][] createGameboard() {
        return new char[][]{
                {TOP_LEFT.value(), '|', TOP_MIDDLE.value(), '|', TOP_RIGHT.value()},
                {'-', '+', '-', '+', '-'},
                {MIDDLE_LEFT.value(), '|', CENTER.value(), '|', MIDDLE_RIGHT.value()},
                {'-', '+', '-', '+', '-'},
                {BOTTOM_LEFT.value(), '|', BOTTOM_MIDDLE.value(), '|', BOTTOM_RIGHT.value()},
        };
    }

    private void printGameBoard(char[][] gameBoard) {
        for (char[] row : gameBoard) {
            for (char col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
        System.out.println();
    }
}

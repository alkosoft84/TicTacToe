package main;

import org.junit.Before;
import org.junit.Test;

import static main.BoardFields.*;
import static org.junit.Assert.*;

public class BoardTest {

    private Board board;

    @Before
    public void setUp() {
        board = new Board();
    }

    @Test
    public void initialize() {
        //given
        board.draw();
        board.makeAMove(TOP_LEFT,'X');
        board.draw();
        board.makeAMove(CENTER,'X');
        board.draw();
        board.makeAMove(BOTTOM_RIGHT,'X');
        board.draw();
    }
}
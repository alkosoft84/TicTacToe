package main;

import main.board.Board;
import main.board.BoardFieldsNames;
import main.board.BoardFieldsRepository;
import org.junit.Before;
import org.junit.Test;

import static main.board.BoardFieldsNames.*;

public class BoardTest {

    private Board board;
    private Player player;
    private BoardFieldsRepository boardFieldsRepository = new BoardFieldsRepository();

    @Before
    public void setUp() {
        board = new Board(boardFieldsRepository);
        player = new Player(boardFieldsRepository);
    }

    @Test
    public void initialize() {
        //given
        board.draw();
        player.makeAMove(TOP_LEFT,'X');
        board.draw();
        player.randomMove('O');
        player.randomMove('O');
        player.randomMove('O');
        player.randomMove('O');
        player.randomMove('O');
        board.draw();
        player.makeAMove(BOTTOM_RIGHT,'X');
        board.draw();
    }
}
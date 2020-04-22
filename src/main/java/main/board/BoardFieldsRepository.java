package main.board;

import java.util.HashMap;
import java.util.Map;

import static main.board.BoardFieldsNames.*;

public class BoardFieldsRepository {

    private final Map<BoardFieldsNames, BoardField> boardFields = new HashMap<>();

    public BoardFieldsRepository() {
        boardFields.put(TOP_LEFT, new BoardField(TOP_LEFT, ' '));
        boardFields.put(TOP_MIDDLE, new BoardField(TOP_MIDDLE, ' '));
        boardFields.put(TOP_RIGHT, new BoardField(TOP_RIGHT, ' '));
        boardFields.put(MIDDLE_LEFT, new BoardField(MIDDLE_LEFT, ' '));
        boardFields.put(CENTER, new BoardField(CENTER, ' '));
        boardFields.put(MIDDLE_RIGHT, new BoardField(MIDDLE_RIGHT, ' '));
        boardFields.put(BOTTOM_LEFT, new BoardField(BOTTOM_LEFT, ' '));
        boardFields.put(BOTTOM_MIDDLE, new BoardField(BOTTOM_MIDDLE, ' '));
        boardFields.put(BOTTOM_RIGHT, new BoardField(BOTTOM_RIGHT, ' '));
    }

    public BoardField findByName(BoardFieldsNames name){
        return boardFields.get(name);
    }

    public void save(BoardField field) {
        boardFields.put(field.location(), field);
    }
}

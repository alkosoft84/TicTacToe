package main;

import main.board.BoardField;
import main.board.BoardFieldsNames;
import main.board.BoardFieldsRepository;

import java.util.Random;

public class Player {

    private final BoardFieldsRepository boardFieldsRepository;

    public Player(BoardFieldsRepository boardFieldsRepository) {
        this.boardFieldsRepository = boardFieldsRepository;
    }

    public void makeAMove(BoardFieldsNames boardFieldName, char sign){
        BoardField field = boardFieldsRepository.findByName(boardFieldName);
        if(field.isEmpty()){
            field.setValue(sign);
            boardFieldsRepository.save(field);
        }
    }

    public void randomMove(char sign){
        Random rand = new Random();
        int index = rand.nextInt(9);
        BoardFieldsNames field = BoardFieldsNames.findByIndex(index);
        makeAMove(field, sign);
    }
}

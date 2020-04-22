package main.board;

public class BoardField {
    private final BoardFieldsNames location;
    private char value;

    public BoardField(BoardFieldsNames location, char value) {
        this.location = location;
        this.value = value;
    }

    public char value() {
        return value;
    }

    public void setValue(char value){
        this.value = value;
    }

    public BoardFieldsNames location() {
        return location;
    }

    public boolean isEmpty(){
        return value == ' ';
    }
}

package main;

public class Field {
    private final int x;
    private final int y;
    private char value;

    public Field(int x, int y, char value) {
        this.x = x;
        this.y = y;
        this.value = value;
    }

    public int x() {
        return x;
    }

    public int y() {
        return y;
    }

    public char value() {
        return value;
    }

    public void setValue(char value){
        this.value = value;
    }
}

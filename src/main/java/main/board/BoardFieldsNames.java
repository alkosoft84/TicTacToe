package main.board;

public enum BoardFieldsNames {
    TOP_LEFT(1),
    TOP_MIDDLE(2),
    TOP_RIGHT(3),
    MIDDLE_LEFT(4),
    CENTER(5),
    MIDDLE_RIGHT(6),
    BOTTOM_LEFT(7),
    BOTTOM_MIDDLE(8),
    BOTTOM_RIGHT(9);

    private int index;

    BoardFieldsNames(int index) {
        this.index = index;
    }

    public static BoardFieldsNames findByIndex(int index) {
        BoardFieldsNames[] enums = BoardFieldsNames.values();
        for (BoardFieldsNames boardFieldEnum : enums) {
            if (boardFieldEnum.index == index) {
                return boardFieldEnum;
            }
        }
        return null;
    }
}

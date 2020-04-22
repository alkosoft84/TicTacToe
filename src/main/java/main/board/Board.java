package main.board;

public class Board {

    private final BoardFieldsRepository boardFieldsRepository;

    public Board(BoardFieldsRepository boardFieldsRepository) {
        this.boardFieldsRepository = boardFieldsRepository;
    }

    public void draw(){
        char[][] gameBoard = createGameboard();
        printGameBoard(gameBoard);
    }

    private char[][] createGameboard() {
        char topLeftValue = boardFieldsRepository.findByName(BoardFieldsNames.TOP_LEFT).value();
        char topMiddleValue = boardFieldsRepository.findByName(BoardFieldsNames.TOP_MIDDLE).value();
        char topRightValue = boardFieldsRepository.findByName(BoardFieldsNames.TOP_RIGHT).value();
        char middleLeftValue = boardFieldsRepository.findByName(BoardFieldsNames.MIDDLE_LEFT).value();
        char centerValue = boardFieldsRepository.findByName(BoardFieldsNames.CENTER).value();
        char middleRightValue = boardFieldsRepository.findByName(BoardFieldsNames.MIDDLE_RIGHT).value();
        char bottomLeftValue = boardFieldsRepository.findByName(BoardFieldsNames.BOTTOM_LEFT).value();
        char bottomMiddleValue = boardFieldsRepository.findByName(BoardFieldsNames.BOTTOM_MIDDLE).value();
        char bottomRightValue = boardFieldsRepository.findByName(BoardFieldsNames.BOTTOM_RIGHT).value();
        return new char[][]{
                {topLeftValue, '|', topMiddleValue, '|', topRightValue},
                {'-', '+', '-', '+', '-'},
                {middleLeftValue, '|', centerValue, '|', middleRightValue},
                {'-', '+', '-', '+', '-'},
                {bottomLeftValue, '|', bottomMiddleValue, '|', bottomRightValue},
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

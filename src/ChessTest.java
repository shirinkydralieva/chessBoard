public class ChessTest {
    public static void main(String[] args) {
        final Character [] locationX = {'A','B','C','D','E','F','G','H'};
        final Character [] locationY = {'1','2','3','4','5','6','7','8'};
        ChessBoard.fill();
        Rectangle [][] chessBoard = ChessBoard.getRectangles();
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
               if (i % 2 == 0 && j % 2 == 0){
                   chessBoard[i][j] = new Rectangle(new LocationOfFigure(locationX[j], locationY[i]), "BLACK", 4.5);
               } else if (i == j) {
                   chessBoard[i][j] = new Rectangle(new LocationOfFigure(locationX[j], locationY[i]), "BLACK", 4.5);
               } else if (i % 2 != 0 && j % 2 != 0) {
                   chessBoard[i][j] = new Rectangle(new LocationOfFigure(locationX[j], locationY[i]), "BLACK", 4.5);
               } else {
                   chessBoard[i][j] = new Rectangle(new LocationOfFigure(locationX[j], locationY[i]), "WHITE", 4.5);
               }
            }
        }

        for (Rectangle [] chessboardSquares: chessBoard) {
            for (Rectangle squares: chessboardSquares) {
               squares.speak();
            }
        }

        System.out.println("TOTAL: " + Rectangle.getNumberOfAll()); //to check number of all chessBoard squares
    }
}

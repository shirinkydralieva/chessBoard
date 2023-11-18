public class ChessBoard {
    private static final Rectangle [][] RECTANGLES = new Rectangle[8][8];
    public static void fill (){
        for (int i = 0; i < RECTANGLES.length; i++) {
            for (int j = 0; j < RECTANGLES[i].length; j++) {
                RECTANGLES[i][j] = new Rectangle();
            }
        }
    }
    public static Rectangle[][] getRectangles (){
        return RECTANGLES;
    }
}

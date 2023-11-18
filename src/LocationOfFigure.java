public class LocationOfFigure {
    private Character x;//Letter
    private Character y;//Number (Example: position A1 [x = A, y = 1])

    public LocationOfFigure(Character x, Character y) {
        this.x = x;
        this.y = y;
    }

    public Character getX() {
        return x;
    }

    public Character getY() {
        return y;
    }

    @Override
    public String toString() {
        return  x + "" + y;
    }
}

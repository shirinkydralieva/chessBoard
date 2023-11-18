public abstract class Figure {
    protected LocationOfFigure locationOfFigure;
    protected String color;
    protected boolean isVisible;

    public Figure() {
    }

    public Figure(LocationOfFigure locationOfFigure, String color, boolean isVisible) {
        this.locationOfFigure = locationOfFigure;
        this.color = color;
        this.isVisible = isVisible;
    }

    public Figure(LocationOfFigure locationOfFigure, String color) {
        this.locationOfFigure = locationOfFigure;
        this.color = color;
    }

    public abstract void speak();
}

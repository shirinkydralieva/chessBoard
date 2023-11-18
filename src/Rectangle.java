import java.util.Objects;

public final class Rectangle extends Figure{
    private Double length;
    private Double width;
    private static Integer numberOfAll = 0; //count Rectangle and Square created in main

    public Rectangle() {
    }

    public Rectangle(LocationOfFigure locationOfFigure, String color, boolean isVisible, Double length, Double width) {
        super(locationOfFigure, color, isVisible);
        this.length = length;
        this.width = width;
        numberOfAll++;
    }

    public Rectangle(LocationOfFigure locationOfFigure, String color, Double side) {
        //Constructor for Square
        super(locationOfFigure, color);
        this.length = side;
        this.width = side;
        numberOfAll++;
    }


    public static Integer getNumberOfAll() {
        return numberOfAll;
    }

    @Override
    public void speak() {
        String name;
        if (Objects.equals(length, width)){
            name = "[Square]";
        } else {
            name = "[Rectangle]";
        }
        System.out.println(name +
                "\nLocation: " + locationOfFigure +
                "\nColor: " + color +
                "\nLength: " + length +
                "\nWidth: " + width
        );


    }


}

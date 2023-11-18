# chessBoard
simple chess board consists an array of squares
- To run the code you need to run the main method in the ChessTest class

# completed according task instructions:
1. Create a Figure class
   * Properties:
     - X and Y position (separate class) 
     - attribute Color
     - attribute (boolean)Visible/Not visible
     - speak(); method (returns a string with information about the figure.)
     - X and Y position (create a separate class LocationOfFigure
       (X,Y))
2. Rectangle
   - Create a class “Rectangle”, an inheritor of class Figure
   - There are additional attributes: "height" and "width".
   - Override speak();
3. Square
   - Create constructor for “Rectangle”
   - Create a new constructor in a rectangle to define a Square, the height and width must be equal. (equals to side)
   - speak(); for a square should produce different text (replace name "Rectangle" with "Square")
   - Count the number of created rectangles and squares together.
4. ChessBoard
   - Create a ChessBoard class 
   * Properties:
     - Contains a two-dimensional array of 8x8 rectangles.
     - You cannot change a defined array once
     (for example: expand, narrow)
     - Create a fill(); method(saves a rectangle to a given cell)
     - Need access to each element (each rectangle from outside the class)
5. ChessBoard, console output
   - Create a ChessTest class
   - Create a ChessBoard Object.
   - Fill it with Squares of the same color, same size (double nesting cycle).
   - Count the number of Squares created, there should be 64.
   - Output speak(); for each object

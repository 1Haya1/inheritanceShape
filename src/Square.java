public class Square extends Rectangle {



    // No-arg constructor
    public Square() {
        super();
    }


    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    @Override
    public String toString() {
        return "A Square with side=" + getWidth() + ", which is a subclass of " + super.toString();
    }












}

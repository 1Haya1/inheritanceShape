public class Shape {

    private String color;
    private boolean filled;


    // No-arg constructor
    public Shape() {
        this.color = "green";
        this.filled = true;
    }

    // كونستراكتور
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

//get
    public String getColor() {
        return color;
    }

    //set
    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }
//set
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // toString method
    @Override
    public String toString() {
        return "A Shape with color of " + color + " and " + (filled ? "filled" : "Not filled");
    }













}

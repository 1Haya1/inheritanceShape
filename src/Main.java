//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Shape s1 = new Shape();
        System.out.println(s1);

        Shape shape2 = new Shape("red", false);
        System.out.println(shape2);

        s1.setColor("blue");
        s1.setFilled(false);
        System.out.println(s1);





        // Circle class
        Circle c1 = new Circle();
        System.out.println(c1);

        Circle c2 = new Circle(5.0, "yellow", true);
        System.out.println(c2);

        c1.setRadius(3.0);
        System.out.println(c1);







        // Rectangle class
        Rectangle r1 = new Rectangle();
        System.out.println(r1);

        Rectangle r2 = new Rectangle(2.0, 4.0, "orange", false);
        System.out.println(r2);

        r1.setWidth(3.0);
        r1.setLength(6.0);
        System.out.println(r1);







        // Square class
        Square square1 = new Square();
        System.out.println(square1);

        Square square2 = new Square(4.0, "purple", true);
        System.out.println(square2);

        square1.setWidth(5.0);
        System.out.println(square1);
    }


    }

public class Driver {
    public static void main(String[] args) {
        Circle circle = new Circle(2, 3, 5.0);
        circle.display();
        circle.displayWithPrecision(2);

        Rectangle rectangle = new Rectangle(4, 6);
        rectangle.display();
        rectangle.displayWithPrecision(3);
    }
}

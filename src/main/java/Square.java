public class Square extends Figure {
    private double side;

    Square(Color color, double side) {
        super("Square", color);
        this.side = side;
        this.area = getAreaOfSquare(side);
    }

    private double getAreaOfSquare(double side) {
        return side * side;
    }

    private double getSide() {
        return side;
    }

    public String draw() {
        return "This is " + name + ". It has area of "
                + area + " and it is " + color
                + ". Size of its side is " + side;
    }
}

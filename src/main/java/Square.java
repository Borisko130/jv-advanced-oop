public class Square extends Figure {
    private double side;

    public Square(Color color, double side) {
        super("Square", color);
        super.setArea(getAreaOfSquare(side));
        this.side = side;
    }

    private double getAreaOfSquare(double side) {
        return side * side;
    }

    private double getSide() {
        return side;
    }

    public String draw() {
        return "This is " + this.getName() + ". It has area of "
                + this.getArea() + " and it is " + this.getColor()
                + ". Size of its side is " + side;
    }
}

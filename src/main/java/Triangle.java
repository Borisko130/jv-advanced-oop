public class Triangle extends Figure {
    private double sideOne;
    private double sideTwo;
    private double sideThree;

    public Triangle(Color color, double sideOne, double sideTwo, double sideThree) {
        super("Triangle", color);
        super.setArea(getAreaOfTriangle(sideOne, sideTwo, sideThree));
        this.sideOne = sideOne;
    }

    public double getLongestSide() {
        return Math.max(Math.max(sideOne, sideTwo), Math.max(sideTwo, sideThree));
    }

    private double getAreaOfTriangle(double sideOne, double sideTwo, double sideThree) {
        double halfPerimeter = (sideOne + sideTwo + sideThree) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - sideOne)
        * (halfPerimeter - sideTwo) * (halfPerimeter - sideThree));
    }

    public String draw() {
        return "This is " + this.getName() + ". It has area of "
                + this.getArea() + " and it is " + this.getColor()
                + ". Its longest side is " + getLongestSide();
    }
}

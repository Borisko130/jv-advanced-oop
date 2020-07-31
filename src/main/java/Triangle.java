public class Triangle extends Figure {
    private double sideOne;
    private double sideTwo;
    private double sideThree;

    Triangle(Color color, double sideOne, double sideTwo, double sideThree) {
        super("Triangle", color);
        this.sideOne = sideOne;
        this.area = getAreaOfTriangle(sideOne, sideTwo, sideThree);
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
        return "This is " + name + ". It has area of "
                + area + " and it is " + color
                + ". Its longest side is " + getLongestSide();
    }
}

public class Trapeze extends Figure {
    private double height;
    private double lowerBase;
    private double upperBase;

    public Trapeze(Color color, double height, double lowerBase, double upperBase) {
        super("Trapeze", color);
        super.setArea(getAreaOfTrapeze(height, lowerBase, upperBase));
        this.height = height;
        this.lowerBase = lowerBase;
        this.upperBase = upperBase;
    }

    private double getAreaOfTrapeze(double height, double lowerBase, double upperBase) {
        return height * ((lowerBase + upperBase) / 2);
    }

    public double getHeight() {
        return height;
    }

    public double getLowerBase() {
        return lowerBase;
    }

    public double getUpperBase() {
        return upperBase;
    }

    public String draw() {
        return "This is " + this.getName() + ". It has area of "
                + this.getArea() + " and it is " + this.getColor()
                + ". Its height is " + height;
    }
}

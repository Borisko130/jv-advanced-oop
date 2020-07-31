public class Trapeze extends Figure {
    private double height;
    private double lowerBase;
    private double upperBase;

    Trapeze(Color color, double height, double lowerBase, double upperBase) {
        super("Trapeze", color);
        this.height = height;
        this.lowerBase = lowerBase;
        this.upperBase = upperBase;
        this.area = getAreaOfTrapeze(height, lowerBase, upperBase);
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
        return "This is " + name + ". It has area of "
                + area + " and it is " + color
                + ". Its height is " + height;
    }
}

public class Circle extends Figure {
    private double radius;

    public Circle(Color color, double radius) {
        super("Circle", color);
        super.setArea(getAreaOfCircle(radius));
        this.radius = radius;
    }

    private double getAreaOfCircle(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }

    public String draw() {
        return "This is " + this.getName() + ". It has area of "
                + this.getArea() + " and it is " + this.getColor()
                + ". Also its radius is " + radius;
    }
}

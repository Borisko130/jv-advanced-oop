public class Circle extends Figure {
    private double radius;

    public Circle(Color color, double radius) {
        super("Circle", color);
        this.radius = radius;
        this.area = getAreaOfCircle(radius);
    }

    private double getAreaOfCircle(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }

    public String draw() {
        return "This is " + name + ". It has area of "
                + area + " and it is " + color
                + ". Also its radius is " + radius;
    }
}

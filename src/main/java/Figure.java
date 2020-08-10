public class Figure {
    private String name;
    private Color color;
    private double area;

    protected Figure(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public String draw() {
        return "This is " + name + ". It has area of " + area + " and it is " + color;
    }
}

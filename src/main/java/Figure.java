public class Figure {
    protected String name;
    protected Color color;
    protected double area;

    protected Figure(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public String draw() {
        return "This is " + name + ". It has area of " + area + " and it is " + color;
    }
}

public class Trapeze extends Figure{
    double height;
    double lowerBase;
    double upperBase;

    Trapeze(Color color, double height, double lowerBase, double upperBase) {
        this.name = "Trapeze";
        this.color = color;
        this.height = height;
        this.lowerBase = lowerBase;
        this.upperBase = upperBase;
        this.area = getAreaOfTrapeze(height, lowerBase, upperBase);
    }

    private double getAreaOfTrapeze(double height, double lowerBase, double upperBase){
        return height * ((lowerBase + upperBase)/2);
    }

    public double getHeight(){
        return height;
    }

    public double getLowerBase(){
        return lowerBase;
    }

    public double getUpperBase(){
        return upperBase;
    }

    public String output(){
        return "This is "+ name + ". It has area of "
                + area + " and it is " + color
                + ". Its height is " + height;
    }
}

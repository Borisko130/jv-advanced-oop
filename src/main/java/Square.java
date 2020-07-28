public class Square extends Figure{
    private double side;

    Square(Color color, double side) {
        this.name = "Square";
        this.color = color;
        this.side = side;
        this.area = getAreaOfSquare(side);
    }

    private double getAreaOfSquare(double side){
        return side * side;
    }

    private double getSide(){
        return side;
    }

    public String output(){
        return "This is "+ name + ". It has area of "
                + area + " and it is " + color
                + ". Size of its side is " + side;
    }
}

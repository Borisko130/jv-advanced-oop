public class Triangle extends Figure{
    double[] catets = new double[2];

    Triangle(Color color, double[] catets) {
        this.name = "Triangle";
        this.color = color;
        this.catets = catets;
        this.area = getAreaOfTriangle(catets);
    }

    public double getHypotenuse(){
        return Math.sqrt(Math.pow(catets[0],2)+Math.pow(catets[1],2));
    }

    private double getAreaOfTriangle(double[] catets){
        return (catets[0] * catets[1])/2;
    }

    public String output(){
        return "This is "+ name + ". It has area of "
                + area + " and it is " + color
                + ". Its hypotenuse is " + getHypotenuse();
    }
}

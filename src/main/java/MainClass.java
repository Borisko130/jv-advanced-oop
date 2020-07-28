import java.util.Random;

public class MainClass {
    public static void main(String[] args){
        int amountOfFigures = 10;
        for (Figure figure: generate(amountOfFigures)) {
            System.out.println(figure.output());
        }
    }

    public static Figure[] generate(int arraySize) {
        Figure[] figures = new Figure[arraySize];
        Random random = new Random();
        for(int i = 0; i < arraySize; i++){
            switch( (int) ((Math.random() * (4 - 0)) + 0)){
                case 0:
                    figures[i] = new Circle(pickColor(),10 + (10 - 1) * random.nextDouble());
                    break;
                case 1:
                    figures[i] = new Square(pickColor(),10 + (10 - 1) * random.nextDouble());
                    break;
                case 2:
                    figures[i] = new Trapeze(pickColor(),10 + (10 - 1) * random.nextDouble(),
                            10 + (10 - 1) * random.nextDouble(),
                            10 + (10 - 1) * random.nextDouble());
                    break;
                case 3:
                    figures[i] = new Triangle(pickColor(), new double[] {10 + (10 - 1) * random.nextDouble(),
                            10 + (10 - 1) * random.nextDouble()});
                    break;
            }
        }
        return figures;
    }

    public static Color pickColor(){
        switch((int) ((Math.random() * (5 - 0)) + 0)){
            case 0:
                return Color.RED;
            case 1:
                return Color.YELLOW;
            case 2:
                return Color.GREEN;
            case 3:
                return Color.BLUE;
            case 4:
                return Color.VIOLET;
        }
        return Color.RED;
    }

}

import java.util.Random;

public class MainClass {

    private static int NUMBER_OF_SHAPES = 4;

    public static void main(String[] args){
        int amountOfFigures = 10;
        for (Figure figure: generate(amountOfFigures)) {
            System.out.println(figure.draw());
        }
    }

    public static Figure[] generate(int arraySize) {
        Figure[] figures = new Figure[arraySize];
        Random random = new Random();
        for (int i = 0; i < arraySize; i++) {
            switch ((int) (Math.random() * NUMBER_OF_SHAPES)) {
                case 0:
                    figures[i] = new Circle(pickColor(), 10 + (10 - 1) * random.nextDouble());
                    break;
                case 1:
                    figures[i] = new Square(pickColor(), 10 + (10 - 1) * random.nextDouble());
                    break;
                case 2:
                    figures[i] = new Trapeze(pickColor(), 10 + (10 - 1) * random.nextDouble(),
                            10 + (10 - 1) * random.nextDouble(),
                            10 + (10 - 1) * random.nextDouble());
                    break;
                case 3:
                    figures[i] = new Triangle(pickColor(), 10 + (10 - 1) * random.nextDouble(),
                            10 + (10 - 1) * random.nextDouble(),
                            10 + (10 - 1) * random.nextDouble());
                    break;
            }
        }
        return figures;
    }

    public static Color pickColor(){
        Random random = new Random();
        Color[] colors = Color.values();

        return colors[random.nextInt(5)];
    }

}

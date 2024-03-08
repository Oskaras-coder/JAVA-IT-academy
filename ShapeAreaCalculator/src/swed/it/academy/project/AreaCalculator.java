package swed.it.academy.project;

import static swed.it.academy.project.InputOutputManager.scanner;

public class AreaCalculator {

    public static void main(String[] args){
        runCalculator();
    }

    public static void runCalculator(){
        Shape shape;
        do {
            talkToTheUser();
            shape = outputTheResult();
        } while (shape != null);
        scanner.close();
    }

    public static void talkToTheUser(){
        InputOutputManager.chooseShape();
        try {
            InputOutputManager.inputData();
        } catch (UnknownShapeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Shape outputTheResult(){

        Shape shape = switch (InputOutputManager.getChoiceOfShape()){
            case 1 -> {yield new Square(InputOutputManager.getData1());}
            case 2 -> {yield new Triangle(InputOutputManager.getData1(), InputOutputManager.getData2());}
            case 3 -> {yield new Circle(InputOutputManager.getData1());}
            case 4 -> {yield new Parallelogram(InputOutputManager.getData1(), InputOutputManager.getData2());}
            default -> {yield null;}
        };

        if (shape != null) {
            shape.calculateArea();
            InputOutputManager.outputData(shape.toString());
        }
        return shape;
    }
}

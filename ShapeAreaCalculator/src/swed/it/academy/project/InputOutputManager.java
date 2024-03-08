package swed.it.academy.project;

import java.util.Scanner;

public class InputOutputManager {

    public static final Scanner scanner = new Scanner(System.in);

    private static int choiceOfShape;
    private static double data1;
    private static double data2;

    public static int getChoiceOfShape() {
        return choiceOfShape;
    }

    public static double getData1() {
        return data1;
    }

    public static double getData2() {
        return data2;
    }

    public static void chooseShape(){
        System.out.println("What shape you want to count?");
        System.out.println("1 for square, 2 for triangle, 3 for circle, 4 for parallelogram (Type any other key to exit): ");
        try {
            choiceOfShape = scanner.nextInt();
        }
        catch (Exception e){
            System.out.println("Only integers from 1 to 4 are expected.");
        }
    }

    public static void inputData() throws UnknownShapeException{
        switch (choiceOfShape){
            case 1:
                System.out.println("Enter the side length of the square");
                data1 = scanner.nextDouble();
                break;
            case 2:
                System.out.println("Enter the sideA length of the right triangle");
                data1 = scanner.nextDouble();
                System.out.println("Enter the sideB length of the right triangle");
                data2 = scanner.nextDouble();
                break;
            case 3:
                System.out.println("Enter the radius length of circle");
                data1 = scanner.nextDouble();
                break;
            case 4:
                System.out.println("Enter the base length of the parallelogram.");
                data1 = scanner.nextDouble();
                System.out.println("Enter the height of the parallelogram.");
                data2 = scanner.nextDouble();
                break;
            default:
                scanner.close();
                throw new UnknownShapeException("This shape is not valid. Closing...\n----------------");

        }

    }

    public static void outputData(String shapeRep){
        System.out.println(shapeRep);
        System.out.println("------------------------------");
    }
}

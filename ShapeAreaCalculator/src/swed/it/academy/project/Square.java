package swed.it.academy.project;

public class Square extends Shape{

    public Square(double oneSide) {
        super(oneSide, oneSide);
    }

    @Override
    public void calculateArea() {
        super.rectangleArea();
    }
}

package swed.it.academy.project;


public class Parallelogram extends Shape{
    public Parallelogram(double b, double h) {
        super(b, h);
    }

    @Override
    public void calculateArea() {
        super.rectangleArea();
    }
}

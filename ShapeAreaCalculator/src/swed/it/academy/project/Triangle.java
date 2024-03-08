package swed.it.academy.project;

public class Triangle extends Shape{

    public Triangle(double s1, double s2) {
        super(s1, s2);
    }

    @Override
    public void calculateArea() {
        super.rectangleArea();
        double triangleArea = super.getArea() / 2;
        super.setArea(triangleArea);
    }
}

package swed.it.academy.project;

public abstract class Shape {
    private double area;
    private double side1;
    private double side2;

    public Shape(double s1, double s2) {
        this.side1 = s1;
        this.side2 = s2;
    }

    public abstract void calculateArea();
    public void rectangleArea(){
        this.area = this.side1 * this.side2;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Your shape " +
                "area is " + area ;
    }
}

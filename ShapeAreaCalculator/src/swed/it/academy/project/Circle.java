package swed.it.academy.project;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle extends Shape{
    public Circle(double r) {
        super(r, r);
    }

    @Override
    public void calculateArea() {
        super.rectangleArea();
        BigDecimal circleArea = BigDecimal.valueOf(super.getArea() * Math.PI).setScale(2, RoundingMode.UP);
        super.setArea(circleArea.doubleValue());
    }
}

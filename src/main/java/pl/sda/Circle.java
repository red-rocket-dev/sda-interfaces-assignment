package pl.sda;

import java.math.BigDecimal;

public class Circle implements Figure {
    private BigDecimal radius;

    public Circle(BigDecimal radius) {
        this.radius = radius;
    }

    @Override
    public BigDecimal calculateArea() {
        return BigDecimal.valueOf(Math.PI)
                .multiply(radius.pow(2));
    }

    @Override
    public BigDecimal calculatePerimeter() {
        return BigDecimal.valueOf(2)
                .multiply(BigDecimal.valueOf(Math.PI))
                .multiply(radius);
    }
}

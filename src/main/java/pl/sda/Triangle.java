package pl.sda;

import java.math.BigDecimal;

public class Triangle implements Figure {
    private BigDecimal base;
    private BigDecimal cathetus2;
    private BigDecimal hypotenuse;
    private BigDecimal height;

    public Triangle(BigDecimal base, BigDecimal cathetus2,
                    BigDecimal hypotenuse, BigDecimal height) {
        this.base = base;
        this.cathetus2 = cathetus2;
        this.hypotenuse = hypotenuse;
        this.height = height;
    }

    @Override
    public BigDecimal calculateArea() {
        return BigDecimal.valueOf(0.5)
                .multiply(base)
                .multiply(height);
    }

    @Override
    public BigDecimal calculatePerimeter() {
        return base.add(cathetus2)
                .add(hypotenuse);
    }
}

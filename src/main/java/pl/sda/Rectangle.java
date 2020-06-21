package pl.sda;

import java.math.BigDecimal;

public class Rectangle implements Figure {

    private BigDecimal width;
    private BigDecimal height;

    public Rectangle(BigDecimal width, BigDecimal height) {
        this.width = width;
        this.height = height;
    }


    @Override
    public BigDecimal calculateArea() {
        return width.multiply(height);
    }

    @Override
    public BigDecimal calculatePerimeter() {
        BigDecimal multiplicandTwo = BigDecimal.valueOf(2);
        return width.multiply(multiplicandTwo)
                .add(height.multiply(multiplicandTwo));
    }
}

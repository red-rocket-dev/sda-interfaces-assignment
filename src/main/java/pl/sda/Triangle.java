package pl.sda;

public class Triangle implements AbleToCalculateArea {
    private double width;
    private double height;

    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * width * height;
    }
}

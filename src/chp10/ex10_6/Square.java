package chp10.ex10_6;

public class Square extends Shape{
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    private int width;

    @Override
    double area() {
        double result = Math.pow(width,2);
        return result;
    }
}

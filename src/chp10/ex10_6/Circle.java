package chp10.ex10_6;

public class Circle extends Shape{
    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    private int r;

    @Override
    double area() {
        double result = Math.PI * Math.pow(r, 2);
        return result;
    }
}

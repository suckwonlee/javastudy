package chp07.test3;

public class Cylinder {
    int radius;
    int height;

    double getVolume(){
        return Math.PI * radius * radius*height;
    }

    double getSurfaceArea(){
        double circleArea = Math.PI * radius * radius;
        double rectangleArea=height*2*Math.PI*radius;
        return 2*circleArea*rectangleArea;
    }
    public static void main(String[] args) {
        Cylinder c=new Cylinder();
        c.radius=4;
        c.height=5;
        System.out.printf("원기둥의 부피: %.2f\n",c.getVolume());
        System.out.printf("원기동의 겉넓이: %.2f\n",c.getSurfaceArea());
    }
}

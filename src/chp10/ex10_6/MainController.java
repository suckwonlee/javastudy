package chp10.ex10_6;

import java.util.ArrayList;

public class MainController {
    public static void main(String[] args) {
        Square square = new Square();
        square.name="정사각형";
        square.setWidth(7);

        Triangle triangle = new Triangle();
        triangle.name="삼각형";
        triangle.setWidth(15);
        triangle.setHeight(9);

        Circle circle = new Circle();
        circle.name="원";
        circle.setR(1922);

//        ArrayList<Shape> arrList = new ArrayList<Shape>();
//        arrList.add(square);
//        arrList.add(triangle);
//        arrList.add(circle);
//        ViewShapes(arrList);

        Shape[] arrList={square,triangle,circle};
        ViewShapes(arrList);

    }

    public static void ViewShapes(Shape[] arrList) {
            for (Shape shape : arrList) {
                System.out.printf("%s의 면적은 %.9f㎠\n",shape.name,shape.area());
            }
    }
}

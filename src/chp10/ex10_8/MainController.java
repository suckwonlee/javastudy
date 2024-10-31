package chp10.ex10_8;

public class MainController {
    public static void main(String[] args) {
        Truck truck=new Truck("BelAZ",450.0);

        truck.move();
        truck.load();
    }
}

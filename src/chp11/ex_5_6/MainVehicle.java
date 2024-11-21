package chp11.ex_5_6;

public class MainVehicle {
    public static void main(String[] args) {
        Vehicle vehicle=new Bicycle();

        vehicle.horn();
        vehicle.move("보광동","이태원");

        Bicycle bicycle=new Bicycle();
        bicycle.horn();
        bicycle.move("한강진역","이태원");
        bicycle.stop("맥심프랜트");

        Vehicle vehicle1=new Train();
        vehicle1.horn();
        vehicle1.move("서울","남원");
        Vehicle.stop("대전");
    }
}

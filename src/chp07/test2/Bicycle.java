package chp07.test2;

public class Bicycle {
    String name;
    double weight;
    int price;
    public static void main(String[] args) {
        Bicycle b1 = new Bicycle();
        b1.name = "따릉이";
        b1.weight = 7.7;
        b1.price = 350000;


        System.out.printf("b1=>{%s,%.2f,%d}\n",b1.name,b1.weight,b1.price);
    }
}

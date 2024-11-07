package chp10.ex10_11;

public class Item2 {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private String name;
    private int price;
    Item2(){
        this.name="기본";
        System.out.println("Item2()의 기본생성자 호출됨");
    }

    public Item2(String name, int price){
        this.name=name;
        this.price=price;
    }


}

package chp10.ex10_10;

public class Item {
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

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    private int power;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public Item() {
            this("칼",6000);
    }


    public Item(String name, int price, int power) {
        this(name, price);
        this.power = power;
    }

    }

//필드명과 지역변수(매개변수)의 이름이 같은 경우 구별하는 용도로 this 키워드 사용

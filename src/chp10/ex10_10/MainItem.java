package chp10.ex10_10;

public class MainItem {
    public static void main(String[] args) {
        Item item=new Item("마법 지팡이",32800);

        System.out.println("아이템명: "+item.getName());
        System.out.println("아이템 가격: "+item.getPrice());

//        Item item1=new Item();
//        System.out.println("아이템명: "+item1.getName());
//        System.out.println("아이템 가격: "+item1.getPrice());

        Item item2=new Item("라이트 세이버",46900,5);
        System.out.println("아이템명: "+item2.getName());
        System.out.println("아이템 가격 "+item2.getPrice());
        System.out.println("아이템 파워 "+item2.getPower());

    }
}

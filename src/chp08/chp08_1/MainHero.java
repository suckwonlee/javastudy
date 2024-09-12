package chp08.chp08_1;

public class MainHero {
    public static void main(String[] args) {
        hero ironMan = new hero("아이언맨", 100, 120);
        hero hulk = new hero("헐크", 200, 80);

        System.out.println(ironMan.toString());
        System.out.println(hulk.toString());
    }
}

package chp10.ex10_1;

public class RPGGameTest {
    public static void main(String[] args) {
        Wizard w1 = new Wizard();
        Novice n1 = new Novice();
        w1.name= "건달프";
        w1.hp=100;
        w1.mp=80;
        w1.punch();
        w1.fireball();

        Knight k1= new Knight();
        k1.name="아라곤";
        k1.hp=170;
        k1.stamina=100;
        k1.punch();
        k1.slash();
    }
}

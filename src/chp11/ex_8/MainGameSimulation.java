package chp11.ex_8;

public class MainGameSimulation {
    public static void main(String[] args) {
        Knight atomic=new Knight("아토믹");//인간
        Knight uther=new HolyKnight("우서");//디바인 나이트
        Knight genji=new MagicKnight("겐지");//아케인 나이트

        atomic.slash();
        uther.slash();
        genji.slash();

        Healer healer1=(HolyKnight)uther;
        Healer healer2= new HolyKnight("안석수");

        healer1.heal();
        healer1.recovery();
        //healer1.slash(); 힐러인터페이스의 참조변수이므로 힐러 인터페이스를 통해 구현된 메소드만 호출 가능

        Magician magician1=(Magician)genji;
        magician1.magicShield();
        magician1.teleport();

        MagicKnight magicKnight=new MagicKnight("한조");
        magicKnight.magicShield();
        magicKnight.teleport();
        magicKnight.slash();

    }
}

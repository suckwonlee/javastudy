package chp11.ex_8;

public class MagicKnight extends Knight implements Magician{
    public int mp=100;

    public MagicKnight(String name) {
        super(name);
    }

    @Override
    public void magicShield() {
        System.out.printf("\n[%s]가(이) 모든 공격을 보호막으로 튕겨냅니다",name);

    }

    @Override
    public void teleport() {
        System.out.printf("\n[%s]가(이) 순간이동을 합니다.\n",name);

    }

    @Override
    public void slash() {
        System.out.println("\n"+name+"의 마력이 담긴 베기 공격");
    }
}

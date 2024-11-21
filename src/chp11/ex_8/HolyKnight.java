package chp11.ex_8;

public class HolyKnight extends Knight implements  Healer {
    public int dp=100;

    public HolyKnight(String name) {
        super(name);
    }

    @Override
    public void heal() {
        System.out.printf("\n[%s]의 체력이 가득 찹니다.\n", name);
    }

    @Override
    public void recovery() {
        System.out.printf("\n[%s]의 체력 회복력이 증가됩니다.\n", name);
    }

    @Override
    public void slash() {
        System.out.printf("\n[%s]의 신성한 강타가 작렬합니다.",name);
    }
}

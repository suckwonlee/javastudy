package chp11.ex_1_2_3;

public class MainIphone {
    public static void main(String[] args) {
        //업캐스팅된 경우의 참조 변수는 부모의 것을 사용할 수 있고 자식의 것은 오버라이딩 된것만 사용할 수 있다.
        Phone p = new IPhone();
        p.callPhone("010-3333-7777");
        p.ReceivePhone("02-111-5555");
        System.out.println("제조사명: "+Phone.PRODUCT_NAME);

        IPhone iPhone = new IPhone();
        iPhone.beep();
        iPhone.callPhone("02-777-1111");
        iPhone.playMusic("APT");
        iPhone.sendAirDrop("사진");
        iPhone.sendMessage("오늘 수능 대박나라~");

        Alarm alarm = iPhone;
        alarm.beep();
        alarm.playMusic("Sticky Fingers");

    }
}

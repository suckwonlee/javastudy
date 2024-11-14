package chp11.ex_1_2_3;

public class G24 implements Phone,Message,Alarm{
    @Override
    public void playMusic(String musicTitle) {
        System.out.println(musicTitle+"음악을"+PRODUCT_NAME+"Music으로 재생한다.");

    }

    @Override
    public void beep() {
        System.out.println("beep음이 삐삐삐삐 발생한다.");
    }

    @Override
    public void sendMessage(String content) {
        System.out.println(content+" 메세지를 전송한다.");
    }

    @Override
    public void receiveMessage(String content) {
        System.out.println(content+" 메세지를 수신한다.");
    }

    @Override
    public void callPhone(String phoneNumber) {
        System.out.println(phoneNumber+" 로 전화를 건다.");
    }

    @Override
    public void ReceivePhone(String phoneNumber) {
        System.out.println(phoneNumber+" 로 전화를 받는다.");
    }


}

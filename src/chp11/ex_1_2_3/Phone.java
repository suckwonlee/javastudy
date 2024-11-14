package chp11.ex_1_2_3;

public interface Phone {
    //인터페이스는 상수,추상메소드,디폴트 메소드 등을 사용할 수 있습니다.
    //상수는 final,static 생략 가능
    String PRODUCT_NAME = "Apple";
    public abstract void callPhone(String phoneNumber);
    //추상메소드는 public abstract를 생략가능
    void ReceivePhone(String phoneNumber);
}

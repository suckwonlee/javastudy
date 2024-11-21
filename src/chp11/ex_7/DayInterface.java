package chp11.ex_7;

public interface DayInterface {
    String MONDAY = "월요일";
    public static final String TUESDAY="화요일";
    //인터페이스 내에서는 상수만 사용되기 때문에 public,static,final 생략 가능
    //final은 처음에 초기화 이후 다른 값으로 수정 불가
    //static은 인터페이스명을 .앞에 붙여서 상수를 사용할 수 있다.
}

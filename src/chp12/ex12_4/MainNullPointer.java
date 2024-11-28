package chp12.ex12_4;

public class MainNullPointer {
    public static void main(String[] args) {
        NullpointerExceptionTest nullTest = new NullpointerExceptionTest();

        nullTest.addName("김건우");
        nullTest.addName("오현민");
        nullTest.printAllNames();
    }
}

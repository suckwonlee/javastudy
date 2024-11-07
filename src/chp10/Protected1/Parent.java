package chp10.Protected1;

public class Parent {
    String name;
    protected String id;

    protected void printProtected(){
        System.out.println("protected 접근제한자는 패키지는 서로 다르지만 상관관계에 있는 부모의 멤버를 접근 가능");
    }

    protected void printDefault(){
        System.out.println("Default 접근제한자는 패키지가 서로 다르면 부모의 멤버를 접근 불가능");
    }
}

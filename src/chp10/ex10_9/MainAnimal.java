package chp10.ex10_9;

public class MainAnimal {
    public static void main(String[] args) {
        //추상 클래스는 new 연산자로 객체생성 불가
        //Animal animal = new Animal();

        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.setName("말티즈");
        dog.eat("사료");
        dog.cry("멍멍");
        dog.sleep(5);
        dog.wag();

        cat.setName("페르시안");
        cat.sleep(7);
        cat.cry("어흥");
        cat.Grooming();
        cat.eat("생선");
        //업캐스팅을 하면 부모 클래스의 모든 멤버 사용가능
        //자식 클래스의 멤버는 부모클래스의 메소드를 오버라이딩한 메소드만 사용가능
        Animal animal = new Dog();
    }
}

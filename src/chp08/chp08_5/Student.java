package chp08.chp08_5;

public class Student {
    //공유(static) 영역 할당:클래스 변수
    static int count;
    //힙(non-static) 영억 할당:인스턴스 변수
    int id;
    String name;

    Student(int id, String name) {
        this.id=id;
        this.name=name;
        count++;
    }


}




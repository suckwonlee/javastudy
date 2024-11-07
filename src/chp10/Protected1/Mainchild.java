package chp10.Protected1;

import chp10.Protected1.test.Child;

public class Mainchild {
    public static void main(String[] args) {
        Child child = new Child();
        child.testPro();
        System.out.println("Parent Id는 "+child.id);
    }
}

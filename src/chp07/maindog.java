package chp07;

public class maindog {
    public static void main(String[] args) {
        dog d1 = new dog();
        dog d2 = new dog();
        d1.setName("윌슨");
        d1.setBreeds("골든 리트리버");
        d1.setAge(3);

        d2.setName("간트");
        d2.setBreeds("레브라도 리트리버");
        d2.setAge(2);

        System.out.printf("d1=> (name: %s, breed: %s, age: %d))\n",d1.getName(),d1.getBreeds(),d1.getAge());
        System.out.printf("d2=> (name: %s, breed: %s, age: %d))\n",d2.getName(),d2.getBreeds(),d2.getAge());

        d1.wag();
        d2.wag();

        d1.bark();
        d1.bark(5,"왈왈");

        d2.bark();
        d2.bark(3,"컹컹컹");
    }
}

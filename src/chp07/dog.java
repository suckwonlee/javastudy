package chp07;

public class dog {
    private String name;
    private String breeds;
    private int age;

    public String getBreeds() {
        return breeds;
    }

    public void setBreeds(String breeds) {
        this.breeds = breeds;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void wag(){
        System.out.println(name+"이(가) 살랑살랑");
    }
    public void bark(){
        System.out.println("멍멍");
    }

    public int bark(int times, String sound){
        System.out.printf("%s이(가) %d번 %s 짖는다.\n",name,times,sound);
        return times;
    }
}


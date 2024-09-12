package chp08.chp08_4;

public class Avenger {
    private String name;
    private int healthpoints;

public Avenger(String name, int healthpoints) {
    this.name = name;
    this.healthpoints = healthpoints;
}

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public void setHealthpoints(int healthpoints){
        this.healthpoints = healthpoints;
    }

    public int getHealthpoints(){
        return healthpoints;
    }



    public void punch(Avenger enemy){
        System.out.printf("<%s>의 펀치가 날아갔다..\n", name);
        enemy.setHealthpoints(enemy.getHealthpoints()-10);
        System.out.printf("=> '%s'의 체력이 %d로 감소했다.\n",enemy.getName(),enemy.getHealthpoints());
    }


}

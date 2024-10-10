package chp10.ex10_1;

public class Knight extends Novice{
    int stamina;
    void slash(){
        System.out.printf("%s(HP: %d,MP: %d)의 참격///////////////////\n",name,hp,stamina);
    }
}

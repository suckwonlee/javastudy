package chp07.test1;

public class mainsquare {


    public static void main(String[] args) {
        square s1=new square();
        s1.setLength(15);
        int result=s1.getArea();

        square s2=new square();
        s2.setLength(7);
        int result2=s2.getArea();
        System.out.printf("길이가 %d㎝인 정사각형의 면적은 %d㎠입니다\n",s1.getLength(),result);
        System.out.printf("길이가 %d㎝인 정사각형의 면적은 %d㎠입니다\n",s2.getLength(),result2);
    }
}

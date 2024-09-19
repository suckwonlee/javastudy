package chp08.chp08_6;

import java.util.Scanner;

public class MainMyMath {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("첫번째 정수값 : ");
        int n1=scanner.nextInt();
        System.out.println("두번재 정수값 : ");
        int n2=scanner.nextInt();
        System.out.printf("%d과 %d중에 더 큰 값 : %d\n",n1,n2,MyMath.max(n1,n2));
        System.out.printf("%d과 %d중에 더 작은 값 : %d\n",n1,n2,MyMath.min(n1,n2));
        scanner.close();
    }
}

package chp12.ex12_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainException12_3 {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        try {
            System.out.println("* 나누는수를 입력하세요: ");
            int dividend = s1.nextInt();
            double result = 30 / dividend;
            System.out.printf("%d을(를) %d(으)로 나눈 수의 결과는 %.2f", 30, dividend);
        }catch (InputMismatchException e) {
            System.out.println("정수만 입력해주세요");
        }catch (ArithmeticException e) {
            System.out.println("정수는 0으로 나눌 수 없습니다.");
        }
            System.out.println("시스템 종료");

        s1.close();
    }
}

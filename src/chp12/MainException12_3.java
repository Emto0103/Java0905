package chp12;

import java.util.Scanner;

public class MainException12_3 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.printf("* 나누는수를 입력하세요:");
        int dividend = s1.nextInt();
        double result = 30.0 / dividend;
        System.out.printf("%d을 %d로 나눈 수의 결과는 %.2f\n", 30, dividend, result);

        System.out.println("프로그램을 종료합니다.");

        s1.close();
    }
}

package chp08.ex8_6;
import java.util.Scanner;

public class MainMyMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("첫번째 정수값:");
        int n1 = sc.nextInt();
        System.out.printf("두번째 정수값:");
        int n2 = sc.nextInt();
        System.out.printf("%d과 %d중에 더 큰 값 : %d\n", n1, n2, MyMath.max(n1,n2));
        System.out.printf("%d과 %d중에 더 작은 값 : %d\n", n1, n2, MyMath.min(n1,n2));
        sc.close();
    }
}

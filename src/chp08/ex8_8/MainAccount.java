package chp08.ex8_8;

import java.util.Scanner;

public class MainAccount {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.printf("계좌번호입력(5자리):");
        String accountNumber = sc1.nextLine();
        System.out.printf("* 성명 입력:");
        String name = sc1.nextLine();
        System.out.printf("* 비밀번호(4자리):");
        String pwd = sc1.nextLine();
        System.out.printf("* 입금할 금액:");
        int balance = sc2.nextInt();

        Account account = new Account(accountNumber, name, pwd, balance);

        sc1.close();
        sc2.close();
    }
}

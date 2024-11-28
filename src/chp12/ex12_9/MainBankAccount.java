package chp12.ex12_9;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainBankAccount {

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("철수", "111-22-3333", 9999);
        BankAccount b2 = new BankAccount("영지", "111-33-4444", 9999);

        try {
            File file = new File("result_account.txt");
            FileWriter fw = new FileWriter(file);
            fw.write(b1.toString()+"\n");
            fw.write(b2.toString()+"\n");
            fw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

package chp12.ex12_7;

import chp12.ex12_6.MyAgeException;

import java.io.IOException;

public class MainThrows {
    public static void main(String[] args) throws MyAgeException {
        ThrowsTest tt = new ThrowsTest();
        try {
            tt.test1();
        }catch (MyAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}

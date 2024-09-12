package chp08.ex8_2;

public class Drink {
    public static void main(String[] args) {
        MainDrink d1 = new MainDrink();
        MainDrink d2 = new MainDrink("콜라",2500);

        System.out.println(d1);
        System.out.println(d2);
    }
}

package chp08.ex8_4;

public class MainAvenger {
    public static void main(String[] args) {
        Avenger thor = new Avenger(150, "토르");

        Avenger thanos = new Avenger(160, "타노스");
        thor.punch(thanos);
        thor.punch(thanos);
        thanos.punch(thor);
    }
}
//
class Avenger {
    String name;
    int hp;

    Avenger(int hp, String name) {
        name = name;
        hp = hp;
    }

    void punch(Avenger enemy) {
        System.out.printf("[%s]의 펀치", name);
    }
}
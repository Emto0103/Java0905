//package chp11.ex11_8;
//
//import chp10.Knight;
//
//public class MainGameSimullation {
//
//    public static void main(String[] args) {
//        Knight atomic = new Knight("아토믹");
//        Knight uther = new HolyKnight("우서");
//        Knight genji = new MagicKnight("겐지");
//
//        atomic.slash();
//        uther.slash();
//        genji.slash();
//
//        Healer healer1 = (HolyKnight)uther;
//        Helaer helaer2 = new HolyKnight("우서동생");
//
//        healer1.heal();
//        healer1.recovery();
//        // healer1.slash(); //healer 인터페이스의 참조변수이므로 Healer 인터페이스를 통해 구현된 메소드만 호출 할 수 있다.
//
//        Magician magician = (MagicKnight)genji;
//        magician1.magicSheild();
//        magician1.teleport();
//
//        MagicKnight magicKnight = new MagicKnight("겐지동생");
//        magicKnight.magicShield();
//        magicKnight.teleport();
//        magicKnight.slash();
//
//    }
//}

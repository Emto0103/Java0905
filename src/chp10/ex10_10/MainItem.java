package chp10.ex10_10;

public class MainItem {
    public static void main(String[] args) {
        Item item = new Item("엑스칼리버", 10000, 500);

        System.out.println("아이템명:" + item.getName());
        System.out.println("아이템가격:" + item.getPrice());

//        Item item1 = new Item();
//        System.out.println("아이템명:" + item1.getName());
//        System.out.println("아이템가격:" + item1.getPrice());

        Item item2 = new Item("검",50000,1000);
        System.out.println("아이템명:" + item2.getName());
        System.out.println("아이템가격:" + item2.getPrice());
        System.out.println("아이템파워:" + item2.getPower());
    }
}

package chp08.ex8_2;

public class MainDrink {
    private String name;
    private int price;

    public MainDrink(){
        System.out.println("default constructor 호출");
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "MainDrink{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public MainDrink(String name, int price){
        this.name = name;
        this.price = price;
    }
}

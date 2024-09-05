package lab1;

public class MainSquare {
    public static void main(String[] args) {
//        Square square = new Square();

//        square.setLength(9);
//        square.setArea();
//
//        System.out.printf("square length: %d square area: %d", square.getLength(), square.getArea());
//
        Square s1 = new Square();
        s1.setLength(15);
        int result1 = s1.area();

        Square s2 = new Square();
        s2.setLength(7);
        int result2 = s2.area();


        System.out.printf("길이가 %d㎝인 정사각형의 넓이는 %d㎠ 입니다.\n", s1.getLength(), result1);
        System.out.printf("길이가 %d㎝인 정사각형의 넓이는 %d㎠ 입니다.\n", s2.getLength(), result2);
    }
}

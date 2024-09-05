public class rectangle {
    int length;
    int height;

    double getVoulume(){
        return length * length * height;
    }

    double getSurfaceArea(){
        double rectangleArea = length * length;
        double Area = length * length * height;
        return rectangleArea + Area;
    }

    public static void main(String[] args) {
        rectangle r = new rectangle();

        r.length = 5;
        r.height = 5;

        System.out.printf("정사각형의 부피: %.2f\n", r.getVoulume());
        System.out.printf("정사각형의 넓이: %.2f\n", r.getSurfaceArea());
    }
}

public class Cylinder {
    int radius;
    int height;

    double getVoulume(){
        return radius * radius * Math.PI * height;
    }
    double getSurfaceArea(){
        double circleArea = Math.PI * radius * radius;
        double rectangleArea = height * 2 * radius * Math.PI;
        return 2* circleArea + rectangleArea;
    }

    public static void main(String[] args) {
        Cylinder c = new Cylinder();

        c.radius = 4;
        c.height = 5;

        System.out.printf("원기둥의 부피: %.2f\n", c.getVoulume());
        System.out.printf("원기둥의 겉넓이: %.2f\n", c.getSurfaceArea());
    }
}

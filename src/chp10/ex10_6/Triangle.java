package chp10.ex10_6;

public class Triangle extends Shape{
    private int length;
    private int height;

    @Override
    double area() {
        double result = (length*height)/2.0;
        return result;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

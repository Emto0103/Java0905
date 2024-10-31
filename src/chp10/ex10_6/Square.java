package chp10.ex10_6;

public class Square extends Shape{
    private int length;

    @Override
    double area(){
        double result = Math.pow(length, 2);
        return result;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}

package lab1;

public class Square {
    // 한변의 길이
    private int length;
//    private int area;

//    public int getLength() {
//        return length;
//    }
//    public void setLength(int length) {
//        this.length = length;
//    }
//    public int getArea() {
//        return area;
//    }
//    public void setArea(int area) {
//        this.area = area;
//    }
    public int getLength() {
        return length;
    }
    public void setLength(int length){
        this.length = length;
    }
    public int area(){
        int result = (int)Math.pow(length, 2); //length*length
        return result;
    }
}

package chp10.ex10_9;

public class Dog extends Animal{

    @Override
    public void eat(String food) {
        System.out.println(getName() + "가(이)" + food + "를 먹는다");
    }

    @Override
    public void cry(String sound) {
        System.out.println(getName() + "가(이)" + sound + "하고 소리낸다");
    }

    public void wag(){
        System.out.println(getName() + "꼬리를 살랑살랑 흔든다");
    }
}

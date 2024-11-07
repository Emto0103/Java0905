package chp10.ex10_9;

public class MainAnimal {
    public static void main(String[] args) {
        //추상클래스는 new 연산자로 객체 생성이 불가능하다
        //Animal animal = new animal();

        Dog dog = new Dog(); //Object Animal Dog의 객체 생성
        Cat cat = new Cat();

        dog.setName("말티즈");
        dog.eat("사료");
        dog.cry("멍멍");
        dog.sleep(5);
        dog.wag();

        cat.setName("릴리");
        cat.eat("츄르");
        cat.cry("야옹");
        cat.sleep(3);
        cat.grooming();

        Animal animal = new Dog();
        //업캐스팅을 하면 부모 클래스의 모든 멤버 사용가능
        //그러나 자식 클래스의 멤버는 오버라이딩된 것만 사용가능
    }
}

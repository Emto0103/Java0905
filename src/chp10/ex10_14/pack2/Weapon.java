package chp10.ex10_14.pack2;

import chp10.ex10_14.pack1.Item;

public class Weapon extends Item {

    int power;

    public Weapon(String name, int price, int power){
        super(name, price);
    }

    public void print(){
        System.out.printf("[%s] 가격: %d 골드, 공격력: %d\n", super.name, super.price, power);
    }
}
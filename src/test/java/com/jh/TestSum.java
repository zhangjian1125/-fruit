package com.jh;


import com.jh.pojo.Fruit;
import com.sun.corba.se.impl.orbutil.ObjectStreamClassUtil_1_3;
import org.junit.Test;

import java.util.Scanner;

public class TestSum {
    @Test
    public void customerA() {
        Fruit apple = new Fruit("apple", 8);
        Fruit strawberry = new Fruit("strawberry", 13);
        System.out.println("顾客A买5斤苹果，3斤草莓");
        int sum = apple.getPrice()*5+strawberry.getPrice()*3;
        System.out.println("购买需花费"+sum);
    }

    @Test
    public void customerB() {
        Fruit apple = new Fruit("apple", 8);
        Fruit strawberry = new Fruit("strawberry", 13);
        Fruit mango = new Fruit("mango", 20);
        System.out.println("顾客B买5斤苹果，3斤草莓,2斤芒果");
        int sum = apple.getPrice()*5+strawberry.getPrice()*3+mango.getPrice()*2;
        System.out.println("购买需花费"+sum);
    }

    @Test
    public void customerC() {
        Fruit apple = new Fruit("apple", 8);
        Fruit strawberry = new Fruit("strawberry", 13);
        Fruit mango = new Fruit("mango", 20);
        System.out.println("顾客c买5斤苹果，5斤草莓,2斤芒果");
        double sum = apple.getPrice() * 5 + strawberry.getPrice() * 5 * 0.8 + mango.getPrice() * 2;
        System.out.println("购买需花费"+sum);
    }

    @Test
    public void customerD() {
        Fruit apple = new Fruit("apple", 8);
        Fruit strawberry = new Fruit("strawberry", 13);
        Fruit mango = new Fruit("mango", 20);
        System.out.println("顾客c买5斤苹果，5斤草莓,2斤芒果");
        double sum = apple.getPrice() * 5 + strawberry.getPrice() * 5 * 0.8 + mango.getPrice() * 2;
        if (sum>100) {
            double sumFruit = sum - 10;

        System.out.println("购买需花费"+sumFruit);
        }
    }
}

package com.ArrayList;
import java.util.ArrayList;
public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>(30);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);
        number.add(6);
        number.add(2,7);
        System.out.println(number.get(4));
        System.out.println(number);
    }
}

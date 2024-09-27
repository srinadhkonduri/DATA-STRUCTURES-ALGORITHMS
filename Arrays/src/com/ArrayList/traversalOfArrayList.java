package com.ArrayList;

import java.util.ArrayList;

public class traversalOfArrayList {
    public static void main(String[] args) {
        ArrayList<String > name = new ArrayList<>();
        name.add("a");
        name.add("b");
        name.add("c");
        name.add("d");
        name.add("e");
        name.add("f");
        name.add("g");
        for (int i = 0; i < name.size(); i++) {
            System.out.println(name.get(i));
        }
    }
}
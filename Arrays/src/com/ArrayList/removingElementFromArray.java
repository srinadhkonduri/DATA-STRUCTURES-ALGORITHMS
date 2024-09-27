package com.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class removingElementFromArray {
    public static void main(String[] args) {
        ArrayList<String> stringLine = new ArrayList<>(Arrays.asList("a","b","c","d","e"));
        stringLine.remove("b");
        System.out.println(stringLine);
    }
}

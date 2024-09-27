package com.ArrayList;
import java.util.ArrayList;
import java.util.Arrays;

public class searchingElementInArray {
    public static void main(String[] args) {
        ArrayList<String > stringLine = new ArrayList<>(Arrays.asList("a","b","c","d","e"));
        for (String letter : stringLine){
            if (letter.equals("a")){
                System.out.println("element is found");
                break;
            } else {
                System.out.println("element not found in the array");
            }
        }
    }
}

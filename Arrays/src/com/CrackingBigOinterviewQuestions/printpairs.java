package com.CrackingBigOinterviewQuestions;

public class printpairs {
    public static void main(String[] args) {
        printpairs pp = new printpairs();
        int[] customArray = {1,2,3,4};
//        example of the solution
//        11,12,13,14
//        21,22,23,24
//        31,32,33,34
//        41,42,43,44
        pp.printPairs(customArray);
        System.out.println(".......");
        pp.printPairs1(customArray);

    }
    //    creating a method to print all the pairs in the array
    public void printPairs(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println(array[i] + "," + array[j]);
            }
        }
    }

    //    print pairs method except the first one
    public void printPairs1(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                System.out.println(array[i] + "," + array[j]);
            }
        }
    }
}

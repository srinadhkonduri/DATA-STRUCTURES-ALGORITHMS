package com.Programs;

public class GradingSystem {
    public static void main(String[] args) {
        int marks = 78;
        if (marks > 90){
            System.out.println("excellent");
        } else if (marks > 80 && marks <= 90) {
            System.out.println("good");
        } else if (marks >70 && marks <= 80) {
            System.out.println("fair");
        } else if (marks > 60 && marks <= 70) {
            System.out.println("meets expectations");
        } else if (marks <= 60) {
            System.out.println("need to improve");
        } else {
            System.out.println("failed");
        }
    }
}

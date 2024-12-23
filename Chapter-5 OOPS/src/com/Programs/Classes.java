package com.Programs;

public class Classes {
    public static void main(String[] args) {
        person p1 = new person();
        p1.name = "tony";
        p1.age = 21;
        System.out.println(p1.name + " " + p1.age);
        p1.hello();

        person p2 = new person(22,"stark");
        p2.hello();
        System.out.println(p2.name + " " + p2.age);
    }
//    creating a class.
    public static class person {
        int age;
        String name;
        void hello(){
            System.out.println("hello world");
        }
//        default constructor
        person(){

        }

//        parameterized constructor.
        person(int age, String name){
            this.age = age;
            this.name = name;
        }
    }
}

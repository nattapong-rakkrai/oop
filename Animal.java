package com.java21days;

public class Animal {
    char[] data = {'a','b','c'};
    double weight = 34.21;
    int amount = 10;
    String name = "หมา";
    String str = new String(data);
    String animalName1 = "Tiger";
    String animalName2 = "CAT";
    String animalName3 = "Lion";

   void printAnimals() {
       System.out.println("ชนิด : " + name);
       System.out.println("กี่ตัว : " + amount);
       System.out.println("น้ำหนัก :" + weight);

       System.out.println(str);
        System.out.println(animalName1);
        System.out.println(animalName2);
        System.out.println(animalName3);
//        IO.println("Tiger");
//        IO.println("CAT");
//        IO.print("Lion");
    }
}

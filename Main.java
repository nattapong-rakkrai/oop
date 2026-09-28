package com.java21days;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.printAnimals();
        IO.println("โปรแกรมจำหนายสินค้าร้านน้องติ๋ม");
        Menu menu = new Menu();
        menu.printMenu();
    }
}
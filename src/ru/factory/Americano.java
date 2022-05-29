package ru.factory;

public class Americano extends Coffee {
    @Override
    public void wakeUp() {
        super.wakeUp();
        System.out.println("Бодрящий американо");
    }
}

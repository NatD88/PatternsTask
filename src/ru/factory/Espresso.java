package ru.factory;

public class Espresso extends Coffee {
    @Override
    public void wakeUp() {
        super.wakeUp();
        System.out.println("Бодрящий эспрессо");
    }
}

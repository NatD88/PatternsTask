package ru.adapter;

public class MemoryCard implements SDInterface {

    @Override
    public void connect() {

        System.out.println("Поключена карта памяти");
    }
}

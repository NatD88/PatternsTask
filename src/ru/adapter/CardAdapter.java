package ru.adapter;

public class CardAdapter implements UsbInterface {
    private final MemoryCard memoryCard;

    public CardAdapter(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    @Override
    public void connect() {

        System.out.println("Адаптер подключен к PC");
        ;
        memoryCard.connect();

    }
}

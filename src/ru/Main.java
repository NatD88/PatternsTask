package ru;

import ru.adapter.CardAdapter;
import ru.adapter.MemoryCard;
import ru.adapter.PC;
import ru.factory.Coffee;
import ru.factory.CoffeeFactory;
import ru.factory.CoffeeType;
import ru.proxy.DbConnectImpl;
import ru.proxy.DbConnectProxy;
import ru.singleton.SingletonLog;

public class Main {

    public static void main(String[] args) {
        // Singleton
        SingletonLog singletonLog = SingletonLog.getInstance();
        singletonLog.printInfoAboutClass("Привет!");
        System.out.println();

        // Factory
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        CoffeeType coffeeType = CoffeeType.AMERICANO;
        Coffee coffee = coffeeFactory.getCoffee(coffeeType);
        coffee.wakeUp();
        System.out.println();

        // Adapter
        MemoryCard memoryCard = new MemoryCard();
        CardAdapter cardAdapter = new CardAdapter(memoryCard);
        PC pc = new PC();
        pc.readFromUsb(cardAdapter);
        System.out.println();

        //Proxy
        DbConnectImpl dbConnectImpl = new DbConnectImpl();
        DbConnectProxy dbConnectProxy = new DbConnectProxy(dbConnectImpl);
        dbConnectProxy.connectToDB();
        dbConnectProxy.connectToDB();

    }
}

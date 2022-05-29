package ru.proxy;

public class DbConnectProxy implements DbConnect {

    private final DbConnect dbConnectImpl;
    private String cache;

    public DbConnectProxy(DbConnect dbConnectImpl) {
        this.dbConnectImpl = dbConnectImpl;
        cache = "";
    }

    @Override
    public String connectToDB() {
        if (cache.isEmpty()) {
            cache = dbConnectImpl.connectToDB();
            return cache;
        } else {
            System.out.println("Поключено к " + cache + " через proxy");
            return cache;
        }
    }
}

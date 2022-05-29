package ru.proxy;

public class DbConnectImpl implements DbConnect {
    String dbName = "Base1";

    @Override
    public String connectToDB() {
        String fullUrl = "localhost/port/" + dbName;
        System.out.println("Подключено к " + fullUrl + " через класс DbConnectImpl");
        return fullUrl;
    }
}

package ru.singleton;

import java.util.Arrays;

public class SingletonLog {
    private static SingletonLog singletonLog;

    private SingletonLog() {
    }

    public static SingletonLog getInstance() {
        if (singletonLog == null) {
            singletonLog = new SingletonLog();
        }
        return singletonLog;
    }

    public void printInfoAboutClass(Object object) {
        System.out.println(object.getClass().getName());
        System.out.println(Arrays.toString(object.getClass().getMethods()));
    }
}

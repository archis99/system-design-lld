package org.archis.SingletonPattern;

public class LoggerSingleton {

    /*Eager Loading*/
    /* private static LoggerSingleton obj = new LoggerSingleton();

    private LoggerSingleton() {}

    public static LoggerSingleton getInstance() {
        return obj;
    }*/

    /*Lazy Loading*/
    /* private static LoggerSingleton obj = null;

    private LoggerSingleton() {}

    public static LoggerSingleton getInstance() {
        if (obj == null) {
            obj = new LoggerSingleton();
        }
        return obj;
    }*/

    /*Thread safe*/
    /* private static volatile LoggerSingleton obj = null;

    private LoggerSingleton() {}

    public static LoggerSingleton getInstance() {
        synchronized (LoggerSingleton.class) {
            if (obj == null) {
                obj = new LoggerSingleton();
            }
        }
        return obj;
    }*/


    /*Thread safe with extra check (fast)*/
    private static volatile LoggerSingleton obj = null;

    private LoggerSingleton() {}

    public static LoggerSingleton getInstance() {
        if (obj == null) {
            synchronized (LoggerSingleton.class) {
                if (obj == null) {
                    obj = new LoggerSingleton();
                }
            }
        }
        return obj;
    }
}

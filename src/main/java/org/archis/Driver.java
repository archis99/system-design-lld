package org.archis;

import org.archis.SingletonPattern.LoggerSingleton;

public class Driver {
    public static void main(String[] args) {
        // Strategy Pattern
//        Vehicle vehicle1 = new PassengerVehicle();
//        vehicle1.vehicleDrive();
//        Vehicle vehicle2 = new SportsVehicle();
//        vehicle2.vehicleDrive();
//        Vehicle vehicle3 = new OffRoadVehicle();
//        vehicle3.vehicleDrive();
//        System.out.println("-----------------");

        // Factory Pattern
//        OSFactory osFactory = new OSFactory();
//        OS os1 = osFactory.getInstance("Android");
//        os1.spec();
//        OS os2 = osFactory.getInstance("IOS");
//        os2.spec();
//        System.out.println("-----------------");

        // Prototype Pattern
//        BookShop bs1 = new BookShop();
//        bs1.setName("Book shop 1");
//        bs1.loadBooks();
//
//        BookShop bs2 = bs1.clone();
//        bs2.setName("Book shop 2");
//        bs1.getBookShop().remove(3);
//        System.out.println(bs1);
//        System.out.println(bs2);
//        System.out.println("-----------------");

        // Singleton Pattern
        LoggerSingleton singObj1 = LoggerSingleton.getInstance();
        System.out.println(singObj1);
        LoggerSingleton singObj2 = LoggerSingleton.getInstance();
        System.out.println(singObj2);
        System.out.println("-----------------");

        // Observer Pattern
//        StockObservable observable = new IphoneStockObservable();
//
//        NotificationObserver observer1 = new EmailNotificationObserver("abc@gmail.com", observable);
//        NotificationObserver observer2 = new EmailNotificationObserver("xyx@gmail.com", observable);
//        NotificationObserver observer3 = new MobileNotificationObserver(1234567890, observable);
//
//        observable.add(observer1);
//        observable.add(observer2);
//        observable.add(observer3);
//
//        observable.setStockCount(10);
//        observable.resetCount();
//        observable.setStockCount(50);
    }
}
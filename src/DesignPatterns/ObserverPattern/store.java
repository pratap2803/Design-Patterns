package DesignPatterns.ObserverPattern;

import DesignPatterns.ObserverPattern.Observable.IphoneObservableImpl;
import DesignPatterns.ObserverPattern.Observable.StocksObservable;
import DesignPatterns.ObserverPattern.Observer.EmailAlertObserverImpl;
import DesignPatterns.ObserverPattern.Observer.MobileAlertObserverImpl;
import DesignPatterns.ObserverPattern.Observer.NotificationAlertObserver;

public class store {

    public static void mainStore(){
        StocksObservable iphoneStockObservable = new IphoneObservableImpl();



        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("abc@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("abcd@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("abc_username", iphoneStockObservable);


        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(10);
    }

}

package DesignPatterns.ObserverPattern.Observer;

import DesignPatterns.ObserverPattern.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    String userName;
    StocksObservable observable;

    public MobileAlertObserverImpl(String userName, StocksObservable observable) {
        this.userName = userName;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMagOnMobile(userName, "product is in stock hurry up!!");
    }

    private void sendMagOnMobile(String userName, String msg) {
        System.out.println("msg sent to:" +  userName);
    }
}

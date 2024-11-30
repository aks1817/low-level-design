package Observer;

import Observable.StockObservable;

public class MobileAlertObserver implements NotificationAlertObserver {
    String phoneNumber;
    StockObservable observable;

    public MobileAlertObserver(StockObservable observable, String phoneNumber) {
        this.observable = observable;
        this.phoneNumber=phoneNumber;
    }

    @Override
    public void update() {
        sendMsg(phoneNumber, "product is in stock hurry up !");
    }

    private void sendMsg(String phoneNumber, String message) {
        System.out.println(phoneNumber +" "+ message);
    }
}

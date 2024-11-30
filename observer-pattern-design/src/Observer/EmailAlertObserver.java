package Observer;

import Observable.StockObservable;

public class EmailAlertObserver implements  NotificationAlertObserver{
    String emailId;
    StockObservable observable;

    public EmailAlertObserver(StockObservable observable, String emailId) {
        this.observable = observable;
        this.emailId=emailId;
    }

    @Override
    public void update() {
        sendMail(emailId, "product is in stock hurry up!");
    }

    private void sendMail(String emailId, String message) {
        System.out.println(emailId +" "+ message);
    }
}

import Observable.IphoneObservable;
import Observable.StockObservable;
import Observer.EmailAlertObserver;
import Observer.MobileAlertObserver;
import Observer.NotificationAlertObserver;

public class Main {
    public static void main(String[] args) {
        StockObservable iphoneStockObservable= new IphoneObservable();
        NotificationAlertObserver observer1=new EmailAlertObserver(iphoneStockObservable,"xyz1@gmail.com");
        NotificationAlertObserver observer2=new EmailAlertObserver(iphoneStockObservable,"xyz2@gmail.com");
        NotificationAlertObserver observer3=new MobileAlertObserver(iphoneStockObservable,"xyz3@gmail.com");

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(10);
        iphoneStockObservable.setStockCount(0);
        iphoneStockObservable.setStockCount(100);
    }
}
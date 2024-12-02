import Base.BasePizza;
import Base.Margherita;
import Decorator.ExtraCheese;
import Decorator.Mushroom;


public class Main {
    public static void main(String[] args) {
        BasePizza pizza=new Mushroom(new ExtraCheese(new Margherita()));
        System.out.println("Cost of pizza " + pizza.cost());
    }
}
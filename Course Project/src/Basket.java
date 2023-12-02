import java.util.ArrayList;
import java.util.List;
public class Basket {
    private List<EasterEgg> eggs;
    private List<BasketObserver> observers;

    public Basket() {
        eggs = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public void addEgg(EasterEgg egg) {
        eggs.add(egg);
        notifyObservers();
    }

    public void addObserver(BasketObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(BasketObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        int eggCount = eggs.size();

        for (BasketObserver observer : observers) {
            observer.update(eggCount);
        }
    }
}
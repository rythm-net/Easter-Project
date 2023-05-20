import java.util.List;
public class Main {
    public static void main(String[] args) {
        EasterBunny bunny = EasterBunny.getInstance();

        List<EasterEgg> eggs = bunny.createEasterEggs(10);

        Basket basket = new Basket();
        basket.addObserver(new ChickenObserver());
        basket.addObserver(new QuailObserver());
        basket.addObserver(new DinosaurObserver());

        for (EasterEgg egg : eggs) {
            basket.addEgg(egg);
        }
    }
}
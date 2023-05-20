import java.util.ArrayList;
import java.util.List;

// Singleton - Easter Bunny
public class EasterBunny {
    private static EasterBunny instance;

    private EasterBunny() {
        // Private constructor to prevent instantiation
    }

    public static EasterBunny getInstance() {
        if (instance == null) {
            instance = new EasterBunny();
        }
        return instance;
    }

    public List<EasterEgg> createEasterEggs(int count) {
        List<EasterEgg> eggs = new ArrayList<>();
        EasterEggFactory eggFactory = new EasterEggFactory();

        for (int i = 0; i < count; i++) {
            EasterEgg egg = eggFactory.createEgg();
            eggs.add(egg);
        }

        return eggs;
    }
}

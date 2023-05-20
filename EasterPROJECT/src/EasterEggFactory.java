import java.util.Random;

// Factory - Easter Egg Factory
public class EasterEggFactory {
    public EasterEgg createEgg() {
        Random random = new Random();
        int eggType = random.nextInt(3);

        switch (eggType) {
            case 0:
                return new ChickenEgg();
            case 1:
                return new QuailEgg();
            case 2:
                return new DinosaurEgg();
            default:
                return null;
        }
    }
}

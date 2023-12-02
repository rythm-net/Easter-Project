public class QuailObserver implements BasketObserver {
    @Override
    public void update(int eggCount) {
        if (eggCount > 5) {
            System.out.println("Eggs are ready!");
        }
    }
}
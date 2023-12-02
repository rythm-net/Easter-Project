public abstract class DecoratedEasterEgg implements EasterEgg {
    protected EasterEgg decoratedEgg;

    public DecoratedEasterEgg(EasterEgg decoratedEgg) {
        this.decoratedEgg = decoratedEgg;
    }

    @Override
    public void decorate() {
        decoratedEgg.decorate();
    }
}
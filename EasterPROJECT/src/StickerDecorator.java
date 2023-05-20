public class StickerDecorator extends DecoratedEasterEgg {
    public StickerDecorator(EasterEgg decoratedEgg) {
        super(decoratedEgg);
    }

    @Override
    public void decorate() {
        super.decorate();
        addSticker();
    }

    private void addSticker() {
        System.out.println("Adding a sticker to the egg");
    }
}
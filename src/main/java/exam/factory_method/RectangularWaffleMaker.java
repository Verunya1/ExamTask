package exam.factory_method;

public class RectangularWaffleMaker implements WaffleMaker {
    @Override
    public Waffle factoryMethod() {
        return new RectangularWaffle();
    }
}

package exam.factory_method;

public class CircleWaffleMaker implements WaffleMaker {
    @Override
    public Waffle factoryMethod() {
        return new CircleWaffle();
    }
}

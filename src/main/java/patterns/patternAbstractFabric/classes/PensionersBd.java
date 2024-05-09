package patterns.patternAbstractFabric.classes;

import patterns.patternAbstractFabric.abstractFactory.AbstractFactory;
import patterns.patternAbstractFabric.intefracesOfClasses.Cake;
import patterns.patternAbstractFabric.intefracesOfClasses.Card;
import patterns.patternAbstractFabric.intefracesOfClasses.Gift;

public class PensionersBd implements AbstractFactory {
    @Override
    public Gift getGift() {
        return new OldGift();
    }

    @Override
    public Card getCard() {
        return new OldCard();
    }

    @Override
    public Cake getCake() {
        return new OldCake();
    }
}

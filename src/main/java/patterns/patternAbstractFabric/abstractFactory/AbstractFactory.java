package patterns.patternAbstractFabric.abstractFactory;

import patterns.patternAbstractFabric.intefracesOfClasses.Cake;
import patterns.patternAbstractFabric.intefracesOfClasses.Card;
import patterns.patternAbstractFabric.intefracesOfClasses.Gift;

public interface AbstractFactory {
     Gift getGift();
     Card getCard();
     Cake getCake();
}

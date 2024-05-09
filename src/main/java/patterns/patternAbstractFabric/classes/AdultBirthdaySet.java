package patterns.patternAbstractFabric.classes;

import patterns.patternAbstractFabric.abstractFactory.AbstractFactory;
import patterns.patternAbstractFabric.intefracesOfClasses.Cake;
import patterns.patternAbstractFabric.intefracesOfClasses.Card;
import patterns.patternAbstractFabric.intefracesOfClasses.Gift;

public class AdultBirthdaySet implements AbstractFactory {
    public Gift getGift(){return new AdultGift();}
    public Card getCard(){return new AdultCard();}
    public Cake getCake(){return new AdultCake();}
}

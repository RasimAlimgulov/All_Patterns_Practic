package patterns.patternAbstractFabric.classes;

import patterns.patternAbstractFabric.abstractFactory.AbstractFactory;

public class KidsBirthdaySet implements AbstractFactory {
    public KidsGift getGift(){return new KidsGift();}
    public KidsCard getCard(){return new KidsCard();}
    public KidsCake getCake(){return new KidsCake();}
}

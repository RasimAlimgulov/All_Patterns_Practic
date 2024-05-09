package patterns.patternAbstractFabric.classes;

import patterns.patternAbstractFabric.intefracesOfClasses.Gift;

public class OldGift implements Gift {
    @Override
    public String getName() {
        return "Трость";
    }
}

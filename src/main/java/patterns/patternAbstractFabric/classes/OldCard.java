package patterns.patternAbstractFabric.classes;

import patterns.patternAbstractFabric.intefracesOfClasses.Card;

public class OldCard implements Card {
    @Override
    public String getName() {
        return "Советская открытка";
    }
}

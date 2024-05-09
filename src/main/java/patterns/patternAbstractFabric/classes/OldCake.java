package patterns.patternAbstractFabric.classes;

import patterns.patternAbstractFabric.intefracesOfClasses.Cake;

public class OldCake implements Cake {
    @Override
    public String getName() {
        return "Тортик без сахара";
    }
}

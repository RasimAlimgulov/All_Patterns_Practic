package patterns.patternFabricMethod;

public class BMVFactory implements Factory{
    @Override
    public Car createCar() {
        return new BMV();
    }
}

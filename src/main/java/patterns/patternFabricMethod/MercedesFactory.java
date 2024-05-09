package patterns.patternFabricMethod;

public class MercedesFactory implements Factory{
    @Override
    public Car createCar() {
        return new Mercedes();
    }
}

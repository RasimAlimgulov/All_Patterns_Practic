package patterns.patternFabricMethod;

public class MatizFactory implements Factory{
    @Override
    public Car createCar() {
        return new Matiz();
    }
}

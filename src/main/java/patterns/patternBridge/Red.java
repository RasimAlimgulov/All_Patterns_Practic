package patterns.patternBridge;

public class Red implements Color{
    @Override
    public void fillColor() {
        System.out.println("Red");
    }
}

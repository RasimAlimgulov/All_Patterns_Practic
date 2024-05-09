package patterns.patternStrategy;

public class FirstStrategy implements Strategy{
    @Override
    public void hello() {
        System.out.println("Hello first");
    }

    @Override
    public int getAge() {
        return 12;
    }

    @Override
    public String getName() {
        return "Rasim";
    }
}

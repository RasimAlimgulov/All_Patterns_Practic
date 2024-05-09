package patterns.patternStrategy;

public class SecondStrategy implements Strategy{
    @Override
    public void hello() {
        System.out.println("Hello Second");
    }

    @Override
    public int getAge() {
        return 23;
    }

    @Override
    public String getName() {
        return "Ruslan";
    }
}

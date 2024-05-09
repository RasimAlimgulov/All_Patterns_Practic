package patterns.patternStrategy;

public class ThirdStrategy implements Strategy{
    @Override
    public void hello() {
        System.out.println("Hello Third!");
    }

    @Override
    public int getAge() {
        return 45;
    }

    @Override
    public String getName() {
        return "Nikolay";
    }
}

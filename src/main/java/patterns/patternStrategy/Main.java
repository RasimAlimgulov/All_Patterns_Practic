package patterns.patternStrategy;

public class Main {
    public static void main(String[] args) {
    StrategyHandler strategyHandler=new StrategyHandler(new ThirdStrategy());
    strategyHandler.hello();
        System.out.println(strategyHandler.getAge());
    System.out.println(strategyHandler.getName());
    }
}
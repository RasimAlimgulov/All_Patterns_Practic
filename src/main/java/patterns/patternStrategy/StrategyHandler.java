package patterns.patternStrategy;

public class StrategyHandler {
    private Strategy strategy;

    public StrategyHandler(Strategy strategy){
        this.strategy=strategy;
    }
    public void hello() {
      strategy.hello();
    }

    public int getAge() {
        return strategy.getAge();
    }

    public String getName() {
        return strategy.getName();
    }

}

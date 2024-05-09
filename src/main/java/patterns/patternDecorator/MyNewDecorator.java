package patterns.patternDecorator;

public class MyNewDecorator extends MyDecorator{
    public MyNewDecorator(SomeInterface myClass) {
        super(myClass);
    }

    @Override
    public void method() {
        System.out.println("My new Decorator");
        super.method();
    }
}

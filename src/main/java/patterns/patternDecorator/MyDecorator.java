package patterns.patternDecorator;

public class MyDecorator implements SomeInterface {
    SomeInterface myClass;
    public MyDecorator(SomeInterface myClass){
        this.myClass=myClass;
    }

    public void method() {
        System.out.println("My Decorator");
        myClass.method();
    }

}

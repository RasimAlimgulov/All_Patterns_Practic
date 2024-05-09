package patterns.patternProxy;

public class MyProxy implements MyInterface{
    private MyClass myClass=new MyClass();
    @Override
    public void method1() {
        System.out.println("Proxy:");
        myClass.method1();
    }
    @Override
    public void method2() {
        System.out.println("Proxy:");
        myClass.method2();
    }
}

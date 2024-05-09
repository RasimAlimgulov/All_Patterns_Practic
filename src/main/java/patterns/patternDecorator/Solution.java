package patterns.patternDecorator;



public class Solution {
    public static void main(String[] args) {
        SomeInterface myInterface=new MyDecorator(new MyNewDecorator(new MyClass()));
       myInterface.method();
    }

}

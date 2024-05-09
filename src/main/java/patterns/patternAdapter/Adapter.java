package patterns.patternAdapter;

public class Adapter implements NewInterface{
    OldInterface oldInterface;
    public Adapter(OldInterface oldInterface){
        this.oldInterface=oldInterface;
    }
    @Override
    public void newfirstMethod() {
       oldInterface.firstMethod();
    }
    @Override
    public void newsecondMethod() {
       oldInterface.secondMethod();
    }
    @Override
    public void newthirdMethod() {
       oldInterface.thirdMethod();
    }
}

package patterns.patternProxy;

public class MyClass implements MyInterface{
    private String path;

    public void method1(){
        System.out.println("M1");
    }
    public void method2(){
        System.out.println("M2");
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}

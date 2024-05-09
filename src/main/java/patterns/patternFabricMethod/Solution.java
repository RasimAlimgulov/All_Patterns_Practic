package patterns.patternFabricMethod;

public class Solution {
    public static void main(String[] args) throws Exception {
      Factory factory=getFactory("Matiz");
      factory.createCar().price();
    }
    private static Factory getFactory(String name) throws Exception {
        switch (name){
            case "Matiz": return new MatizFactory();
            case "BMV": return new BMVFactory();
            case "Mercedes": return new MercedesFactory();
            default: throw new Exception("No Factory");
        }
    }
}

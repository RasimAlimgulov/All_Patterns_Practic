package patterns.patternFabric;

public class MyFabric {

    public static Animal getAnimal(Animals animals) throws Exception {
        switch (animals){
            case DOG -> {
                return new Dog();
            }
            case LION -> {
                return new Lion();
            }
            case MONKEY -> {
                return new Monkey();
            }
            default -> {throw new Exception();}
        }
    }
}

package catInTheHat;

public class CatInTheHat extends Thing implements ConscienceInterface {

    public CatInTheHat(String name) {
        super(name);
    }

    @Override
    public void think() {
        System.out.println("Hmmmm.......");
    }

    @Override
    public void speak() {
        System.out.println("Hello");
    }
    public void speak(String sentence) {
        System.out.println(sentence);
    }
    @Override
    public void createChaos(){
        System.out.println("I do not make mess");
    }





}

package catInTheHat;

public class Thing implements ThingInterface {

    // properties
    private String thingName;

    public Thing(String name){
        this.thingName = name;
    }

    @Override
    public String getThingName() {
        return this.thingName;
    }

    @Override
    public void createChaos() {
        System.out.println(this.thingName + " has created a mess.");
    }

    @Override
    public void cleanup() {
        System.out.println(this.thingName + " has cleaned up a mess.");
    }


}

package quests.vehicle;

public class Cars extends Vehicle {

    public Cars(String brand, int kilometers) {
        super(brand, kilometers);
    }
    @Override
    public String doStuff() {
        return "Je suis " + getBrand() + " et je fais vroum.";
    }
}

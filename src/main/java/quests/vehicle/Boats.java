package quests.vehicle;

public class Boats extends Vehicle {

    public Boats(String brand, int kilometers) {
        super(brand, kilometers);
    }

    @Override
    public String doStuff() {
        return "Je suis " + getBrand() + " et je fais glou.";
    }
}

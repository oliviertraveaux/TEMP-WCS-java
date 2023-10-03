package quests.vehicle;

public class Hangar {
    public static void main(String[] args) {
        Cars clio = new Cars("Clio", 10000);
        Boats titanic = new Boats("Titanic", 5000);

        System.out.println(clio.doStuff());
        System.out.println(titanic.doStuff());
    }
}

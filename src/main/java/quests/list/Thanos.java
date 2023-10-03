package quests.list;

        import java.util.ArrayList;
        import java.util.Collections;
        import java.util.List;

public class Thanos {

    public static void main(String[] args) {

        ArrayList<Hero> heroes = new ArrayList<>();
        int thorIndex = 0;

        heroes.add(new Hero("Black Widow", 34));
        heroes.add(new Hero("Captain America", 100));
        heroes.add(new Hero("Vision", 3));
        heroes.add(new Hero("Iron man", 48));
        heroes.add(new Hero("Scarlet Witch", 29));
        heroes.add(new Hero("Thor", 1500));
        heroes.add(new Hero("Hulk", 49));
        heroes.add(new Hero("Doctor Strange", 42));

        for(int i = 0; i < heroes.size(); i++) {
            if (heroes.get(i).getName().equals("Thor")) {
                thorIndex = i;
            }
        }

        int halfList = heroes.size()/2;

        System.out.println("Original list");
        System.out.println(heroes + "\n");

        heroes.get(thorIndex).setAge(1501);

        System.out.println("Thor age has changed");
        System.out.println(heroes + "\n");

        Collections.shuffle(heroes);

        System.out.println("Shuffle");
        System.out.println(heroes + "\n");

        List<Hero> reducedList = heroes.subList(0, halfList);

        System.out.println("List cut in half \n");
        for(Hero hero : reducedList) {
            System.out.println(hero.getName());
        }
    }
}





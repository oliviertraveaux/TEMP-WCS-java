package quests.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Thanos {

    public static void main(String[] args) {

        List<Hero> heroes = new ArrayList<>();
        heroes.add(new Hero("Hulk", 49));
        heroes.add(new Hero("Black Widow", 34));
        heroes.add(new Hero("Captain America", 100));
        heroes.add(new Hero("Thor", 1501));

        Comparator<Hero> comparatorAge = new Comparator<Hero>() {
            @Override
            public int compare(Hero hero1, Hero hero2) {
                return hero2.getAge() - hero1.getAge();
            }
        };

        Collections.sort(heroes);

        System.out.println("\nOrder by name:");
        showList(heroes);

//        Order by name:
//        Black Widow, 34
//        Captain America, 100
//        Hulk, 49
//        Thor, 1501


        Collections.sort(heroes, comparatorAge);

        System.out.println("\nOrder by age:");
        showList(heroes);

//        Order by age:
//        Thor, 1501
//        Captain America, 100
//        Hulk, 49
//        Black Widow, 34

    }

    private static void showList(List<Hero> heroes) {
        for (Hero heroe : heroes) {
            System.out.println(heroe.getName() + ", " + heroe.getAge());
        }
    }
}
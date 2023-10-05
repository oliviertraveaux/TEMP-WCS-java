package quests.list;

import java.util.Comparator;

public class Hero implements Comparable<Hero> {

    // attributs
    private String name;
    private int age;

    // constructeurs
    public Hero(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // accesseurs (getters)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // mutateurs (setters)
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Hero hero) {
        if (this.getName() == null && hero.getName() == null) {
            return 0;
        } else if (this.getName() == null) {
            return -1; // Consider null as less than any non-null value
        } else if (hero.getName() == null) {
            return 1; // Consider any non-null value greater than null
        } else {
            return this.getName().compareTo(hero.getName());
        }
    }

}
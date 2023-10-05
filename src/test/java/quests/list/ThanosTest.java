package quests.list;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ThanosTest {


    @Test
    @DisplayName("Sort the list by age")
    void compareToStandard() {
        List<Hero> heroes = new ArrayList<>();
        Hero hero1 = new Hero("Hulk", 49);
        Hero hero2 = new Hero("Black Widow", 34);
        assertTrue(hero2.compareTo(hero1) < 0);
        assertEquals(0, hero1.compareTo(hero1));
    }
}

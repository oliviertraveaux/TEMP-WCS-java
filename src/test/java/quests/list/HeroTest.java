package quests.list;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeroTest {

    private Hero cutStandard;
    private Hero cutStandard2;
    private Hero cutNullName;
    private Hero cutNullName2;

    @BeforeEach
    void setup() {
        cutStandard = new Hero("Superman", 55);
        cutStandard2 = new Hero("Hulk", 45);
        cutNullName = new Hero(null, 55);
        cutNullName2 = new Hero(null, 30);
    }

    @Test
    @DisplayName("Get the name")
    void getNameStandard() {
        assertEquals("Superman", cutStandard.getName());
    }

    @Test
    @DisplayName("Get a null name")
    void getNameNull() {
        assertNull(cutNullName.getName());
    }

    @Test
    @DisplayName("Set the name")
    void setNameStandard() {
        cutStandard.setName("Batman");
        assertEquals("Batman", cutStandard.getName());
    }

    @Test
    @DisplayName("Set a null name")
    void setNameNull() {
        cutStandard.setName(null);
        assertNull(cutStandard.getName());
    }

    @Test
    @DisplayName("CompareTo names Superman and Hulk returns positive")
    void compareToNamePositive() {
        assertTrue(cutStandard.compareTo(cutStandard2) > 0);
    }

    @Test
    @DisplayName("CompareTo names Hulk and Superman returns negative")
    void compareToNameNegative() {
        assertTrue(cutStandard2.compareTo(cutStandard) < 0);
    }

    @Test
    @DisplayName("CompareTo names Superman and Superman returns 0")
    void compareToNameEquals() {
        assertEquals(0, cutStandard.compareTo(cutStandard));
    }

    @Test
    @DisplayName("CompareTo names Superman and null returns 1")
    void compareToNameStandardAndNull() {
        assertEquals(1, cutStandard.compareTo(cutNullName));
    }

    @Test
    @DisplayName("CompareTo names null and null returns 0")
    void compareToNameNullAndNull() {
        assertEquals(0, cutNullName.compareTo(cutNullName2));
    }

    @AfterEach
    void teardown() {
        cutStandard = null;
        cutStandard2 = null;
        cutNullName = null;
        cutNullName2 = null;
    }
}

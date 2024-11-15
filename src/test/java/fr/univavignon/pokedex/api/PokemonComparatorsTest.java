package fr.univavignon.pokedex.api;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PokemonComparatorsTest {
    @Test
    public void testCompareByName() {
        Pokemon p1 = new Pokemon(1, "Bulbizarre", 126, 126, 90, 613,50,50,50,50);
        Pokemon p2 = new Pokemon(2, "Carapuce", 156, 158, 120, 1000,50,50,50,50);
        assertTrue(PokemonComparators.NAME.compare(p1, p2) < 0);
    }

    @Test
    public void testCompareByIndex() {
        Pokemon p1 = new Pokemon(1, "Bulbizarre", 126, 126, 90, 613,50,50,50,50);
        Pokemon p2 = new Pokemon(2, "Carapuce", 156, 158, 120, 1000,50,50,50,50);
        assertTrue(PokemonComparators.INDEX.compare(p1, p2) < 0);
    }

    @Test
    public void testCompareByCp() {
        Pokemon p1 = new Pokemon(1, "Bulbizarre", 126, 126, 90, 613,50,50,50,50);
        Pokemon p2 = new Pokemon(2, "Carapuce", 156, 158, 120, 1000,50,50,50,50);
        assertTrue(PokemonComparators.CP.compare(p1, p2) < 0);
    }
}

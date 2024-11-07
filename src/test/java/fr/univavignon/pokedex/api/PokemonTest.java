package fr.univavignon.pokedex.api;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PokemonTest {
    private Pokemon carapuce;

    @Before
    public void setUp() {
        carapuce = new Pokemon(7, "Carapuce", 126, 120, 70, 12, 100, 100, 25, 90.0);
    }

    @Test
    public void testGetCp() {
        assertEquals(12, carapuce.getCp());
    }
    @Test
    public void testGetHp() {
        assertEquals(100, carapuce.getHp());
    }
    @Test
    public void testGetDust() {
        assertEquals(100, carapuce.getDust());
    }
    @Test
    public void testGetCandy() {
        assertEquals(25, carapuce.getCandy());
    }
    @Test
    public void testGetIv() {
        assertEquals(90.0, carapuce.getIv(), 0.0);
    }
}

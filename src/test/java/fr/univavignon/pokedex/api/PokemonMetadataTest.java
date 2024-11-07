package fr.univavignon.pokedex.api;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PokemonMetadataTest {
    private PokemonMetadata carapuce;

    @Before
    public void setUp() {
        carapuce = new PokemonMetadata(7, "Carapuce", 126, 120, 70);
    }

    @Test
    public void testGetAttack() {
        assertEquals(126, carapuce.getAttack());
    }
    @Test
    public void testGetDefense() {
        assertEquals(120, carapuce.getDefense());
    }
    @Test
    public void testGetStamina() {
        assertEquals(70, carapuce.getStamina());
    }
    @Test
    public void testGetIndex() {
        assertEquals(7, carapuce.getIndex());
    }
    @Test
    public void testGetName() {
        assertEquals("Carapuce", carapuce.getName());
    }
}

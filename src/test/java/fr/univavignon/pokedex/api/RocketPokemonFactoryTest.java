package fr.univavignon.pokedex.api;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RocketPokemonFactoryTest {
    @Test
    public void testCreatePokemon() throws PokedexException {
        PokemonFactory pokemonFactory = new PokemonFactory();
        Pokemon pokemon = pokemonFactory.createPokemon(0, 160, 150, 140, 100);
        assertEquals(pokemon.getIndex(), 0);
        assertEquals(pokemon.getName(), "Bulbizarre");
        assertEquals(pokemon.getAttack(), 126);
        assertEquals(pokemon.getDefense(), 126);
        assertEquals(pokemon.getStamina(), 90);
        assertEquals(pokemon.getCp(), 160);
        assertEquals(pokemon.getHp(), 150);
        assertEquals(pokemon.getDust(), 140);
        assertEquals(pokemon.getCandy(), 100);

    }
    @Test
    public void testGenerateRandomStat() {
        int stat = RocketPokemonFactory.generateRandomStat();
        assertTrue(stat >= 0 && stat <= 100);
    }
}

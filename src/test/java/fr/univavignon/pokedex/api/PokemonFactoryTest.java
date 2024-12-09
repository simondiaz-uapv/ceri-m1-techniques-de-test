package fr.univavignon.pokedex.api;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PokemonFactoryTest {
    @Test
    public void testCreatePokemon() throws PokedexException {
        PokemonFactory pokemonFactory = new PokemonFactory();
        Pokemon pokemon = pokemonFactory.createPokemon(1, 160, 150, 140, 100);
        assertEquals(pokemon.getIndex(), 1);
        assertEquals(pokemon.getName(), "Bulbasaur");
        assertTrue(pokemon.getAttack() <= 100 && pokemon.getAttack()>=0);
        assertTrue(pokemon.getDefense() <= 100 && pokemon.getDefense()>=0);
        assertTrue(pokemon.getStamina() <= 100 && pokemon.getStamina()>=0);
        assertEquals(pokemon.getCp(), 160);
        assertEquals(pokemon.getHp(), 150);
        assertEquals(pokemon.getDust(), 140);
        assertEquals(pokemon.getCandy(), 100);

    }
}

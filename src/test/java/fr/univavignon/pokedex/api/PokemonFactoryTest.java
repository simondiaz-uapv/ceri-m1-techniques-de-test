package fr.univavignon.pokedex.api;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PokemonFactoryTest {
    @Test
    public void testCreatePokemon(){
        PokemonFactory pokemonFactory = new PokemonFactory();
        Pokemon pokemon = pokemonFactory.createPokemon(150, 160, 150, 140, 100);
        assertEquals(pokemon.getIndex(), 150);
        assertEquals(pokemon.getName(), "Mewtwo");
        assertEquals(pokemon.getAttack(), 160);
        assertEquals(pokemon.getDefense(), 150);
        assertEquals(pokemon.getStamina(), 140);
        assertEquals(pokemon.getCp(), 160);
        assertEquals(pokemon.getHp(), 150);
        assertEquals(pokemon.getDust(), 140);
        assertEquals(pokemon.getCandy(), 100);

    }
}

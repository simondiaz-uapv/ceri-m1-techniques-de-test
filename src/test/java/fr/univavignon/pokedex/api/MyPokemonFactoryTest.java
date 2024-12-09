package fr.univavignon.pokedex.api;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyPokemonFactoryTest {
    @Test
    public void testCreatePokemon() throws PokedexException {
        MyPokemonFactory pokemonFactory = new MyPokemonFactory();
        Pokemon pokemon = pokemonFactory.createPokemon(0, 160, 150, 140, 100);
        assertEquals(pokemon.getIndex(), 0);
        assertEquals(pokemon.getName(), "Bulbizarre");
        assertEquals(126, pokemon.getAttack());
        assertEquals(126, pokemon.getDefense());
        assertEquals(90, pokemon.getStamina());
        assertEquals(pokemon.getCp(), 160);
        assertEquals(pokemon.getHp(), 150);
        assertEquals(pokemon.getDust(), 140);
        assertEquals(pokemon.getCandy(), 100);

    }
    @Test
    public void testCreatePokemonException() {
        MyPokemonFactory pokemonFactory = new MyPokemonFactory();
        try {
            Pokemon pokemon = pokemonFactory.createPokemon(3, 160, 150, 140, 100);
        } catch (PokedexException e) {
            assertEquals(e.getMessage(), "Index non correspondant a un pokemon");
        }
    }
}

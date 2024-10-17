package fr.univavignon.pokedex.api;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class IPokemonFactoryTest {

    private IPokemonFactory pokemonFactory;

    @Before
    public void setUp() {
        pokemonFactory = Mockito.mock(IPokemonFactory.class);
    }

    @Test
    public void testCreatePokemon() {
        Pokemon bulbizarre = new Pokemon(0, "Bulbizarre", 613, 64, 4000, 4, 126, 126, 90, 56.0);
        Pokemon aquali = new Pokemon(133, "Aquali", 2729, 202, 5000, 4, 186, 168, 260, 100.0);

        when(pokemonFactory.createPokemon(0, 613, 64, 4000, 4)).thenReturn(bulbizarre);
        when(pokemonFactory.createPokemon(133, 2729, 202, 5000, 4)).thenReturn(aquali);

        assertEquals(bulbizarre, pokemonFactory.createPokemon(0, 613, 64, 4000, 4));
        assertEquals(aquali, pokemonFactory.createPokemon(133, 2729, 202, 5000, 4));
    }
}
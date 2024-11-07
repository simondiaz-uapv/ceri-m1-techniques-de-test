package fr.univavignon.pokedex.api;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class PokemonTrainerTest {
    private PokemonTrainer red;
    private IPokedexFactory pokedexFactory;
    private IPokemonFactory pokemonFactory;
    private IPokemonMetadataProvider metadataProvider;
    @Before
    public void setUp() {
        pokedexFactory = mock(IPokedexFactory.class);
        pokemonFactory = mock(IPokemonFactory.class);
        metadataProvider = mock(IPokemonMetadataProvider.class);
        red = new PokemonTrainer("Red", Team.INSTINCT, pokedexFactory.createPokedex(metadataProvider, pokemonFactory));
    }

    @Test
    public void testGetName() {
        assertEquals("Red", red.getName());
    }

    @Test
    public void testGetTeam() {
        assertEquals(Team.INSTINCT, red.getTeam());
    }

    @Test
    public void testGetPokedex() {
        assertEquals(pokedexFactory.createPokedex(metadataProvider, pokemonFactory), red.getPokedex());
    }
}

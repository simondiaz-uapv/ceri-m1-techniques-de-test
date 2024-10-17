package fr.univavignon.pokedex.api;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

public class IPokedexFactoryTest {

    private IPokedexFactory pokedexFactory;
    private IPokemonMetadataProvider metadataProvider;
    private IPokemonFactory pokemonFactory;

    @Before
    public void setUp() {
        pokedexFactory = mock(IPokedexFactory.class);
        metadataProvider = mock(IPokemonMetadataProvider.class);
        pokemonFactory = mock(IPokemonFactory.class);
    }

    @Test
    public void testCreatePokedex() {
        IPokedex pokedex = mock(IPokedex.class);

        Mockito.when(pokedexFactory.createPokedex(metadataProvider, pokemonFactory)).thenReturn(pokedex);

        assertNotNull(pokedexFactory.createPokedex(metadataProvider, pokemonFactory));
    }
}
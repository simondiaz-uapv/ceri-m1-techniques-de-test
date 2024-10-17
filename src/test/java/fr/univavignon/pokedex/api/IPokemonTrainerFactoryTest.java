package fr.univavignon.pokedex.api;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class IPokemonTrainerFactoryTest {
    private IPokemonTrainerFactory pokemonTrainerFactory;
    private IPokedexFactory pokedexFactory;
    PokemonTrainer simon ;

    @Before
    public void setUp() {
        pokemonTrainerFactory = mock(IPokemonTrainerFactory.class);
        pokedexFactory = mock(IPokedexFactory.class);
        IPokemonMetadataProvider metadataProvider = mock(IPokemonMetadataProvider.class);
        IPokemonFactory pokemonFactory = mock(IPokemonFactory.class);
        simon  = new PokemonTrainer("Simon",Team.INSTINCT,pokedexFactory.createPokedex(metadataProvider, pokemonFactory));
    }

    @Test
    public void testCreatePokemonTrainer(){
        when(pokemonTrainerFactory.createTrainer("Simon",Team.INSTINCT,pokedexFactory)).thenReturn(simon);

        assertEquals(simon,pokemonTrainerFactory.createTrainer("Simon",Team.INSTINCT,pokedexFactory));

    }

}

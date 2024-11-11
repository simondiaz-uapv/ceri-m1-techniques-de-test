package fr.univavignon.pokedex.api;

import org.junit.Test;

public class PokedexFactoryTest {
    @Test
    public void testCreatePokedex() {
        PokedexFactory pokedexFactory = new PokedexFactory();
        IPokemonMetadataProvider metadataProvider = new PokemonMetadataProvider();
        IPokemonFactory pokemonFactory = new PokemonFactory();
        IPokedex pokedex = pokedexFactory.createPokedex(metadataProvider, pokemonFactory);
        assert pokedex.getClass() != Pokedex.class;
    }
}

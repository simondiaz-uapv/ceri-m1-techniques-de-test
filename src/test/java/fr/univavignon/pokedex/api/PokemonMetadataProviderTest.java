package fr.univavignon.pokedex.api;

import org.junit.Test;

public class PokemonMetadataProviderTest {

    @Test
    public void testGetPokemonMetadata() throws PokedexException {
        PokemonMetadataProvider pokemonMetadataProvider = new PokemonMetadataProvider();
        PokemonMetadata pokemonMetadata = pokemonMetadataProvider.getPokemonMetadata(0);
        assert(pokemonMetadata.getIndex() == 0);
        assert(pokemonMetadata.getName().equals("Dracaufeu"));
        assert(pokemonMetadata.getAttack() == 126);
        assert(pokemonMetadata.getDefense() == 126);
        assert(pokemonMetadata.getStamina() == 90);
    }
    @Test
    public void testGetPokemonMetadataException() {
        PokemonMetadataProvider pokemonMetadataProvider = new PokemonMetadataProvider();
        try {
            pokemonMetadataProvider.getPokemonMetadata(-1);
        } catch (PokedexException e) {
            assert(e.getMessage().equals("Index non correspondant a un pokemon"));
        }
    }
}

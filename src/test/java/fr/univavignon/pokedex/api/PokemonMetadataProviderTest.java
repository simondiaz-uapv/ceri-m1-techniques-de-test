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
    public void testGetPokemonMetadataExceptionInferieurA0() {
        PokemonMetadataProvider pokemonMetadataProvider = new PokemonMetadataProvider();
        try {
            pokemonMetadataProvider.getPokemonMetadata(-1);
            pokemonMetadataProvider.getPokemonMetadata(151);
        } catch (PokedexException e) {
            assert (e.getMessage().equals("Index non correspondant a un pokemon"));
            assert(e.getMessage().equals("Index non correspondant a un pokemon"));
        }
    }
    @Test
    public void testGetPokemonMetadataExceptionSuperieurA150() {
        PokemonMetadataProvider pokemonMetadataProvider = new PokemonMetadataProvider();
        try {
            pokemonMetadataProvider.getPokemonMetadata(151);
        } catch (PokedexException e) {
            assert(e.getMessage().equals("Index non correspondant a un pokemon"));
        }
    }
}

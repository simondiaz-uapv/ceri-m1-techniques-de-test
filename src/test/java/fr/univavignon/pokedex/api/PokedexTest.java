package fr.univavignon.pokedex.api;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PokedexTest {

    IPokemonMetadataProvider metadataProvider;
    IPokemonFactory pokemonFactory;
    Pokedex pokedex;
    @Before
    public void setUp() {
        metadataProvider = new PokemonMetadataProvider();
        pokemonFactory = new PokemonFactory();
        pokedex = new Pokedex((PokemonMetadataProvider) metadataProvider, (PokemonFactory) pokemonFactory);
    }

    @Test
    public void testSize() {
        assertEquals(0, pokedex.size());
    }

    @Test
    public void testAddPokemon() {
        Pokemon pokemon = new Pokemon(0, "Bulbizarre", 126, 126, 90, 613, 64, 4000, 4, 56);
        assertEquals(0, pokedex.addPokemon(pokemon));
    }
    @Test
    public void testGetPokemon() throws PokedexException {
        Pokemon pokemon = new Pokemon(0, "Bulbizarre", 126, 126, 90, 613, 64, 4000, 4, 56);
        pokedex.addPokemon(pokemon);
        assertEquals(pokemon, pokedex.getPokemon(0));
    }

    @Test
    public void testGetPokemonExceptionAvec0(){
        try {
            pokedex.getPokemon(0);
        } catch (PokedexException e) {
            assertEquals("Index de Pokemon invalide", e.getMessage());
        }
    }

    @Test
    public void addPokemon() throws PokedexException {
        Pokemon pokemon = new Pokemon(0, "Bulbizarre", 126, 126, 90, 613, 64, 4000, 4, 56);
        assertEquals(0, pokedex.addPokemon(pokemon));
        Pokemon pokemon2 = new Pokemon(0, "Bulbizarre", 126, 126, 90, 613, 64, 4000, 4, 56);
        assertEquals(pokemon2.getName(), pokedex.getPokemon(0).getName());
    }

    @Test
    public void getPokemons(){
        Pokemon pokemon = new Pokemon(0, "Bulbizarre", 126, 126, 90, 613, 64, 4000, 4, 56);
        pokedex.addPokemon(pokemon);
        assertEquals(pokemon, pokedex.getPokemons().get(0));
    }

    @Test
    public void createPokemon() throws PokedexException {
        Pokemon pokemon = pokedex.createPokemon(0, 126, 126, 90, 56);
        assertEquals("Bulbizarre", pokemon.getName());
        assertEquals(0, pokemon.getIndex());
        assertEquals(126, pokemon.getAttack());
        assertEquals(126, pokemon.getDefense());
        assertEquals(90, pokemon.getStamina());
        assertEquals(56, pokemon.getCandy());
    }

    @Test
    public void getPokemonMetadata() throws PokedexException {
        PokemonMetadata pokemonMetadata = pokedex.getPokemonMetadata(0);
        assertEquals("Bulbizarre", pokemonMetadata.getName());
        assertEquals(126, pokemonMetadata.getAttack());
        assertEquals(126, pokemonMetadata.getDefense());
        assertEquals(90, pokemonMetadata.getStamina());
    }
    @Test
    public void getPokemonMetadataException(){
        try {
            pokedex.getPokemonMetadata(-1);
        } catch (PokedexException e) {
            assert(e.getMessage().equals("Index non correspondant a un pokemon"));
        }
    }

    @Test
    public void getPokemonsComparator() {
        Pokemon pokemon = new Pokemon(0, "Bulbizarre", 126, 126, 90, 613, 64, 4000, 4, 56);
        pokedex.addPokemon(pokemon);
        Pokemon pokemon2 = new Pokemon(1, "Herbizarre", 126, 126, 90, 613, 64, 4000, 4, 56);
        pokedex.addPokemon(pokemon2);
        assertEquals(pokemon.getName(), pokedex.getPokemons((p1, p2) -> p1.getName().compareTo(p2.getName())).get(0).getName());
    }


}

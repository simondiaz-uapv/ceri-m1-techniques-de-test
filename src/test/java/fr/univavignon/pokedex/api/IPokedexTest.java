package fr.univavignon.pokedex.api;

import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class IPokedexTest {

    private IPokedex pokedex;
    private Pokemon bulbizarre;
    private Pokemon aquali;
    @Before
    public void setUp() {
        pokedex = mock(IPokedex.class);
        bulbizarre = new Pokemon(0, "Bulbizarre", 613, 64, 4000, 4, 126, 126, 90, 56.0);
        aquali = new Pokemon(133, "Aquali", 2729, 202, 5000, 4, 186, 168, 260, 100.0);
    }

    @Test
    public void testSize() {
        when(pokedex.size()).thenReturn(2);
        assertEquals(2, pokedex.size());
    }

    @Test
    public void testAddPokemon() {
        when(pokedex.addPokemon(bulbizarre)).thenReturn(0);
        when(pokedex.addPokemon(aquali)).thenReturn(1);
        assertEquals(0, pokedex.addPokemon(bulbizarre));
        assertEquals(1, pokedex.addPokemon(aquali));
    }

    @Test
    public void testGetPokemon() throws PokedexException {
        when(pokedex.getPokemon(0)).thenReturn(bulbizarre);
        when(pokedex.getPokemon(133)).thenReturn(aquali);
        assertEquals(bulbizarre, pokedex.getPokemon(0));
        assertEquals(aquali, pokedex.getPokemon(133));
    }

    @Test
    public void testGetPokemons() {
        List<Pokemon> pokemons = Arrays.asList(bulbizarre, aquali);
        when(pokedex.getPokemons()).thenReturn(pokemons);
        assertEquals(pokemons, pokedex.getPokemons());
    }

    @Test
    public void testGetPokemonsWithOrder() {
        List<Pokemon> pokemons = Arrays.asList(bulbizarre, aquali);
        when(pokedex.getPokemons(any())).thenReturn(pokemons);
        assertEquals(pokemons, pokedex.getPokemons(null));
    }
//
    @Test
    public void testPokedexException() throws PokedexException {
        when(pokedex.getPokemon(-2)).thenThrow(new PokedexException("INDEX NON VALIDE"));
        assertThrows(PokedexException.class, () -> pokedex.getPokemon(-2));    }
}
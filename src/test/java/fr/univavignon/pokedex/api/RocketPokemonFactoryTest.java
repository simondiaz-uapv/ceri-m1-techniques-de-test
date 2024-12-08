package fr.univavignon.pokedex.api;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RocketPokemonFactoryTest {
    @Test
    public void testCreatePokemon() throws PokedexException {
        RocketPokemonFactory pokemonFactory = new RocketPokemonFactory();
        Pokemon pokemon = pokemonFactory.createPokemon(1, 160, 150, 140, 100);
        assertEquals(pokemon.getIndex(), 1);
        assertEquals(pokemon.getName(), "Bulbasaur");
        assertTrue(pokemon.getAttack() <= 100 && pokemon.getAttack()>=0);
        assertTrue(pokemon.getDefense() <= 100 && pokemon.getDefense()>=0);
        assertTrue(pokemon.getStamina() <= 100 && pokemon.getStamina()>=0);
        assertEquals(pokemon.getCp(), 160);
        assertEquals(pokemon.getHp(), 150);
        assertEquals(pokemon.getDust(), 140);
        assertEquals(pokemon.getCandy(), 100);

        //Test création missigno
        Pokemon poekmon2 = pokemonFactory.createPokemon(3, 160, 150, 140, 100);
        assertEquals(poekmon2.getIndex(), 3);
        assertEquals(poekmon2.getName(), "MISSINGNO");
        assertTrue(poekmon2.getAttack() <= 100 && poekmon2.getAttack()>=0);
        assertTrue(poekmon2.getDefense() <= 100 && poekmon2.getDefense()>=0);
        assertTrue(poekmon2.getStamina() <= 100 && poekmon2.getStamina()>=0);
        assertEquals(poekmon2.getCp(), 160);
        assertEquals(poekmon2.getHp(), 150);
        assertEquals(poekmon2.getDust(), 140);
        assertEquals(poekmon2.getCandy(), 100);

        //Test création Pikachu de sasha
        Pokemon poekmon3 = pokemonFactory.createPokemon(-1, 160, 150, 140, 100);
        assertEquals(poekmon3.getIndex(), -1);
        assertEquals(poekmon3.getName(), "Ash's Pikachu");
        assertTrue(poekmon3.getAttack() <= 100 && poekmon3.getAttack()>=0);
        assertTrue(poekmon3.getDefense() <= 100 && poekmon3.getDefense()>=0);
        assertTrue(poekmon3.getStamina() <= 100 && poekmon3.getStamina()>=0);
        assertEquals(poekmon3.getCp(), 160);
        assertEquals(poekmon3.getHp(), 150);
        assertEquals(poekmon3.getDust(), 140);
        assertEquals(poekmon3.getCandy(), 100);
    }

    @Test
    public void testGenerateRandomStat() {
        int stat = RocketPokemonFactory.generateRandomStat();
        assertTrue(stat >= 0 && stat <= 100);
    }
}

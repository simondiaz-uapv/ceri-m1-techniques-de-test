package fr.univavignon.pokedex.api;

import org.junit.Test;

public class PokemonTrainerFactoryTest {
    @Test
    public void testCreateTrainer() {
        PokemonTrainerFactory pokemonTrainerFactory = new PokemonTrainerFactory();
        PokemonTrainer pokemonTrainer = pokemonTrainerFactory.createTrainer("Red", Team.MYSTIC, new PokedexFactory());
        assert pokemonTrainer.getName().equals("Red");
        assert pokemonTrainer.getTeam().equals(Team.MYSTIC);
        assert pokemonTrainer.getPokedex().getClass().equals(Pokedex.class);
    }
}

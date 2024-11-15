package fr.univavignon.pokedex.api;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Pokedex implements IPokedex {
    private List<Pokemon> listPokemons = new ArrayList<>();
    private PokemonMetadataProvider metadataProvider;
    private PokemonFactory pokemonFactory;

    public Pokedex(PokemonMetadataProvider metadataProvider, PokemonFactory pokemonFactory) {
        this.metadataProvider = metadataProvider;
        this.pokemonFactory = pokemonFactory;
    }

    @Override
    public int size() {
        return listPokemons.size();
    }

    @Override
    public int addPokemon(Pokemon pokemon) {
        listPokemons.add(pokemon);
        return listPokemons.size() - 1;
    }

    @Override
    public Pokemon getPokemon(int id) throws PokedexException {
        if (id < 0 || id >= listPokemons.size()) {
            throw new PokedexException("Index de Pokemon invalide");
        }
        return listPokemons.get(id);
    }

    @Override
    public List<Pokemon> getPokemons() {
        return new ArrayList<>(listPokemons);
    }

    @Override
    public List<Pokemon> getPokemons(Comparator<Pokemon> order) {
        List<Pokemon> sortedList = new ArrayList<>(listPokemons);
        sortedList.sort(order);
        return sortedList;
    }


    @Override
    public Pokemon createPokemon(int index, int cp, int hp, int dust, int candy) throws PokedexException {
        return this.pokemonFactory.createPokemon(index, cp, hp, dust, candy);
    }

    @Override
    public PokemonMetadata getPokemonMetadata(int index) throws PokedexException {
        return this.metadataProvider.getPokemonMetadata(index);
    }
}

package fr.univavignon.pokedex.api;

public class PokedexFactory implements IPokedexFactory {
    /**
     *
     * @param metadataProvider Metadata provider the created pokedex will use.
     * @param pokemonFactory Pokemon factory the created pokedex will use.
     * @return New pokedex instance.
     */
    @Override
    public IPokedex createPokedex(IPokemonMetadataProvider metadataProvider, IPokemonFactory pokemonFactory) {
        return new Pokedex((PokemonMetadataProvider) metadataProvider, (PokemonFactory) pokemonFactory);
    }
}

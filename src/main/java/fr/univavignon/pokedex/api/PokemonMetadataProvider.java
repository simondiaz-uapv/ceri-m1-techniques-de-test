package fr.univavignon.pokedex.api;

public class PokemonMetadataProvider implements IPokemonMetadataProvider{


    @Override
    public PokemonMetadata getPokemonMetadata(int index) throws PokedexException {
        if (index < 0 || index >= 151) {
            throw new PokedexException("Index non correspondant a un pokemon");
        }
        return new PokemonMetadata(index, "Dracaufeu", 126, 126, 90);
    }
}

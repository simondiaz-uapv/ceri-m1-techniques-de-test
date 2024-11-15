package fr.univavignon.pokedex.api;

import java.util.HashMap;
import java.util.Map;

public class PokemonMetadataProvider implements IPokemonMetadataProvider {

    private static final Map<Integer, PokemonMetadata> POKEMON_METADATA = new HashMap<>();

    static {
        POKEMON_METADATA.put(0, new PokemonMetadata(0, "Bulbizarre", 126, 126, 90));
        POKEMON_METADATA.put(133, new PokemonMetadata(133, "Aquali", 186, 168, 260));
    }

    @Override
    public PokemonMetadata getPokemonMetadata(int index) throws PokedexException {
        if (!POKEMON_METADATA.containsKey(index)) {
            throw new PokedexException("Index non correspondant a un pokemon");
        }
        return POKEMON_METADATA.get(index);
    }
}
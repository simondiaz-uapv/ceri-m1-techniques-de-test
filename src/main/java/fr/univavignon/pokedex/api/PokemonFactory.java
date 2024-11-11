package fr.univavignon.pokedex.api;

public class PokemonFactory implements IPokemonFactory{

    @Override
    public Pokemon createPokemon(int index, int cp, int hp, int dust, int candy) {
        return new Pokemon(index,"Mewtwo",160,150,140,cp,hp,dust,candy,100);
    }

}

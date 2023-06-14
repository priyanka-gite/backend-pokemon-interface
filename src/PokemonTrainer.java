import java.util.List;

public class PokemonTrainer {
    String name;
    List<Pokemon> pokemons;

    PokemonTrainer (String name) {
        this.name =  name;
    }
    public String getName(){
        return name;
    }
    public List<Pokemon> getPokemons (){
        return pokemons ;
    }
}

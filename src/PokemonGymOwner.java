import java.util.List;

public class PokemonGymOwner {
    String name;
    String town;
    List<Pokemon> pokemons;

    PokemonGymOwner(String name, String town, List<Pokemon> pokemons){
        this.name = name;
        this.town = town;
        this.pokemons = pokemons;
    }
    public String getName(){
        return name;
    }
    public String getTown() {
        return town;
    }
    public List<Pokemon> getPokemons(){
        return pokemons;
    }

    public void setName(String name) {
        this.name = name;
    }
}

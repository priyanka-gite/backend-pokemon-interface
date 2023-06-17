import java.util.List;
import java.util.Arrays;

public class FirePokemon extends Pokemon{
    private static final String type = "fire";

    private final List<String> attacks = Arrays.asList("Inferno", "PyroBall", "FireLash", "FlameThrower");

    FirePokemon(String name,int level, int hp, String food, String sound){
        super(name, hp, type,level, food,sound);
    }
    public List<String> getAttacks(){
        return attacks;
    }
    void inferno(Pokemon name, Pokemon enemy){

    };

     void pyroBall(Pokemon name, Pokemon enemy) {
    };

     void fireLash(Pokemon pokemon, Pokemon gymPokemon) {
    }

     void flameThrower(Pokemon pokemon, Pokemon gymPokemon) {
    }
}

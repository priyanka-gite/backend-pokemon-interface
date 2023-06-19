import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon{

    private static final String type = "water";
    private static final List<String> attacks = Arrays.asList("Surf", "HydroPump", "HydroCanon", "RainDance");
    WaterPokemon (String name, int level, int hp, String food,String sound){
        super(name, hp, type, level,food, sound);
    }
    public List<String> getAttacks(){
        return attacks;
    }
    public void surf(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void hydroPump(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void hydroCanon(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void rainDance(Pokemon pokemon, Pokemon gymPokemon) {
    }
}

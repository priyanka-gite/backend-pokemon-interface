import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon{
    private static final String type = "grass";
    private static final List<String> attacks = Arrays.asList("LeafStorm", "SolarBeam", "LeechSeed", "LeaveBlade");
    GrassPokemon (String name,int level,int hp, String food, String sound){
        super(name, hp,type, level, food, sound);

    }
    public List<String> getAttacks(){
        return attacks;
    }

    public void leafStorm(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void solarBeam(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void leechSeed(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void leaveBlade(Pokemon pokemon, Pokemon gymPokemon) {
    }
}

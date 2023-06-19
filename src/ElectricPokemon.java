import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {
    private static final String type = "electric";
    private static final List<String> attacks = Arrays.asList("ThunderPunch", "ElectroBall", "Thunder", "VoltTackle");
    ElectricPokemon(String name,int level, int hp, String food, String sound) {
        super(name, hp,type, level, food, sound);
    }
    public List<String> getAttacks(){
        return attacks;
    }

    public void thunderPunch(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void electroBall(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void thunder(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void voltTackle(Pokemon pokemon, Pokemon gymPokemon) {
    }
}
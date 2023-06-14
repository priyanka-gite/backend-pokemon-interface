public class Pokemon {
    String name;
    int hp;
    String type;
    String attacks;

    Pokemon (String name,int hp, String type, String attacks) {
        this.name =  name;
        this.hp = hp;
        this.type = type;
        this.attacks = attacks;

    }
    public String getName(){
        return name;
    }
    public int getHp(){
        return hp;
    }
    public String getType(){
        return type;
    }

    public String getAttacks() {
        return attacks;
    }
}

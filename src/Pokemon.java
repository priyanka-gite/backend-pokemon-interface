public abstract class Pokemon {
    private final String name;
    private int hp;
    private final String type;
    private final int level;
    private final String food;
    private final String sound;

    Pokemon (String name, int hp, String type, int  level, String food, String sound ) {
        this.name =  name;
        this.hp = hp;
        this.type = type;
        this.level = level;
        this.food = food;
        this.sound = sound;
    }
    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }

    public String getFood() {
        return food;
    }

    public String getSound() {
        return sound;
    }
}

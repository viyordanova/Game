public abstract class Character {
    String name;
    int health;
    int power;
    String profession;

    public Character(String name,int health,int power,String profession){
        this.name = name;
        this.health = health;
        this.power = power;
        this.profession = profession;
    }

    abstract void attack();
    abstract void defend();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}

public class Dwarf extends Character{

    int levelOfDamage;
    int recovery;
    int levelOfBlood;

    public Dwarf(String name,int health,int power,String profession,int levelOfDamage,int recovery,int levelOfBlood){
        super(name,health,power,profession);
        this.levelOfDamage = levelOfDamage;
        this.recovery = recovery;
        this.levelOfBlood = levelOfBlood;
    }

    void attack(){
        for(int i=0;i<5;i++){
            power +=10;
        }
        System.out.println("Power of "+name+": "+power);
    }

    void defend(){
        for(int i=0;i<5;i++){
            health -= 10;
            int s = 100 - health;

            levelOfBlood-=10;
            levelOfDamage+=10;
            if(health==0){
                health+=s;
            }
        }
        System.out.println("Health of the character: "+health+ " Level of damage: "+levelOfDamage+" Level of blood: "+levelOfBlood);
    }
}

public class Monster {
    String name;
    int health;
    int power;
    String type;

    public Monster(String name,int health,int power,String type){
        this.name = name;
        this.health = health;
        this.power = power;
        this.type = type;
    }

    void attack(){
        for(int i=0;i<5;i++){
            power+=1;
            health -= 15;
        }
        System.out.println("Power of the monster: "+power+" Level of health: "+ health);
    }
}

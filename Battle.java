public class Battle {
    public static void main(String[] args) {
        Character character = new Human("Vasko",100,50,"Paladin",0,0,100);
        Monster monster = new FallenShaman("shaman",90,30,"Shaman");

        character.attack();
        monster.attack();
        character.defend();
        if(character.health > monster.health){
            System.out.println("The winner is: "+character.name);
        }
        else{
            System.out.println("The winner is: "+monster.name);
        }
    }
}

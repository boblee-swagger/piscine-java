import java.util.ArrayList;
import java.util.List;

public class Character {
    private final int maxHealth;
    private int currentHealth;
    private final String name;
    private static List<Character> allCharacters = new ArrayList<>();

    public Character(String name, int maxHealth){
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        this.allCharacters.add(this);
    }

    public int getMaxHealth(){
        return this.maxHealth;
    }

    public int getCurrentHealth(){
        return this.currentHealth;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString(){
        if (this.currentHealth == 0){
            return String.format("%s : KO", this.name);
        }
        return String.format("%s : %d/%d", this.name, this.currentHealth, this.maxHealth);
    }

    public void takeDamage(int n){
        if (this.currentHealth - n > 0){
            this.currentHealth -= n;
        }else{
            this.currentHealth = 0;
        }
    }

    public static void attack(Character player){
        player.takeDamage(9);
    }

    public static String printStatus(){
        StringBuilder output = new StringBuilder();
        if (!Character.allCharacters.isEmpty()){
            output.append("------------------------------------------\n");
            output.append("Characters currently fighting :\n");
            for (Character character : Character.allCharacters) {
                output.append(String.format(" - %s\n", character.toString()));
            }
            output.append("------------------------------------------");
        }else{
            output.append("------------------------------------------\n");
            output.append("Nobody's fighting right now !\n");
            output.append("------------------------------------------");
        }
        return output.toString();
    }

    public static Character fight(Character player1, Character player2){

        while(player2.currentHealth > 0 && player1.currentHealth > 0){
            Character.attack(player2);
            if (player2.currentHealth <= 0){
                return player1;
            }

            Character.attack(player1);
            if (player1.currentHealth <= 0){
                return player2;
            }
        }
        return null;
    }
}
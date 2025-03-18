public class Character {
    private final int maxHealth;
    private int currentHealth;
    private final String name;

    public Character(String name, int maxHealth){
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
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
        if (this.currentHealth > 0){
            this.currentHealth -= n;
        }
    }

    public static void attack(Character player){
        player.takeDamage(9);
    }


}
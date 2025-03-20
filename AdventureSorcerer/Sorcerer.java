public class Sorcerer extends Character implements Healer {
    
    private int healCapacity;
    public Sorcerer(String name, int maxHealth, int healCapacity){
        super(name, maxHealth);
        this.healCapacity = healCapacity;
    }

    @Override
    public int getHealCapacity(){
        return this.healCapacity;
    }

    @Override
    public void heal(Character character){
        if (this.healCapacity + this.currentHealth <= this.getMaxHealth() ){
            character.currentHealth += this.healCapacity;
        }
    }

    @Override
    public String toString(){
        if (this.currentHealth <= 0){
            return String.format("%s is a sorcerer with %d HP. It can heal %d HP.", this.getName(), this.getCurrentHealth(), this.healCapacity);
        }
        return String.format("%s is a dead sorcerer. So bad, it could heal %d HP.", this.getName(), this.healCapacity);
    }



}
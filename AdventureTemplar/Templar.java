public class Templar extends Character implements Tank, Healer {
    private final int shield;
    private final int healCapacity;
    public Templar(String name, int maxHealth, int healCapacity, int shield){
        super(name, maxHealth);
        this.shield = shield;
        this.healCapacity = healCapacity;
    }

    @Override
    public int getHealCapacity(){
        return this.healCapacity;
    }

    @Override
    public void heal(Character character){
        if (this.healCapacity + character.getCurrentHealth() <= character.getMaxHealth() ){
            character.setCurrentHealth(this.healCapacity + character.getCurrentHealth());
        }else{
            character.setCurrentHealth(character.getMaxHealth());
        }
    }

    @Override
    public int getShield(){
        return this.shield;
    }


    @Override
    public String toString(){
        if (this.getCurrentHealth() > 0){
            return String.format("%s is a strong Templar with %d HP. It can heal %d HP and has a shield of %d.", this.getName(), this.getCurrentHealth(), this.healCapacity, this.shield);
        }
        return String.format("%s has been beaten, even with its %d shield. So bad, it could heal %d HP.", this.getName(), this.healCapacity, this.shield);
    }



}
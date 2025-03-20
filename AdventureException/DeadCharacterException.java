public class DeadCharacterException extends  Exception {
    private Character character;
    public DeadCharacterException(Character character){
        this.character = character;   
    }

    @Override
    public String getMessage(){
        String name;
        if (this.character.)
        return String.format("The <sorcerer | monster | templar> %s is dead.", this.character.getName());
    }
}
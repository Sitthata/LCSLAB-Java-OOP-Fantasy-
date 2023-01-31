public class Player extends Charactor{
    private int gold;
    private int potion;

    public Player(String name) {
        super(name);
    }

    public void usePotion() {
        if(this.potion > 0){
            // Collect Health from character
            int currentHealth = this.getHealth();
            int healAmount = currentHealth + 20;
            this.setHealth(healAmount);
        }
    }

    public void takeGold(int goldAmount){
        this.gold += goldAmount;
    }

    public int openGoldBag() {
        return this.gold;
    }
}

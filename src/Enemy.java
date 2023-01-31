
public class Enemy extends Charactor{

    public Enemy(String name, int health) {
        super(name);
        this.setHealth(health);
    }

    public void dropGold(Player player) {
        if(!this.isAlive()){
            player.takeGold(this.getLevel() * 10);
        }
    }
}

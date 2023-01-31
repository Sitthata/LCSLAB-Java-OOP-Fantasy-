public class Charactor {

    private String name;
    private int health;
    private int attackDamage;
    private int level;


    public Charactor(String name) {
        this.name = name;
        this.health = 100;
        this.level = 1;
        this.attackDamage = this.level * 10;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public int getLevel() {
        return level;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Charactor{");
        sb.append("name='").append(name).append('\'');
        sb.append(", health=").append(health);
        sb.append(", attackDamage=").append(attackDamage);
        sb.append(", level=").append(level);
        sb.append(", isAlive?=").append(isAlive());
        sb.append('}');
        return sb.toString();
    }

    public void takeDamage(int damage) {
        this.setHealth(this.getHealth() - damage);
    }

    public String attack(Charactor enemy) {
        if(this.level < enemy.level) {
            this.takeDamage(enemy.attackDamage);
            return "Too Strong! I'm hurt!";
        }
        enemy.takeDamage(this.attackDamage);
        return this.getName() + " Attack " + enemy.name + " for " + this.attackDamage + " Damage!";
    }

    public void levelUp() {
        this.level++;
        this.health += 20;
    }

    public boolean isAlive() {
        return this.health > 0;
    }



}

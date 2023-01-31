public class Main {
    public static void main(String[] args) {
        Player player = new Player("Hero");
        Enemy enemy1 = new Enemy("Elf", 50);

        System.out.println(player);
        System.out.println(enemy1);

        for (int i = 0; i < 5; i++) {
            player.attack(enemy1);
        }

        System.out.println(enemy1);
        enemy1.dropGold(player);

        System.out.println(player.openGoldBag());


    }
}
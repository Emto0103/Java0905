package chp08.ex8_9;

public class MonsterTest {
    public static void main(String[] args) {
        Monster orc = new Monster("오크");
        Monster skeleton = new Monster("해골");
        Monster.battle(orc, skeleton);
    }
}

class Monster {
    private String name;
    private int hp;
    private static int maxhp = 30;

    public Monster(String s) {
        this.name = s;
        this.hp = maxhp; // Initialize hp to maxhp
    }

    public void attack(Monster enemy) {
        // Example attack logic, reduce enemy's hp by a fixed amount
        int damage = 5; // Fixed damage for simplicity
        enemy.hp -= damage;
        System.out.println(this.name + " attacks " + enemy.name + " for " + damage + " damage!");
        if (enemy.hp < 0) enemy.hp = 0; // Ensure hp doesn't go negative
    }

    public static void battle(Monster a, Monster b) {
        while (a.hp > 0 && b.hp > 0) {
            Monster attacker = (Math.random() < 0.5) ? a : b;
            Monster defender = (attacker == a) ? b : a;
            attacker.attack(defender);
            System.out.println(defender.name + " has " + defender.hp + " HP left.");
        }

        // Declare winner
        if (a.hp <= 0 && b.hp <= 0) {
            System.out.println("It's a draw!");
        } else if (a.hp <= 0) {
            System.out.println(b.name + " wins!");
        } else {
            System.out.println(a.name + " wins!");
        }
    }
}

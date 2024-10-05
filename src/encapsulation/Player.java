package encapsulation;

public class Player {
    public String name;
    public int health;
    public String weapon;

    public Player(String name,int health, String weapon) {
        this.name = name;
        this.health = 100;
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        health -= damage;
        if (health <= 0) {
            System.out.println("Player knocked out of game");
            this.health = 0;
        }
    }

    public int healthRemaining() {
        return this.health;
    }

    public void restoreHealth(int extraHealth) {
        this.health += extraHealth;
        if (health > 100) {
            System.out.println("Player restored to 100%");
            this.health = 100;
        }
    }
}

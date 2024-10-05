package encapsulation;

public class EnhancedPlayer {
    private String name;
    private int health;
    private String weapon;

    public EnhancedPlayer(String name,int health, String weapon) {
        this.name = name;
        this.weapon = weapon;
        if (health > 0 && health <= 100) {
            this.health = health;
        }else{
            throw new RuntimeException("Health must between 1 and 100");
        }
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

    @Override
    public String toString() {
        return "EnhancedPlayer{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}

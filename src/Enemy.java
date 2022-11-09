public class Enemy implements Mortal{
    private int health;
    public Enemy (int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        health -= damage;
        System.out.println("hit by " + damage + "hp");
    }

    @Override
    public String isAlive() {
        return (health>0)?"alive":"dead";
    }
}

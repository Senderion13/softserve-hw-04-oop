public class Mage extends Hero{
    private String name;
    public Mage(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Mage " + name + " attacks enemy!");
        enemy.takeDamage(7);
    }
}

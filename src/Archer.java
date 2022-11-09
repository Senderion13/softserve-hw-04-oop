public class Archer extends Hero{
    private String name;
    public Archer(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Archer " + name + " attacks enemy!");
        enemy.takeDamage(3);
    }
}
